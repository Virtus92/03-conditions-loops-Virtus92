public class Einmaleins {
    public static void main(String[] args) {
        for (int i=1; i<11; i++) {
            System.out.println(i + "er Reihe:");
            for (int x=1; x<11; x++) {
                System.out.println(x + " * " + i + " = " + x*i);
            }
            System.out.println();
        }
    }
}
