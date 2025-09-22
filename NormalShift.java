import java.util.Arrays;

public class NormalShift {
    public static void main(String[] args) {

//        Shift normal  // Shift right by 1

//        int[] numbers = {10, 20, 30, 40, 50};
//        System.out.println( "Before shift " + Arrays.toString(numbers));
//
//        for (int i = numbers.length - 1; i > 0; i--) {
//            numbers[i] = numbers[i - 1];
//        }
//        numbers[0] = 0;
//
//        System.out.println("After Shift " + Arrays.toString(numbers));
//
//        // Shift right by 2
//
//        int[] numbersOfGifts = {4, 5, 6, 8, 10, 15};
//        System.out.println( "Before shift " + Arrays.toString(numbersOfGifts));
//
//        int j = 2;
//
//        for (int x = 0; x < j; x++) {
//            for (int i = numbersOfGifts.length - 1; i > 0; i--) {
//                numbersOfGifts[i] = numbersOfGifts[i - 1];
//            }
//            numbersOfGifts[0] = 0;
//        }
//        System.out.println( "After shift by " + j  +  " : "+ Arrays.toString(numbersOfGifts));
//
////        Shift normal  // Shift left by 1
//
//        int[] numbersOfGlass = {20, 40, 60, 80, 100};
//        System.out.println( "Before shift " + Arrays.toString(numbersOfGlass));
//
//        for (int i = 0 ; i < numbersOfGlass.length - 1 ; i++) {
//            numbersOfGlass[i] = numbersOfGlass[i + 1];
//        }
//        numbersOfGlass[numbersOfGlass.length - 1] = 0;
//
//        System.out.println("After Shift " + Arrays.toString(numbersOfGlass));

        int[] values = {4, 5, 6, 7, 8, 9};

        for (int i = values.length - 1; i > 0; i--) {
            values[i] = values[i - 1];
        }
        values[0] = 0;
        System.out.println(Arrays.toString(values));

        int[] points = {10, 20, 30, 40, 50};
        for (int j = 0; j < points.length - 1; j++) {
            points[j] = points[j + 1];
        }
        points[points.length - 1] = 0;
        System.out.println(Arrays.toString(points));

        int[] grades = {2, 4, 6, 8, 10, 12};
        int k = 3;
        for (int i = 0; i < k; i++) {
            for (int j = grades.length - 1; j > 0; j--) {
                grades[j] = grades[j - 1];
            }
            grades[0] = 0;
        }
        System.out.println(Arrays.toString(grades));

        int[] limitSpeed = {1, 2, 3, 4, 5, 6, 7};
        int m = 2;

        for (int x = 0; x < m; x++) {
            for (int z = 0; z < limitSpeed.length - 1; z++) {
                limitSpeed[z] = limitSpeed[z + 1];
            }
            limitSpeed[limitSpeed.length - 1] = 0;
        }
        System.out.println(Arrays.toString(limitSpeed));
















    }
}
