import java.util.Arrays;

public class Pow {
    public static void main(String[] args) {
        double[] someArr = {2.0, 3.0};
        System.out.println("powArray is " + Arrays.toString(powArray(someArr, 2)));


        int[] scoresList = {1, 2,1,4,5,3,2,1,7,7};
        System.out.println("counted scores " + Arrays.toString(histogram(scoresList, 10)));
    }

    public static double[] powArray(double[] numbersList, int pow) {
        double[] poweredNumbersList = new double[numbersList.length];

        for (int i = 0; i < numbersList.length; i++) {
            poweredNumbersList[i] = Math.pow(numbersList[i], pow);
        }

        return poweredNumbersList;
    }

    public static int[] histogram(int[] scoresList, int counterAmount) {
        int[] countersList = new int[counterAmount];

        for (int i = 0; i < scoresList.length; i++) {
            countersList[scoresList[i]]++;
        }

        return countersList;
    }
}