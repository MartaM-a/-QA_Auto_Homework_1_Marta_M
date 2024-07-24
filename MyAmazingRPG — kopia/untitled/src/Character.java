public class Character {


    static int totalCharacterCount;

    public Character() {
        totalCharacterCount++;

    }


    //public static void main(String[] args) {

        String name;
        int health;
        int strenght;
        int defense;



    public void takeDamege(int damage) {
        this.health -= damage;

    }

    public void attack (Character other) {
        other.takeDamege(this.strenght - other.defense);

    }


    public boolean isAlive() {
       return this.health > 0;

    }

    public void displayStatus () {

        System.out.println("           Name " + this.name);
        System.out.println("           Health " + this.health);
        System.out.println("           Strenght " + this.strenght);
        System.out.println("           Defense " + this.defense);
    }


    }



//Методи
///void attack(Character other): Імітує атаку на іншого персонажа other. Шкода (damage),
// яка завдається, дорівнює силі (strength) атакуючого мінус захист (defense) того, хто
// захищається (але не менше 0).
//void takeDamage(int damage): Зменшує здоров'я персонажа на величину шкоди (напр. якщо
// персонаж отримав 5 демеджу - його власне здоров*я зменшиться на 5).
///boolean isAlive(): Повертає true, якщо здоров'я персонажа більше 0, інакше false.
//void displayStatus(): Виводить на екран ім'я персонажа, його здоров'я, силу та захист.