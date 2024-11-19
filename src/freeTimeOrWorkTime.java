import java.time.LocalTime;

public class freeTimeOrWorkTime {
    public static void main(String[] args) {
        LocalTime clock = LocalTime.now();
        LocalTime start = LocalTime.of(8,30);
        LocalTime pauseStart = LocalTime.of(12,00);
        LocalTime pauseEnd = LocalTime.of(12,30);
        LocalTime workEnd = LocalTime.of(15,30);

        if (clock.isBefore(start)){
            System.out.println("Es ist zu früh zum arbeiten.");
        } else if (clock.isAfter(pauseStart) && clock.isBefore(pauseEnd)) {
            System.out.println("Du hast Mittagspause");
        } else if (clock.isAfter(workEnd)) {
            System.out.println("Feierabend");
        } else {
            System.out.println("Arbeitszeit. Gib Gas.");
        }
    }
}
