package ZileleSapt;
import java.util.Scanner;

public class weekDay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar pentru a afla ziua a saptamanii (1-7) : ");
        int zi = sc.nextInt();

        int nrZi = zi;
        String denumZi;

        switch (nrZi) {
            case 1:
                denumZi = " Luni ";
                break;

            case 2:
                denumZi = " Marti ";
                break;

            case 3:
                denumZi = " Miercuri ";
                break;

            case 4:
                denumZi = " Joi ";
                break;

            case 5:
                denumZi = " Vineri ";
                break;

            case 6:
                denumZi = " Sambata ";
                break;

            case 7:
                denumZi = " Duminica ";
                break;

            default:
                denumZi = " Error ";
                break;
        }
        System.out.println("Zi a saptamanii: "+ denumZi);
    }
}
