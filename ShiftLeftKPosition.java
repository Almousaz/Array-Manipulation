import java.util.Arrays;

public class ShiftLeftKPosition {

    public static void main(String[] args) {


//        Shift Left by k positions

//        [10, 20, 30, 40, 50]
//        Shift Left by 2 → [30, 40, 50, 0, 0]

        int[] numbers = {10, 20, 30, 40, 50, 60};
//        {10,20,30,40,50,60} -> {30,40,50,60 , 0 , 0 }
        int k = 2;

        for (int x = 0; x < numbers.length - k; x++) {
            numbers[x] = numbers[x + k];

        }
        for (int i = numbers.length - k; i < numbers.length; i++) {
            numbers[i] = 0;
        }
        System.out.println("After shift" + Arrays.toString(numbers));


        int[] numbersOfBook = {5, 6, 7, 8, 9, 10, 11, 12};
        int kk = 3;

        for (int j = 0; j < numbersOfBook.length - kk; j++) {
            numbersOfBook[j] = numbersOfBook[j + kk];
        }
        for (int n = numbersOfBook.length - kk; n < numbersOfBook.length; n++) {
            numbersOfBook[n] = 0;
        }
        System.out.println("after shift by " + kk + Arrays.toString(numbersOfBook));



        int[] numbersOfCar = {10, 11, 12, 13, 14, 15, 16};
        int m = 2;

        for (int x = 0; x < numbersOfCar.length - m; x++) {
            numbersOfCar[x] = numbersOfCar[x + m];
        }
        for (int i = numbersOfCar.length - m; i < numbersOfCar.length; i++) {
            numbersOfCar[i] = 0;
        }
        System.out.println("After shift " + Arrays.toString(numbersOfCar));

















    }

}
