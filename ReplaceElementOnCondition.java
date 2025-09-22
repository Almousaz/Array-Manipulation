import java.util.Arrays;

public class ReplaceElementOnCondition {
    public static void main(String[] args) {


//         replace elements in an array based on a condition


        int[] numbers = {5, 10, 15, 20, 25, 30};
        System.out.println(Arrays.toString(numbers));

//      replace all element greater than 15 with 0

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 15) {
                numbers[i] = 0;
            }
        }

        System.out.println("After Replace " + Arrays.toString(numbers));



    }
}
