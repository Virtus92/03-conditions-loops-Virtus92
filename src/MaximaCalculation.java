import java.util.ArrayList;
import java.util.Scanner;

public class MaximaCalculation {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Gib eine Liste von Zahlen ein. Beende die Eingabe mit 'q'.");
        while (true) {
            String input = sc.nextLine();

            // Wenn 'q' eingegeben wird, die Schleife beenden
            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                // Eingabe in eine Zahl umwandeln und zur Liste hinzufügen
                int number = Integer.parseInt(input);
                num.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte eine Zahl eingeben oder 'q' zum Beenden.");
            }
        }

        //

        int counter = Integer.MIN_VALUE;
        for (int i=0; i<num.size(); i++) {
            counter += num.get(i);
        }
        System.out.println(counter);
    }
}
