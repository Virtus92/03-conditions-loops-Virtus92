import java.util.Scanner;

public class freeTimeOrWorkTime {
    public static void main(String[] args) {

        //localtime Datum-Methode

        Scanner sc = new Scanner(System.in);
        int clock = 0;

        System.out.println("Wieviel Uhr ist es ?");
        String timeInput = sc.nextLine();

        char[] time = timeInput.toCharArray();

        for (char c : time) {
            if (Character.isDigit(c)) {
                clock = clock*10+(c-'0');
            }
        }

        if (clock < 830) {
            System.out.println("Es ist zu früh zum arbeiten.");
        } else if (clock >= 12.00 && clock <= 12.30) {
            System.out.println("Du hast Mittagspause");
        } else if (clock >1530) {
            System.out.println("Feierabend");
        } else {
            System.out.println("Arbeitszeit. Gib Gas.");
        }
    }
}
