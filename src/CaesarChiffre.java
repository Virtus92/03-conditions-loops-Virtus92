import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CaesarChiffre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random(26);
        System.out.println("Gib mir Inhalt, den ich verschlüsseln soll.");
        String sentence = sc.nextLine();
        char[] caesar = sentence.toCharArray();
        ArrayList<Character> chiffre = new ArrayList<>();
        int chiffreNum = r.nextInt(26);

        for (int i = 0; i < caesar.length; i++) {
            if (caesar[i] >= 65 && caesar[i] <= 90) {
                chiffre.add((char) (caesar[i] + chiffreNum));
                if (chiffre.get(i) > 90) {
                    chiffre.set(i, (char) (chiffre.get(i) - 26));
                }
            } else if (caesar[i] >= 97 && caesar[i] <= 122) {
                chiffre.add((char) (caesar[i] + chiffreNum));
                if (chiffre.get(i) > 122) {
                    chiffre.set(i, (char) (chiffre.get(i) - 26));
                }
            } else {
                chiffre.add(caesar[i]);
            }
        }

        for (Character character : chiffre) {
            System.out.print(character);
        }
    }
}
