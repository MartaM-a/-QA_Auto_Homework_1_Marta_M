import java.util.List;

public interface UserInterface {
    String getUserName();
    List<UserInterface> getContacts();
    List<MessageInterface> getMessages();
    void addContact(UserInterface user);
    void sendMessage(UserInterface receiver, String text);
    void receiveMessage(MessageInterface message);
}
