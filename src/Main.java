import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Gib eine Dezimalzahl ein.");
        int num = sc.nextInt();
        int luck = r.nextInt(100);

        if (num%10==0) {
            System.out.println(num + " ist eine volle Zahl.");
        }
        if (num%2==0) {
            System.out.println(num + " ist eine gerade Zahl.");
        }
        if (num==luck) {
            System.out.println(num + " entspricht der generierten Zahl: " + luck);
        }
        if (num>9 && num<100) {
            System.out.println(num + " ist zweistellig.");
        }

    }
}