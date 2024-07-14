

public class StrongestRobot {

    public static void main(String[] args) {

        int[] weights = {300, 450, 200, 500, 350};


        int max = weights[0];
        int strongestRobot = 0;
        for (int i = 1; i < weights.length; i++) {
            if (weights[i] > max)
                max = weights[i];
                strongestRobot = i;
        }

                System.out.println("The strongest robot number  " + strongestRobot + " lifted a weight " + max + " kg");


            }


        }




