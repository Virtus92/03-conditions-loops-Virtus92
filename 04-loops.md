# Schleifen

In einem Programm kann es sinnvoll sein, denselben Codeteil zu wiederholen. Das erspart dem Entwickler, denselben Code x Mal zu schreiben. Außerdem ist oft zum Zeitpunkt der Code-Erstellung oft noch nicht klar, wie oft ein Codeteil ausgeführt werden soll. 

Um diese Aufgabe bieten höhere Programmiersprachen sogenannte Schleifen. In der Regel werden die 4 folgenden Arten angeboten:
- wenn die Anzahl der Iterationen vorm Start der Schleife bekannt ist: ***für (<start>; <Ende-Bedingung>; <Inkrementer>)***
- wenn es sich um ein Objekt handelt, der eine definiterte Anzahl an Elementen beinhaltet, der vollständig durchlaufen werden soll, z.B. eine Liste: ***für jedes(<Element> in <Objekt>)***
- wenn es sich um einen Codeteil handelt, der so oft wiederholt werden soll, bis eine Bedingung erfüllt ist. Hier stehen uns 2 Varianten zur Verfügung:
  - wenn der Codeteil mindestens einmal ausgeführt werden muss: ***führe durch <Anweisungen> solange <Bedingung>***
  - wenn die Bedingung zuerst geprüft werden muss, bevor der Codeteil ausgeführt wird (also kann es sein, dass der Codeteil kein einziges Mal ausgeführt wird): ***Solange <Bedingung> führe durch <Anweisungen>***

## führe <Anweisungen> <x> Mal durch

In dem Falle, als von vornherein bekannt ist, wieviele Male die folgenden Anweisungen ausgeführt werden müssen, wird die sogenannte ***for-Schleife*** verwendet. Diese definiert einen Zähler, der bei jedem Durchlauf um den Inkrementer erhöht wird, bis die Endbedingung erfüllt ist. Hier ist wichtig zu erwähnen, dass eine for-Schleife nach <x> Iterationen endet, sofern der\*die Entwickler\*in den Iterator nicht innerhalb der Schleife manipuliert. Endlosschleifen sind hier nur durch einen Fehler des\*der Entwickler\*in möglich.

### Beispiel

Wir schreiben ein kleines Programm, das den\*die Benutzer\*in auffordert, eine Zahl einzugeben. Anschließend soll das Programm nur die geraden Zahlen zwischen 0 und die eingegebene Zahl ausgeben.

#### Java 

```Java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int maxNumber = scanner.nextInt();

    System.out.print("Die geraden Zahlen von 0 bis " + maxNumber + " lauten: ");

    for (int i = 0; i <= maxNumber; i = i + 2){ // "int i = 0" ist der Startwert von der Variable i, "i <= number" bedeutet, dass die for-Schleife aufhören soll, wenn i größer oder gleich number ist, "i = i + 2" heißt, dass bei jeder Iteration i um 2 erhöht wird.
        System.out.print(i + ", ");
    }
}
```

#### C#

```c#

```

## für jedes <Element> eines <Objekts>, führe <Anweisungen> durch

In bestimmten Fällen steht uns eine Variable zur Verfügung, die mehrere Elemente beinhaltet. Diese Datentypen haben wir noch nicht gesehen, jedoch präsentieren wir diese Schleife hier, um den Kontext der Schleifen zu bewahren. Wenn man alle Elemente einer solchen Variable durchlaufen möchte, steht uns eine spezielle for-Schleife: die ***foreach-Schleife***. Bedingt durch das Listen-Objekt ist auch diese Schleife aus denselben Gründen wie die for-Schleife davor "geschützt", endlos zu iterieren.

### Beispiel

Wir schreiben ein kleines Programm, das alle Elemente einer Liste ausgibt.

#### Java 

```Java
public static void main(String[] args) {
    List<char> list = ["A", "B", "C", "D"]; //näheres zum Objekttyp List in einem späteren Kapitel

    System.out.print("Die Elemente von list lauten: ");

    for (int character: list){ //diese Zeile bedeutet: für jedes Element in list, speichere den Wert des Elements in die Variable character und führe den Anweisungsblock aus.
        System.out.print("'" + character + "', ");
    }
}
```

