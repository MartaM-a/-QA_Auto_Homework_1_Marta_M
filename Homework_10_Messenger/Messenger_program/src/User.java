import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User implements UserInterface {
    private String userName;
    private Set<UserInterface> contacts;
    private List<MessageInterface> messages;

    public User(String userName) {
        this.userName = userName;
        this.contacts = new HashSet<>();
        this.messages = new ArrayList<>();
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public List<UserInterface> getContacts() {
        return new ArrayList<>(contacts);
    }

    @Override
    public List<MessageInterface> getMessages() {
        return messages;
    }

    @Override
    public void addContact(UserInterface user) {
        contacts.add(user);
    }

    @Override
    public void sendMessage(UserInterface receiver, String text) {
        Message message = new Message(this, receiver, text);
        receiver.receiveMessage(message);
        this.messages.add(message);
    }

    @Override
    public void receiveMessage(MessageInterface message) {
        message.setStatus(MessageStatus.RECEIVED);
        this.messages.add(message);
    }

    public void readMessage(MessageInterface message) {
        if (message.getReceiver().equals(this)) {
            message.setStatus(MessageStatus.READ);
        }
    }
}
