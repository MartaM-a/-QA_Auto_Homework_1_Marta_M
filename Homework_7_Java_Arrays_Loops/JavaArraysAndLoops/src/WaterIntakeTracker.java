public class WaterIntakeTracker {
    public static void main(String[] args) {

        int[] WaterIntake = {3, 1, 4, 2, 0, 5, 2};
        int sum = 0;
        int i = 0;

        while (i < WaterIntake.length) {

            sum += WaterIntake[i];
            i++;
        }

        System.out.println("Total number of glasses of water drunk in a week: " + sum);


    }
}



