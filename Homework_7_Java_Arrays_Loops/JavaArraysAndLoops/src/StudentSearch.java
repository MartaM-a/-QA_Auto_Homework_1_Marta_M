import java.util.Scanner;

public class StudentSearch {

    public static void main(String[] args) {


        int[] studentIDs = {12345, 67890, 54321, 98765, 24680};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pleas enter the number of grade transcript: ");
        int searchID = scanner.nextInt();

        for (int i = 1; i < studentIDs.length; i++);{

        if (searchID == studentIDs[0]) {

            System.out.println("Student grade transcript wos found: " + searchID);
        }
        else
        {
            System.out.println("Student grade transcript wos not found: ");}

        }


    }

}
