import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {


//        arr = [1, 2, 3, 4, 5]
//        k = 2
//        -> [3, 4, 5, 1, 2]

        int[] numbersOfCustomers = {12, 13, 14, 15, 16, 17, 18, 19};

        int k = 2;
        int n = numbersOfCustomers.length;
        int[] rotated = new int[n];

//        {12, 13, 14, 15, 16, 17, 18, 19} -> { 14, 15, 16, 17, 18, 19 ,12, 13}

        for (int x = 0; x < numbersOfCustomers.length; x++) {
            int newIndex = (x - k + n) % n;
            rotated[newIndex] = numbersOfCustomers[x];
        }

        System.out.println(" original : " + Arrays.toString(numbersOfCustomers));
        System.out.println(" rotated :  " + Arrays.toString(rotated));


        int[] numbersOfLights = {4, 5, 6, 7, 8, 9};

        int m = 3;
        int z = numbersOfLights.length;

        int[] rotatedArrays = new int[z];

        for (int i = 0; i < z; i++) {
            int newIndex = (i - m + z) % z;
            rotatedArrays[newIndex] = numbersOfLights[i];
        }

        System.out.println(Arrays.toString(rotatedArrays));
















    }
}
