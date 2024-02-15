# Schleifen

In einem Programm ist es oft notwendig, einen bestimmten Codeblock mehrfach zu wiederholen. Stellen wir uns vor, ein Programm verwaltet eine Liste von Kursteilnehmern und muss für jeden Teilnehmer das Startdatum des Kurses festlegen. Ohne Schleifen müssten wir den gleichen Codeblock mehrmals schreiben, was nicht nur aufwendig ist, sondern auch die Wartbarkeit des Codes erschwert. 

Höhere Programmiersprachen bieten verschiedene Arten von Schleifen, um diese Aufgabe zu bewältigen. Hier sind die vier Hauptarten von Schleifen:
1. **For-Schleife (for)**: Wird verwendet, wenn die Anzahl der Iterationen im Voraus bekannt ist.
1. **Foreach-Schleife (foreach)**: Ideal für die Iteration durch Elemente in einer Liste oder einem Array (Diese werden wir in einem späteren Kapitel kennenlernen).
1. **While-Schleife (while)**: Führt den Codeblock aus, solange eine Bedingung erfüllt ist. Es gibt zwei Varianten: `do [...] while` (wird mindestens einmal ausgeführt) und `while` (die Bedingung wird zuerst überprüft).

Zwei weitere wichtige Befehle, die in Schleifen verwendet werden:
- **Abbruchbefehl**: Mit dem Befehl `break` kann eine Schleife unterbrochen werden. Die Ausführung sprint automatisch zum Code nach der Schleife hin.
- **Überspringbefehl**: Mit dem Befehl `continue` kann zur nächsten Iteration in einer Schleife "gesprungen" werden. Also der Code unterhalb von `continue` in der Schleife wird übersprungen.

- wenn es sich um einen Codeteil handelt, der so oft wiederholt werden soll, bis eine Bedingung erfüllt ist. Hier stehen uns 2 Varianten zur Verfügung:
  - wenn der Codeteil mindestens einmal ausgeführt werden muss: ***führe folgende <Anweisungen> durch, solange <Bedingung> erfüllt ist***. Hier werden die Anweisungen mindestens 1 Mal ausgeführt.
  - wenn die Bedingung zuerst geprüft werden muss, bevor der Codeteil ausgeführt wird (also kann es sein, dass der Codeteil kein einziges Mal ausgeführt wird): ***Solange <Bedingung> erfüllt ist, führe folgende <Anweisungen> durch***

## `for`-Schleife

Wenn die Anzahl der Iterationen vorm Start der Schleife bekannt ist, verwenden wir: ***for (<start>; <Ende-Bedingung>; <Inkrementer>)***, wobei:
- ***<start>*** der erste Wert der Wiederholungen darstellt, 
- ***<Ende-Bedingung>*** die Bedingung darstellt, welche die Schleife beendet und 
- ***<Inkrementer>*** die Formel ist, wie sich der Wert bei jeder Iteration ändern soll, um irgendwann die ***<Ende-Bedingung>*** zu erfüllen. 
Hier ist eine Endlosschleife ausgeschlossen, außer die Iterator-Variable wird innerhalb der Schleife entsprechend manipuliert.

### Beispiel

Hier ein Beispiel, das den Benutzer auffordert, eine Zahl einzugeben, und dann die geraden Zahlen von 0 bis zur eingegebenen Zahl ausgibt:

```Java
// Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        int maxNumber = scanner.nextInt();

        System.out.print("Die geraden Zahlen von 0 bis " + maxNumber + " lauten: ");

        for (int i = 0; i <= maxNumber; i = i + 2) {
            System.out.print(i + ", ");
        }
    }
}
```

```csharp
// C#

using System;

class MainClass {
    public static void Main (string[] args) {
        Console.Write("Geben Sie eine Zahl ein: ");
        int maxNumber = Convert.ToInt32(Console.ReadLine());

        Console.Write($"Die geraden Zahlen von 0 bis {maxNumber} lauten: ");

        for (int i = 0; i <= maxNumber; i = i + 2) {
            Console.Write(i + ", ");
        }
    }
}
```

## `foreach`-Schleife

Wenn eine Liste von Elementen durchiteriert werden soll, der eine definiterte Anzahl an Elementen beinhaltet, z.B. eine Liste. Wenn man alle Elemente einer solchen Liste durchlaufen möchte, steht uns eine spezielle for-Schleife zur Verfügung: die **`foreach`-Schleife**. Bedingt durch das Listen-Objekt ist auch diese Schleife aus denselben Gründen wie die for-Schleife davor "geschützt", endlos zu iterieren.

### Beispiel

Ein Beispiel, das alle Elemente einer Liste ausgibt:

In Java, im Gegensatz zu anderen Programmiersprachen, die den Befehl `foreach` verwenden, verwendet man den Befehl `for`. Nur der Inhalt der Klammern ist anders gestaltet.

```Java
// Java 

import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D");

        System.out.print("Die Elemente von list lauten: ");

        for (String character : list) { // für jedes Element von list, erstelle ein Element `character` und verwende dieses im Code der Schleife
            System.out.print("'" + character + "', ");
        }
    }
}
```


