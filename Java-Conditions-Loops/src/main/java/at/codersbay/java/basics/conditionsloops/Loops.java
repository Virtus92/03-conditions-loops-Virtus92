package at.codersbay.java.basics.conditionsloops;
import java.util.Scanner;

import java.util.List;
import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        forLoop();
        System.out.println();
        forEachLoop();
        System.out.println();
        whileLoop();
        System.out.println();
        doWhileLoop();
        System.out.println();
        useContinue();
        System.out.println();
        useBreak();
    }

    static void forLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        int maxNumber = scanner.nextInt();

        System.out.print("Die geraden Zahlen von 0 bis " + maxNumber + " lauten: ");

        for (int i = 0; i <= maxNumber; i = i + 2) {
            System.out.print(i + ", ");
        }
    }

    public static void forEachLoop() {
        List<String> list = Arrays.asList("A", "B", "C", "D");

        System.out.print("Die Elemente von list lauten: ");

        for (String character : list) { // für jedes Element von list, erstelle ein Element `character` und verwende dieses im Code der Schleife
            System.out.print("'" + character + "', ");
        }
    }

    public static void whileLoop(){
        List<String> list = Arrays.asList("A", "B", "C", "D"); //näheres zum Objekttyp List in einem späteren Kapitel
        int i = 0;

        System.out.print("Die Elemente von list lauten: ");

        while (i < list.size()) {
            System.out.print("'" + list.get(i) + "', ");
            i++;
        }
    }

    static void doWhileLoop(){
        List<String> list = Arrays.asList("A", "B", "C", "D"); //näheres zum Objekttyp List in einem späteren Kapitel
        int i = 0;

        System.out.print("Die Elemente von list lauten: ");

        do {
            System.out.print("'" + list.get(i) + "', ");
            i++;
        } while (i < list.size()); // Hier wird die Bedingung nach der ersten Ausführung des Anweisungsblocks überprüft
    }

    static void useContinue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        int number = scanner.nextInt();

        System.out.print("Die geraden Zahlen von 0 bis " + number + " lauten: ");

        for (int i = 0; i <= number; i++){
            if (i % 2 == 1) continue; // hier wird der Befehl continue verwendet. => Bei ungeraden Zahlen, überspringe den Rest der Iteration und springe gleich zur nächsten Iteration.
            System.out.print(i + ", ");
        }
    }

    static void useBreak(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        int number = scanner.nextInt();
        int counter = 0;

        System.out.print("Die ersten 10 geraden Zahlen von 0 bis " + number + " lauten: ");

        for (int i = 0; i <= number; i = i + 2){
            System.out.print(i + ", ");
            counter++;
            if (counter > 10){
                break; // der break-Befehl besagt, dass die Schleife abgebrochen wird, auch wenn weitere Iterationen noch offen gewesen wären. In diesem Falle, wenn counter > 10 sprich, wenn 10 gerade Zahlen ausgegeben wurden.
            }
        }
    }
}