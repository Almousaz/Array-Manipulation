import java.util.Arrays;

public class SwapElement {
    public static void main(String[] args) {


//        Swapping Element

        int[] numbers = {4, 5, 6, 7, 8, 9};
        System.out.println("Before : " + Arrays.toString(numbers));

        int i = 1;
        int j = 3;

        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;

        System.out.println("After : " + Arrays.toString(numbers));

        int[] values = {10, 20, 30, 40, 50, 60, 70};
        int a = 3;
        int b = 6;

        int newTemp = values[a];
        values[a] = values[b];
        values[b] = newTemp;

        System.out.println(Arrays.toString(values));







    }
}
