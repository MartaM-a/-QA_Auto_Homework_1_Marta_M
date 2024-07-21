import java.util.Scanner;

public class ChoiseOfDish {




        Scanner scanner = new Scanner(System.in);


        System.out.println("Pleas select type of dishes 1 -snack, 2 -main, 3- dessert, 4 -drink");
        int type_of_dish = scanner.nextInt();

        String dish;
        switch (type_of_dish) {
            case 1: {
                System.out.println("Your selected dish is: Chips");
                break;
            }
            case 2: {
                System.out.println("Your selected dish is: Pasta");
                break;
            }
            case 3: {
                System.out.println("Your selected dish is: Canneloni");
                break;
            }
            case 4: {
                System.out.println("Your selected dish is: Margaritta");
                ;
                break;
            }
            default: {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                break;
            }

            
        }
    }
}