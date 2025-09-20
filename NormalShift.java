import java.util.Arrays;

public class NormalShift {
    public static void main(String[] args) {

//        Shift normal  // Shift right by 1

        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println( "Before shift " + Arrays.toString(numbers));

        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = 0;

        System.out.println("After Shift " + Arrays.toString(numbers));

        // Shift right by 2

        int[] numbersOfGifts = {4, 5, 6, 8, 10, 15};
        System.out.println( "Before shift " + Arrays.toString(numbersOfGifts));

        int j = 2;

        for (int x = 0; x < j; x++) {
            for (int i = numbersOfGifts.length - 1; i > 0; i--) {
                numbersOfGifts[i] = numbersOfGifts[i - 1];
            }
            numbersOfGifts[0] = 0;
        }
        System.out.println( "After shift by " + j  +  " : "+ Arrays.toString(numbersOfGifts));

//        Shift normal  // Shift left by 1

        int[] numbersOfGlass = {20, 40, 60, 80, 100};
        System.out.println( "Before shift " + Arrays.toString(numbersOfGlass));

        for (int i = 0 ; i < numbersOfGlass.length - 1 ; i++) {
            numbersOfGlass[i] = numbersOfGlass[i + 1];
        }
        numbersOfGlass[numbersOfGlass.length - 1] = 0;

        System.out.println("After Shift " + Arrays.toString(numbersOfGlass));











    }
}
