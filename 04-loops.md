# Schleifen

In einem Programm ist es oft notwendig, einen bestimmten Codeblock mehrfach zu wiederholen. Stellen wir uns vor, ein Programm verwaltet eine Liste von Kursteilnehmern und muss für jeden Teilnehmer das Startdatum des Kurses festlegen. Ohne Schleifen müssten wir den gleichen Codeblock mehrmals schreiben, was nicht nur aufwendig ist, sondern auch die Wartbarkeit des Codes erschwert. 

Höhere Programmiersprachen bieten verschiedene Arten von Schleifen, um diese Aufgabe zu bewältigen. Hier sind die vier Hauptarten von Schleifen:
1. **For-Schleife (for)**: Wird verwendet, wenn die Anzahl der Iterationen im Voraus bekannt ist.
1. **Foreach-Schleife (foreach)**: Ideal für die Iteration durch Elemente in einer Liste oder einem Array (Diese werden wir in einem späteren Kapitel kennenlernen).
1. **While-Schleife (while)**: Führt den Codeblock aus, solange eine Bedingung erfüllt ist. Es gibt zwei Varianten: `do [...] while` (wird mindestens einmal ausgeführt) und `while` (die Bedingung wird zuerst überprüft).

Zwei weitere wichtige Befehle, die in Schleifen verwendet werden:
- **Abbruchbefehl**: Mit dem Befehl `break` kann eine Schleife abgebrochen werden. Die Programmausfürhung wird sofort nach der Schleife fortgesetzt.
- **Überspringbefehl**: Die Anweisung `continue` bewirkt im Gegensatz zu `break`, dass lediglich der aktuelle Schleifendurchlauf (und nicht die vollständige Schleife) an der Stelle der Anweisung verlassen und der Programmablauf dann mit dem nächsten Schleifendurchlauf fortgesetzt wird.

- Sollte es sich um einen Codeteil handeln, der so oft wiederholt werden soll, bis eine Bedingung erfüllt ist, stehen uns hier 2 Varianten zur Verfügung:
  - Wenn der Codeteil mindestens einmal ausgeführt werden muss: ***führe folgende Anweisungen durch, solange Bedingung erfüllt ist*** ( `do [...] while`). Hier werden die Anweisungen mindestens 1 Mal ausgeführt.
  - Wenn die Bedingung zuerst geprüft werden muss, bevor der Codeteil ausgeführt wird (also kann es sein, dass der Codeteil kein einziges Mal ausgeführt wird): ***Solange Bedingung erfüllt ist, führe folgende Anweisungen durch*** (`while`)

## `for`-Schleife

Wenn die Anzahl der Iterationen vorm Start der Schleife bekannt ist, verwenden wir eine `for`-Schleife. Der Schleifenkopf besteht aus: ***for (Zählvariable; Abbruchbedingung; Inkrementer/Dekrementer)***, wobei:
- ***Zählvariable***: Stellt den Beginn der Wiederholungen dar (`int i = 0`).
- ***Abbruchbedingung***: Stellt die Bedingung dar, welche die Schleife beendet (`i < 10`).
- ***Inkrementer/Dekrementer***: Ist die Formel, welche den Wert der Zählvariable bei jeder Iteration ändern soll, um irgendwann die ***Abbruchbedingung*** zu erfüllen (`i++` oder `i--`).
- Semikola trennen die Ausdrücke innerhalb des Schleifenkopfs. 
Vorsicht: Werden die Hauptbestandteile des Schleifenkopfs falsch gewählt, kann es zu einer Endlosschleife (=endlose Anzahl an Wiederholungen bis hin zu Speicherüberlauf und Programmabsturz) kommen.

### Beispiel

Hier ein Beispiel, das den Benutzer auffordert, eine Zahl einzugeben, um dann die geraden Zahlen von 0 bis zur eingegebenen Zahl auszugeben:

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

