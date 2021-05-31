
package Reverse;
import java.util.Scanner;

public class ScannerReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti un sir de int-uri: ");

        String text = sc.nextLine();
        char[] arr = text.toCharArray();

        String reverse = "";
        for(char i : arr)
            reverse = i + reverse;
        System.out.println(reverse);


    }
}
