import java.util.Scanner;

public class NotenÜbersetzen {
    public static void main(String[] args) {

        //Switch Case

        Scanner sc = new Scanner(System.in);

        System.out.println("Welche Note hast du in numerischer Form?");
        int note = sc.nextInt();

        switch (note) {
            case 1 -> System.out.println("Sehr gut.");
            case 2 -> System.out.println("Gut.");
            case 3 -> System.out.println("Befriedigend.");
            case 4 -> System.out.println("Genügend.");
            case 5 -> System.out.println("Nicht Genügend.");
            default -> System.out.println("Fehler, versuchs erneut.");
        }
    }
}