Wenn zum Beispiel eine Liste von Elementen durchiteriert werden soll, verwendet man am besten eine `foreach`-Schleife. Bedingt durch das Listen-Objekt mit einer finiten Anzahl an Elementen, ist es bei der `foreach`-Schleife unmöglich, eine Endlosschleife zu produzieren. Die Anzahl der beinhalteten Elemente stellt immer die Abbruchbedingung der Schleife dar.

### Beispiel

Ein Beispiel, das alle Elemente einer Liste ausgibt:

In Java, im Gegensatz zu anderen Programmiersprachen, die den Befehl `foreach` verwenden, verwendet man den Befehl `for`. Anstatt `in` verwendet Java den Befehl `:` im Schleifenkopf, wie in den folgenden Beispielen gut ersichtlich ist.

```Java
// Java 

import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D");

        System.out.print("Die Elemente von list lauten: ");

        for (String character : list) { // für jedes Element in der Liste list, erstelle ein Stringelement `character` und verwende dieses im Code der Schleife
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

Wenn man bestimmte Anweisungen ausführen soll, solange und nur dann wenn eine Bedingung erfüllt ist, benutzt man eine `while`-Schleife. Diese Bedingung schreibt man in die runden Klammern. Wenn diese erfüllt ist, wird der Code, der sich innerhalb der geschweiften Klammern befindet, ausgeführt. Daraufhin wird überprüft, ob die Bedingung noch erfüllt ist. Sollte dass der Fall sein, springt unser Programm zum Anfang der Schleife zurück. Das passiert so lange, bis die Bedingung nicht mehr erfüllt ist. Danach läuft das Programm weiter durch den restlichen Code.
Sollte die Bedingung immer erfüllt sein und damit die Abbruchbedingung niemals gegeben, kommt es logischerweise auch hier zu einer Endlosschleife.  

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

Die `while`-Schleife prüft die Bedingung zuerst, bevor die Anweisungen ausgeführt werden. In manchen Fällen ist es sinnvoller, die Bedingung erst nach der ersten Ausführung der Anweisungen zu prüfen. Hierfür steht uns die `do ... while`-Schleife zur Verfügung. Diese prüft die Bedingung erst, wenn der erste Durchlauf der Anweisungen abgeschlossen ist.

Lösen wir dasselbe Beispiel mit einer `do ... while`-Schleife:

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

## Eine Iteration überspringen: `continue`

In manchen Fällen sollen unter gewissen Umständen nicht alle Anweisungen ausgeführt werden. Hierfür stellen uns Programmiersprachen den Befehl `continue` zur Verfügung, welcher die Schleife dazu zwingt, in den nächsten Schleifendurchlauf zu springen. 

Lösen wir das Beispiel der `for`-Schleife anders:

```java
// Java

import java.util.Scanner;

class MainClass{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        int number = scanner.nextInt();

        System.out.print("Die geraden Zahlen von 0 bis " + number + " lauten: ");

        for (int i = 0; i <= number; i++){
            if (i % 2 = 1) continue; // hier wird der Befehl continue verwendet. => Bei ungeraden Zahlen, überspringe den Rest der Iteration und springe gleich zur nächsten Iteration.
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
        int number = Convert.ToInt32(Console.ReadLine());

        Console.Write($"Die geraden Zahlen von 0 bis {number} lauten: ");

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 1) continue; // hier wird der Befehl continue verwendet. => Bei ungeraden Zahlen, überspringe den aktuellen Schleifendurchlauf und springe zum nächsten Schleifendurchlauf.
            Console.Write(i + ", ");
        }
    }
}
```

## Eine Schleife abbrechen, bevor die Abbruchbedingung erfüllt ist: `break`

Sollte es notwendig sein, eine Schleife vorzeitig zu abzubrechen, stellen uns Programmiersprachen den Befehl `break` bereit.

Erweitern wir das Beispiel der `for`-Schleife so, dass maximal die ersten 10 geraden Zahlen ausgegeben werden dürfen:

```Java
// Java

import java.util.Scanner;

class MainClass{
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
