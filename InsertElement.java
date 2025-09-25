import java.util.Arrays;

public class InsertElement {

    public static void main(String[] args) {

//        Insert Element

//        int[] numbers = new int[6];
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;
//        numbers[3] = 40;
//        numbers[4] = 50;
//        System.out.println(Arrays.toString(numbers));
//
////        {10,20,30,40,50,0}
//
//        int index = 1;
//        int element = 99;
//
//        for (int i = numbers.length - 1; i > index; i--) {
//            numbers[i] = numbers[i - 1];
//        }
//        numbers[index] = element;
//        System.out.println("After insertion : " + Arrays.toString(numbers));
//
//
//        int[] numbersOfTable = new int[5];
//        numbersOfTable[0] = 5;
//        numbersOfTable[1] = 10;
//        numbersOfTable[2] = 15;
//        numbersOfTable[3] = 20;
//        System.out.println(Arrays.toString(numbersOfTable));
//
//        int newIndex = 3;
//        int newElement = 100;
//
//        for (int x = numbersOfTable.length - 1; x > newIndex; x--) {
//            numbersOfTable[x] = numbersOfTable[x - 1];
//        }
//
//        numbersOfTable[newIndex] = newElement;
//        System.out.println( "after insertion " + Arrays.toString(numbersOfTable));

        int[] points = new int[5];
        points[0] = 1;
        points[1] = 2;
        points[2] = 3;
        points[3] = 4;
        System.out.println(Arrays.toString(points));

        int index = 1;
        int element = 100;

        for (int i = points.length - 1; i > index; i--) {
            points[i] = points[i - 1];
        }
        points[index] = element;
        System.out.println(Arrays.toString(points));












    }
}
