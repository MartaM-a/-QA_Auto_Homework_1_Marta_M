import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User alex = new User("Alex");
        User ira = new User("Ira");
        User ola = new User("Olia");
        User marta = new User ("Marta");


        alex.addContact(ira);
        alex.addContact(ola);
        ira.addContact(alex);
        ola.addContact(alex);
        marta.addContact(ola);
        marta.addContact(alex);
        ola.addContact(marta);


        alex.sendMessage(ira, "Hi, have you done your java homework?");
        ira.sendMessage(alex, " Ні Alex! It's so complicated, I've been studying it for so long. I haven't done it yet. And you?");
        ola.sendMessage(alex, "Hi Alex! Tell me how to write this messenger program");
        marta.sendMessage(ola, "Hi Olia, I heard that you have some problems with homework");
        ola.sendMessage(marta, "Hi, I give up with this  messenger program!");
        marta.sendMessage(ola, "Try to ask AI, it will give you some advice.");
        alex.sendMessage(ira, "It was a piece of cake for me!");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username (choose one : alex, marta, ira, olia) : ");
        String userName = scanner.nextLine();

        User currentUser = getUserByName(userName, alex, marta, ira, ola);

        if (currentUser != null) {

            System.out.println("Contacts for " + currentUser.getUserName() + ":");
            for (UserInterface contact : currentUser.getContacts()) {
                System.out.println(contact.getUserName());
            }


            System.out.println("\nMessages for " + currentUser.getUserName() + ":");
            for (MessageInterface message : currentUser.getMessages()) {
                System.out.println(message.getSender().getUserName() + ": " + message.getText() + " [" + message.getStatus() + "]");
            }


            for (MessageInterface message : currentUser.getMessages()) {
                if (message.getReceiver().equals(currentUser)) {
                    currentUser.readMessage(message);
                }
            }

            // Вивід списку повідомлень після прочитання
            System.out.println("\nMessages for " + currentUser.getUserName() + " after reading:");
            for (MessageInterface message : currentUser.getMessages()) {
                System.out.println(message.getSender().getUserName() + ": " + message.getText() + " [" + message.getStatus() + "]");
            }
        } else {
            System.out.println("User not found.");
        }
    }

    private static User getUserByName(String name, User... users) {
        for (User user : users) {
            if (user.getUserName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }
}