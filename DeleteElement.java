import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {



//        Delete Element

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};

        int index = 4;

        for (int i = index; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[numbers.length - 1] = 0;

        System.out.println("After Delete : " + Arrays.toString(numbers));


        int[] numbersOfStudent = {1, 2, 3, 4, 5, 6, 7};

        int newIndex = 5;

        for (int x = newIndex; x < numbersOfStudent.length - 1; x++) {

            numbersOfStudent[x] = numbersOfStudent[x + 1];
        }
        numbersOfStudent[numbersOfStudent.length - 1] = 0;

        System.out.println(Arrays.toString(numbersOfStudent));
















    }
}
