public class StrongestRobot {

    public static void main(String[] args) {

        int[] weights = {300, 450, 400, 500, 350};
        int max = weights[0];
        for (int i = 1; i < weights.length; i++) max = Math.max(max, weights[i]);

            System.out.println("The strongest robot lifted a weight of " + max + " kg" );


}


}
