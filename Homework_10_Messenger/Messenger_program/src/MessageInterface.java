
public interface MessageInterface {
    UserInterface getSender();
    UserInterface getReceiver();
    String getText();
    MessageStatus getStatus();
    void setStatus(MessageStatus status);
}

