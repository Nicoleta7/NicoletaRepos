package Sort;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] array = {3, 1, 2, 9, 5, 4, 6, 7, 8};
        System.out.println("Original array: " + Arrays.toString(array));

        int tempValue;
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {
                    tempValue = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tempValue;
                }
            }
        }
        System.out.println("Reversed array: " + Arrays.toString(array));
    }
}

//        Arrays.sort(array);
//        System.out.println("Sorted array: " + Arrays.toString(array));



