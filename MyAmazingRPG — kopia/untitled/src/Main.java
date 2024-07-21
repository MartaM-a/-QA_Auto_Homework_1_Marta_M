//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Character Unicorn = new Character();
        Unicorn.name = "Єдиноріг";
        Unicorn.health = 60;
        Unicorn.strenght = 30;
        Unicorn.defense = 10;


        System.out.println("UNICORN " + Unicorn.name);
        System.out.println("Здоров'я " + Unicorn.health);
        System.out.println("Сила " + Unicorn.strenght);
        System.out.println("Захист " + Unicorn.defense);

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Character Pony = new Character();

        Pony.name = "Понік";
        Pony.health = 60;
        Pony.strenght = 40;
        Pony.defense = 10;

        System.out.println("Pony " + Pony.name);
        System.out.println("Здоров'я " + Pony.health);
        System.out.println("Сила " + Pony.strenght);
        System.out.println("Захист " + Pony.defense);


        System.out.println("You create " + Character.totalCharacterCount + " Characters");
        System.out.println("*********************************");
        while (Unicorn.isAlive() && Pony.isAlive()) {
            Unicorn.attack(Pony);
            System.out.println(Unicorn.name + " is attacking " + Pony.name);
            Unicorn.displayStatus();
            System.out.println("---");
            Pony.displayStatus();
            System.out.println("-------------------------------");
            if (!Pony.isAlive()) break;

            Pony.attack(Unicorn);
            System.out.println(Pony.name + " is attacking " + Unicorn.name);
            Unicorn.displayStatus();
            Pony.displayStatus();
            System.out.println("-------------------------------");
        }

        // Виведення результату битви
        if (!Unicorn.isAlive()) {
            System.out.println(Unicorn.name + " is out of game");
        }

        if (!Pony.isAlive()) {
            System.out.println(Pony.name + " is out of game");
        }
    }
}



















