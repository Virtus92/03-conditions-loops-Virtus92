package at.codersbay.java.basics.conditionsloops;

public class Operators {
    public static void main(String[] args) {
        operators();
        comparisonOperator();
        logicalOperators();

    }

    static void operators(){
        // Arithmetische Operatoren

        // Variablen deklarieren und initialisieren
        int a = 10;
        int b = 5;

        // Addition
        int additionResult = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + additionResult);

        // Subtraktion
        int subtractionResult = a - b;
        System.out.println("Subtraktion: " + a + " - " + b + " = " + subtractionResult);

        // Multiplikation
        int multiplicationResult = a * b;
        System.out.println("Multiplikation: " + a + " * " + b + " = " + multiplicationResult);

        // Division
        int divisionResult = a / b;
        System.out.println("Division: " + a + " / " + b + " = " + divisionResult);

        // Modulo (Rest der Division)
        int moduloResult = a % b;
        System.out.println("Modulo: " + a + " % " + b + " = " + moduloResult);

        a = a + b; // Langschreibweise
        a += b;    // Kurzschreibweise

        a = a - b;
        a -= b;

        a = a * b;
        a *= b;

        a = a / b;
        a /= b;

        a = a % b;
        a %= b;

        a = a + 1;
        a++;

        a = a - 1;
        a--;
    }

    static void comparisonOperator(){
        int a = 5;
        int b = 8;

        boolean isALessThanB = a < b;     // true
        boolean isAGreaterThanB = a > b;  // false
        boolean areAAndBEqual = a == b;   // false
        boolean areANotEqualB = a != b;    // true
        boolean isALessThanOrEqualB = a <= b;  // true
        boolean isAGreaterThanOrEqualB = a >= b;  // false
    }

    static void logicalOperators(){
        boolean x = true;
        boolean y = false;

        boolean andResult = x && y; // false
        boolean orResult = x || y;  // true
        boolean xorResult = x ^ y;  // true
        boolean notResultX = !x;    // false
        boolean notResultY = !y;    // true
    }
}