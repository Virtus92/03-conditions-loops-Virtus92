package at.codersbay.java.basics.conditionsloops;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        glassFull();
        checkAgeShortCondition();
        chooseOneOption();
    }

    static void glassFull(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many ml are in the glass!");
        int amount = scanner.nextInt();

        if (amount == 250) {
            System.out.println("The glass is full!");
        } else if (amount == 125) { // ACHTUNG! die Bedingung '== 125' muss vor '< 250' geprüft werden, ansonsten greift immer nur '< 250'
            System.out.println("The glass is half full!");
        } else if (amount < 250) {
            System.out.println("The glass is not full anymore!");
        } else {
            System.out.println("The glass is more than full!");
        }
    }

    static void checkAgeShortCondition(){
        System.out.println("Please give in your age!");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        String ageState = age > 18 ? "adult" : "underage"; // Diese Zeile ist wird unten erklärt
        System.out.println(ageState);

    }

    static void chooseOneOption(){
        System.out.println("Do you want to play? Enter 'yes' or 'no'");
        String menuOption = new Scanner(System.in).nextLine();
        switch (menuOption) {
            case "yes":
                System.out.println("Super! It's starting right now!");
                break;
            case "no":
                System.out.println("Ok! See you later!");
                break;
            default:
                System.out.println("You entered a wrong answer!");
        }
    }
}
