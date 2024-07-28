public class Message implements MessageInterface {
    private UserInterface sender;
    private UserInterface receiver;
    private String text;
    private MessageStatus status;

    public Message(UserInterface sender, UserInterface receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.status = MessageStatus.SENT;
    }

    @Override
    public UserInterface getSender() {
        return sender;
    }

    @Override
    public UserInterface getReceiver() {
        return receiver;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public MessageStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(MessageStatus status) {
        this.status = status;
    }
}