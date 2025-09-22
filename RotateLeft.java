import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {


//        arr = [1, 2, 3, 4, 5]
//        k = 2
//        -> [3, 4, 5, 1, 2]

//        int[] numbersOfCustomers = {12, 13, 14, 15, 16, 17, 18, 19};
//
//        int k = 2;
//        int n = numbersOfCustomers.length;
//        int[] rotated = new int[n];
//
////        {12, 13, 14, 15, 16, 17, 18, 19} -> { 14, 15, 16, 17, 18, 19 ,12, 13}
//
//        for (int x = 0; x < numbersOfCustomers.length; x++) {
//            int newIndex = (x - k + n) % n;
//            rotated[newIndex] = numbersOfCustomers[x];
//        }
//
//        System.out.println(" original : " + Arrays.toString(numbersOfCustomers));
//        System.out.println(" rotated :  " + Arrays.toString(rotated));
//
//
//        int[] numbersOfLights = {4, 5, 6, 7, 8, 9};
//
//        int m = 3;
//        int z = numbersOfLights.length;
//
//        int[] rotatedArrays = new int[z];
//
//        for (int i = 0; i < z; i++) {
//            int newIndex = (i - m + z) % z;
//            rotatedArrays[newIndex] = numbersOfLights[i];
//        }
//
//        System.out.println(Arrays.toString(rotatedArrays));


//        int[] points = {5, 10, 15, 20, 25, 30};
//        int k = 2;
//        int m = points.length;
//        int[] rotatedArray = new int[m];
//        for (int i = 0; i < m; i++) {
//            int newIndex = (i - k + m) % m;
//            rotatedArray[newIndex] = points[i];
//        }
//        System.out.println(Arrays.toString(rotatedArray));
//
//        int[] values = {1, 2, 3, 4, 5, 6, 7};
//        int g = 2;
//        int n = values.length;
//        int[] rotatedValues = new int[n];
//        for (int i = 0; i < n ; i++) {
//            int newIndex = (i + g) % n;
//            rotatedValues[newIndex] = values[i];
//        }
//        System.out.println(Arrays.toString(rotatedValues));



//        rotate array with 5 position
        int[] dataNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int k = 5;
        int m = dataNumbers.length;
        int[] rotatedData = new int[m];

        for (int x = 0; x < m; x++) {
            int newIndex = (x - k + m) % m;
            rotatedData[newIndex] = dataNumbers[x];
        }
        System.out.println( "rotated by left : " + Arrays.toString(rotatedData));

        int[] rotatedByRight = new int[m];

        for (int z = 0; z < m; z++) {
            int newIndex = (z + k) % m;
            rotatedByRight[newIndex] = dataNumbers[z];
        }
        System.out.println("rotated By right : " + Arrays.toString(rotatedByRight));




























    }
}
