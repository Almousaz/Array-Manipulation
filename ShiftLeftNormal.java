import java.util.Arrays;

public class ShiftLeftNormal {
    public static void main(String[] args) {

//        Shift left by one

        int[] numbers = {10, 20, 30, 40, 50};

//        {10,20,30,40,50} -> {20,30,40,50,0}

        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
            }
        numbers[numbers.length - 1] = 0;

        System.out.println("numbers after shift " + Arrays.toString(numbers));

//        example2

        int[] numberOfProduct = {6, 12, 15, 18, 19};

        for (int i = 0; i < numberOfProduct.length - 1; i++) {
            numberOfProduct[i] = numberOfProduct[i + 1];
        }
        numberOfProduct[numberOfProduct.length - 1] = 0;

        System.out.println("after shift " + Arrays.toString(numberOfProduct));




    }
}
