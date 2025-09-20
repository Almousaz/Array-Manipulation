import java.util.Arrays;

public class ShiftRightNormal {
    public static void main(String[] args) {


//        Shift right by one

        int[] numbers = {10, 20, 30, 40, 50, 60};

//        {10,20,30,40,50,60} -> {0,10,20,30,40,50}

        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = 0;
        System.out.println("After shift " + Arrays.toString(numbers));



    }
}
