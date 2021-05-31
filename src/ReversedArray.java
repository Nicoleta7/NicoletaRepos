import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] array = {90, 80, 70, 60, 50, 40, 30, 20, 10};
        System.out.println("Original array: " + Arrays.toString(array));


        System.out.println("Reversed array: ");

        for(int i = array.length-1; i>=0 ; i--){
            System.out.println(array[i]);
        }
    }
}