#### C#

```c#

```

## Solange <Bedingung> führe durch <Anweisungen>

Wenn man bestimmte <Anweisungen> ausführen soll, solange und nur dann wenn eine <Bedingung> erfüllt ist, steht uns die ***while-Schleife*** zur Verfügung. Wichtig ist anzumerken, dass bei dieser Variante die <Bedingung> zuerst geprüft wird, bevor der erste Durchlauf der <Anweisungen> ausgeführt. Also kann es vorkommen, dass die <Anweisungen> kein einziges Mal ausgeführt werden, wenn die <Bedingung> gleich erfüllt ist. Hier ist es wichtig, dass der\*die Entwickler\*in sicherstellt, dass die <Bedingung> eintreten wird, ansonsten könnte eine **Endlosschleife** entstehen!

### Beispiel

Lösen wir das Beispiel oben mit einer while-Schleifen:

#### Java 

```Java
public static void main(String[] args) {
    List<char> list = ["A", "B", "C", "D"]; //näheres zum Objekttyp List in einem späteren Kapitel
    int i = 0;

    System.out.print("Die Elemente von list lauten: ");

    while (i < list.size()){ // Hier wird die Bedingung erst geprüft und erst bei positivem Ergebnis die <Anweisungen> ausgeführt. list.size() gibt die Anzahl der Elemente in list aus.
        System.out.print("'" + list.get(i) + "', "); // list.get(i) gibt das Element an der Position i aus (das erste Element ist hier an Position 0)
        i++;
    }
}
```

#### C#

```c#

```

## führe durch <Anweisungen> solange <Bedingung>

Die while-Schleife prüft die Bedingung zuerst, bevor die <Anweisungen> ausgeführt werden. In manchen Fällen ist es sinnvoller, die Bedingung erst nach der ersten Ausführung der <Anweisungen> zu prüfen.

### Beispiel

Lösen wir das Beispiel oben mit einer while-Schleifen:

#### Java 

```Java
public static void main(String[] args) {
    List<char> list = ["A", "B", "C", "D"]; //näheres zum Objekttyp List in einem späteren Kapitel
    int i = 0;

    System.out.print("Die Elemente von list lauten: ");

    do {
        System.out.print("'" + list.get(i) + "', ");
        i++;
    } while (i < list.size()) // Hier wird die Bedingung nach der ersten Ausführung des Anweisungsblocks
}
```

#### C#

```c#

```

## eine Iteration abbrechen und gleich zur nächsten Iteration springen

In manchen Fällen sollen nicht alle Anweisungen ausgeführt werden. Hierfür stellen uns Programmiersprache spezielle Befehle, welche die Schleife dazu zwingen, zurück zum Start zu springen. 

### Beispiel

Nehmen wir das Beispiel der for-Schleife her und lösen es, anders:

#### Java 

```Java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    System.out.print("Die geraden Zahlen von 0 bis " + number + " lauten: ");

    for (int i = 0; i <= number; i++){
        if (i % 2 = 1) continue        // hier wird der Befehl continue verwendet. Dieser besagt: überspringe den Rest der Anweisungen und springe sofort zur nächsten Iteration
        System.out.print(i + ", ");
    }
}
```

#### C#

```c#

```

## eine Schleife abbrechen, bevor die Endbedingung erfüllt ist

Sollte es notwendig sein, eine Schleife vorzeitig zu unterbrechen, stellen uns auch die Programmiersprachen einen Befehl dazu.

### Beispiel

Erweitern wir das Beispiel der for-Schleife so, dass maximal die ersten 10 geraden Zahlen ausgegeben werden dürfen:

#### Java 

```Java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int counter = 0;

    System.out.print("Die geraden Zahlen von 0 bis " + number + " lauten: ");

    for (int i = 0; i <= number; i = i + 2){
        System.out.print(i + ", ");
        counter++;
        if (counter > 10){
            break;                       // der break-Befehl besagt, dass die Schleife abgebrochen wird, auch wenn weitere Iterationen noch offen gewesen wären. In diesem Falle, wenn counter > 10 sprich, wenn 10 gerade Zahlen ausgegeben wurden.
        }
    }
}
```

#### C#

```c#

```
Zurück zur [Startseite](README.md)
