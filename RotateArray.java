import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

//        Rotate array to the right by k positions

        int[] numbers = {1, 2, 3, 4, 5};
        int k = 2;

        int[] rotated = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int newIndex = (i + k) % numbers.length;
            rotated[newIndex] = numbers[i];
        }
        System.out.println(Arrays.toString(rotated));


//    Rotate array to the left by k positions

//        int[] numbers = {1, 2, 3, 4, 5};

        int length = numbers.length;
        int[] rotatedFromLeft = new int[length];

        for (int x = 0; x < length; x++) {
            int newIndex = (x - k + length) % length;
            rotatedFromLeft[newIndex] = numbers[x];

        }
        System.out.println(Arrays.toString(rotatedFromLeft));







    }
}