```csharp
// C#

using System;
using System.Collections.Generic;

class MainClass {
    public static void Main (string[] args) {
        List<string> list = new List<string> { "A", "B", "C", "D" };

        Console.Write("Die Elemente von list lauten: ");

        foreach (string character in list) {
            Console.Write($"'{character}', ");
        }
    }
}
```

## `while`-Schleife

Wenn man bestimmte <Anweisungen> ausführen soll, solange und nur dann wenn eine <Bedingung> erfüllt ist, steht uns die ***while-Schleife*** zur Verfügung. Wichtig ist anzumerken, dass bei dieser Variante die <Bedingung> zuerst geprüft wird, bevor der erste Durchlauf der <Anweisungen> ausgeführt. Also kann es vorkommen, dass die <Anweisungen> kein einziges Mal ausgeführt werden, wenn die <Bedingung> gleich erfüllt ist. Hier muss der\*die Entwickler\*in sicherstellen, dass die <Bedingung> eintreten wird, ansonsten könnte eine **Endlosschleife** entstehen!

Lösen wir dasselbe Beispiel mit einer while-Schleife:

```Java
// Java

import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D"); //näheres zum Objekttyp List in einem späteren Kapitel
        int i = 0;

        System.out.print("Die Elemente von list lauten: ");

        while (i < list.size()) {
            System.out.print("'" + list.get(i) + "', ");
            i++;
        }
    }
}
```


```csharp
// C#

using System;
using System.Collections.Generic;

class MainClass {
    public static void Main (string[] args) {
        List<string> list = new List<string> { "A", "B", "C", "D" };
        int i = 0;

        Console.Write("Die Elemente von list lauten: ");

        while (i < list.Count) { // Hier wird die Bedingung vor der ersten Ausführung des Anweisungsblocks überprüft
            Console

.Write($"'{list[i]}', ");
            i++;
        }
    }
}
```

## `do...while`-Schleife

Die while-Schleife prüft die Bedingung zuerst, bevor die <Anweisungen> ausgeführt werden. In manchen Fällen ist es sinnvoller, die Bedingung erst nach der ersten Ausführung der <Anweisungen> zu prüfen. Hierfür steht uns die `do ... while`-Schleife zur Verfügung.

Lösen wir dasselbe Beispiel mit einer `do ... while`-Schleifen:

```Java
// Java 

import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D"); //näheres zum Objekttyp List in einem späteren Kapitel
        int i = 0;

        System.out.print("Die Elemente von list lauten: ");

        do {
            System.out.print("'" + list.get(i) + "', ");
            i++;
        } while (i < list.size()); // Hier wird die Bedingung nach der ersten Ausführung des Anweisungsblocks überprüft
    }
}
```

```csharp
// C#

using System;
using System.Collections.Generic;

class MainClass {
    public static void Main (string[] args) {
        List<string> list = new List<string> { "A", "B", "C", "D" };
        int i = 0;

        Console.Write("Die Elemente von list lauten: ");

        do {
            Console.Write($"'{list[i]}', ");
            i++;
        } while (i < list.Count);
    }
}
```

## eine Iteration abbrechen und gleich zur nächsten Iteration springen: `continue`

In manchen Fällen sollen nicht alle Anweisungen ausgeführt werden. Hierfür stellen uns Programmiersprache spezielle Befehle, welche die Schleife dazu zwingen, zurück zum Start zu springen. 

Nehmen wir das Beispiel der for-Schleife her und lösen es, anders:

```java
// Java

import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Geben Sie eine Zahl ein: ");
    int number = scanner.nextInt();

    System.out.print("Die geraden Zahlen von 0 bis " + number + " lauten: ");

    for (int i = 0; i <= number; i++){
        if (i % 2 = 1) continue // hier wird der Befehl continue verwendet. => Bei ungeraden Zahlen, überspringe den Rest der Iteration und springe gleich zur nächsten Iteration.
        System.out.print(i + ", ");
    }
}
```

```csharp
// C#

using System;

class MainClass {
    public static void Main (string[] args) {
        Console.Write("Geben Sie eine Zahl ein: ");
        int number = Convert.ToInt32(Console.ReadLine());

        Console.Write($"Die geraden Zahlen von 0 bis {number} lauten: ");

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 1) continue; // Überspringe ungerade Zahlen
            Console.Write(i + ", ");
        }
    }
}
```

## eine Schleife abbrechen, bevor die Endbedingung erfüllt ist: `break`

Sollte es notwendig sein, eine Schleife vorzeitig zu unterbrechen, stellen uns auch die Programmiersprachen einen Befehl bereit.

Erweitern wir das Beispiel der for-Schleife so, dass maximal die ersten 10 geraden Zahlen ausgegeben werden dürfen:

```Java
// Java

import java.util.Scanner;

public static void main(String[] args) {
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
```

```csharp
// C#

using System;

class MainClass {
    public static void Main (string[] args) {
        Console.Write("Geben Sie eine Zahl ein: ");
        int number = Convert.ToInt32(Console.ReadLine());
        int counter = 0;

        Console.Write($"Die geraden Zahlen von 0 bis {number} lauten: ");

        for (int i = 0; i <= number; i = i + 2) {
            Console.Write(i + ", ");
            counter++;
            if (counter > 10) {
                break; // Beende die Schleife nach 10 geraden Zahlen
            }
        }
    }
}
```

Zurück zur [Startseite](README.md)
