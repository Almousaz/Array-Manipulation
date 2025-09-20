import java.util.Arrays;

public class ShiftRightKPosition {
    public static void main(String[] args) {

// Shift Right by k positions

        int[] numbers = {10, 20, 30, 40, 50, 60};

//        {10,20,30,40,50,60} -> {0,0,10,20,30,40}

        int k = 2;

        for (int x = numbers.length - 1; x >= k; x--) {
            numbers[x] = numbers[x - k];

        }
        for (int i = 0; i < k; i++) {
            numbers[i] = 0;
        }
        System.out.println("After shift " + Arrays.toString(numbers));

        int[] numbersOfHumans = {2, 4, 6, 8, 10, 12};

//        {2, 4, 6, 8, 10, 12} -> {0, 0, 0, 2, 4, 6}

        int n = 3;

        for (int z = numbersOfHumans.length - 1; z >= n; z--) {
            numbersOfHumans[z] = numbersOfHumans[z - n];
        }
        for (int i = 0; i < n; i++) {
            numbersOfHumans[i] = 0;
        }
        System.out.println("after shift " + Arrays.toString(numbersOfHumans));



        int[] numberOfPayment = {20, 30, 40, 50, 60, 70};
        int g = 2;
//        {0 ,0 ,20 ,30,40,50}

        for (int x = numberOfPayment.length - 1; x >= g; x--) {
            numberOfPayment[x] = numberOfPayment[x - g];
        }
        for (int i = 0; i < g; i++) {
            numberOfPayment[i] = 0;
        }
        System.out.println("after shift " + Arrays.toString(numberOfPayment));
















    }
}
