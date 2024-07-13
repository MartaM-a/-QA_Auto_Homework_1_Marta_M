import java.util.Scanner;

public class MagicalApple {

    public static void main (String[] args) {


        Scanner scanner = new Scanner(System.in); {
            System.out.println( "What time is it?");

        int hour = scanner.nextInt();
        if (hour >= 6 && hour < 12) {
            System.out.println ( "10 units of energy" );
        } else if (hour >= 12 && hour < 18) {
            System.out.println ( "20 units of energy" );
        } else if (hour >= 18 && hour < 24) {
            System.out.println ( "30 units of energy" );
        } else if (hour >= 0 && hour < 6) {
            System.out.println ( "5 units of energy" );
        } else {
            System.out.println ( "WRONG TIME!" );
        }
    }
    }
}
