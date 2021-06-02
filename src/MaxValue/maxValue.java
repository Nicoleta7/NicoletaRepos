package MaxValue;
import java.util.Scanner;

public class maxValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti trei numere: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b && a>c){
            System.out.println("Primul numar est cel mai mare !");
        } else if (b>a && b>c){
            System.out.println("Al doilea numar este cel mai mare !");
        } else if(c>a && c>b){
            System.out.println("Al treilea numar este cel mai mare !");
        } else
            System.out.println("Toate trei numere trebuie sa fie de tip int !!!");
}
    }
