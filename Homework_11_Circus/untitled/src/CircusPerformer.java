import java.util.Scanner;

public class CircusPerformer {
    private String name;
    private String act;
    private int experience;

    public CircusPerformer(String name, String act, int experience) {
        this.name = name;
        this.act = act;
        setExperience(experience); // Викликаємо метод для встановлення досвіду
    }

    @RunImmediately(times = 3)
    public String getInfo() {
        return "Name: " + name + ", Act: " + act + ", Experience: " + experience + " years";
    }

    @Override
    public String toString() {
        return name + "," + act + "," + experience;
    }

    private void setExperience(int experience) {
        while (true) {
            try {
                if (experience < 0 || experience > 50) {
                    throw new InvalidExperienceException("Experience must be between 0 and 50 years.");
                }
                this.experience = experience;
                break; // Виходимо з циклу, якщо досвід правильний
            } catch (InvalidExperienceException e) {
                System.out.println(e.getMessage());
                experience = askForExperience(); // Запитуємо користувача знову
            }
        }
    }

    private int askForExperience() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter valid experience (0-50): ");
        return scanner.nextInt();
    }

    public static CircusPerformer createPerformer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter act: ");
        String act = scanner.nextLine();

        System.out.print("Enter experience: ");
        int experience = scanner.nextInt();

        return new CircusPerformer(name, act, experience);
    }
}