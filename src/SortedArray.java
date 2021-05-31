import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int [] array = {3, 1, 2, 9, 5, 4, 6, 7, 8};
        System.out.println("Original array: " + Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));


    }
}
