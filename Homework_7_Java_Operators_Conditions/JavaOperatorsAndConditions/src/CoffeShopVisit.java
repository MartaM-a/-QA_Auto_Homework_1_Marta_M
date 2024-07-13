import java.util.Scanner;

public class CoffeShopVisit {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int espresso_pr = 3;
        int latte_pr = 4;
        int cappuccino_pr = 5;

        System.out.println("How many cups of espresso would you like to order?");
        int espresso = scanner.nextInt();
        System.out.println("How many cups of latte would you like to order?");
        int latte = scanner.nextInt();
        System.out.println("How many cups of cappuccino would you like to order?");
        int cappuccino = scanner.nextInt();

        int total = (espresso * espresso_pr) + (latte * latte_pr) + (cappuccino * cappuccino_pr);
        System.out.println("Cost of your order is: " + total);


    }
}


