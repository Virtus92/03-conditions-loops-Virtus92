# Bedingungen

Programme sind nicht nur eine Folge von Tätigkeiten. In manchen Fällen müssen aufgrund von Parametern/Variablen Entscheidungen getroffen werden, um den weiteren Verlauf des Programms zu definieren. Zum Beispiel:
- Wenn der Angestellte Herr Müller weniger als z.B. 1500€ Brutto im Monat verdient, hat er Anspruch auf eine Förderung. Wenn die Bedingung zutrifft wird die Auszahlung der Förderung veranlasst.
- Wenn die Familie Mayer weniger als z.B. 3000€ monatliches Gesamteinkommen hat, hat sie Anspruch auf Wohnbeihilfe. Wenn die Bedingung zutrifft wird die Auszahlung der Wohnbeihilfe genehmigt.

Entscheidungen können in einem Programm auf verschiedene Art und Weisen erfolgen, die wir in den kommenden Kapiteln erläutern werden.

## `if` Anweisung

Die `if`-Anweisung ist ein grundlegendes Bauelement in der Programmierung, das es ermöglicht, einen Codeblock auszuführen, wenn eine bestimmte Bedingung wahr ist. Die grundlegende Syntax in sowohl Java als auch C# ist ähnlich:

```java
// Java
if (Bedingung) {
    // Code, der ausgeführt wird, wenn die Bedingung wahr ist
}
```

```csharp
// C#
if (Bedingung) {
    // Code, der ausgeführt wird, wenn die Bedingung wahr ist
}
```

Es ist auch möglich, einen `else`-Block einzufügen, um festzulegen, was passieren soll, wenn die Bedingung falsch ist:

```java
// Java
if (Bedingung) {
    // Code, der ausgeführt wird, wenn die Bedingung wahr ist
} else {
    // Code, der ausgeführt wird, wenn die Bedingung falsch ist
}
```

```csharp
// C#
if (Bedingung) {
    // Code, der ausgeführt wird, wenn die Bedingung wahr ist
} else {
    // Code, der ausgeführt wird, wenn die Bedingung falsch ist
}
```

## `else if` Anweisung

Die `else if`-Anweisung ermöglicht es, mehrere Bedingungen nacheinander zu überprüfen. Wenn die vorherigen `if`- oder `else if`-Bedingungen falsch sind, wird zur nächsten übergegangen. Dies ist nützlich, wenn mehrere Bedingungen berücksichtigt werden müssen:

```java
// Java
if (Bedingung1) {
    // Code, der ausgeführt wird, wenn Bedingung1 wahr ist
} else if (Bedingung2) {
    // Code, der ausgeführt wird, wenn Bedingung2 wahr ist
} else {
    // Code, der ausgeführt wird, wenn alle Bedingungen falsch sind
}
```

```csharp
// C#
if (Bedingung1) {
    // Code, der ausgeführt wird, wenn Bedingung1 wahr ist
} else if (Bedingung2) {
    // Code, der ausgeführt wird, wenn Bedingung2 wahr ist
} else {
    // Code, der ausgeführt wird, wenn alle Bedingungen falsch sind
}
```

### `if`-Beispiele

Wir wollen ein Programm schreiben, das entscheidet, ob ein Glas voll, nicht mehr voll oder halb voll ist:
- Bei 250 ml ist das Glas voll
- Bei weniger als 250 ml ist das Glas nicht mehr voll
- Bei 125 ml ist das Glas halb voll

```Java
// Java
Scanner scanner = new Scanner(System.in);
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
```

```csharp
// C#
Console.WriteLine("Enter the amount: ");
int amount = Convert.ToInt32(Console.ReadLine());

if (amount == 250) {
   Console.WriteLine("The glass is full!");
} else if (amount == 125) { // ACHTUNG! die Bedingung '== 125' muss vor '< 250' geprüft werden, ansonsten greift immer nur '< 250'
   Console.WriteLine("The glass is half full!");
} else if (amount < 250) {
   Console.WriteLine("The glass is not full anymore!");
} else {
   Console.WriteLine("The glass is more than full!");
}
```

Wie im Kommentar erklärt, muss man auf die Reihenfolge der Bedingungen achten, ansonsten könnte es passieren, dass ein Zweig niemals erreicht werden kann.

## Die komprimierte Version von `if`-Anweisungen

Stellen Sie sich vor, sie sollen Codezeilen sparen und die `if`- und `else`-Anweisungen befüllen dieselbe Variable. Unter anderem für diesen speziellen Fall gibt es den **ternären Operator**.

```Java
// Java
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   int age = scanner.nextInt();

   String ageState = age > 18 ? "adult" : "underage"; // Diese Zeile ist wird unten erklärt
   System.out.println(ageState);
}

```

```csharp
// C#
Console.WriteLine("Enter the age: ");
int age = Convert.ToInt32(Console.ReadLine());

string ageState = age > 18 ? "adult" : "underage";
Console.WriteLine(ageState);
```

`ageState = age > 18 ? "adult" : "underage"` besteht aus folgenden Elementen:
- `ageState = <Ausdruck>` die Variable **ageState** bekommt den Ergebniswert von <Ausdruck> zugewiesen
- `age > 18` stellt die zu prüfende Bedingung dar
- `?` könnte man als das Fragezeichen am Ende der Bedingung verstehen. Also die Bedingung wird davor gesetzt und danach kommen jene Anweisungen, die je nach Fall ausgeführt werden sollen.
- `"adult"` ist der Wert, der ausgegeben wird, wenn die Bedingung wahr ist
- `:` trennt die beiden möglichen Ergebnisse: wenn bedingung wahr bzw. falsch ist.
- `"underage"` ist der Wert, der ausgegeben wird, wenn die Bedingung falsch ist.

Diese komprimierte Version ist aufgrund der schlechteren Lesbarkeit jedoch sparsam zu verwenden.

## `switch` Anweisung

Darf eine Variable eine bestimmte Anzahl an Werten annehmen und je nach Wert wird ein anderer Code ausgeführt, würde man es natürlich mit verschachtelten `if`'s zwar lösen können, so eine Verschachtelung wird aber sehr schnell unübersichtlich. Dafür gibt es die mehrfache Verzweigung. 

Die `switch`-Anweisung wird verwendet, wenn Sie eine Variable haben und basierend auf ihrem Wert verschiedene Aktionen durchführen möchten. Es ist eine prägnante Möglichkeit, mehrere Bedingungen zu behandeln:

```java
// Java
switch (Variable) {
    case Wert1:
        // Code, der ausgeführt wird, wenn Variable gleich Wert1 ist
        break;
    case Wert2:
        // Code, der ausgeführt wird, wenn Variable gleich Wert2 ist
        break;
    default:
        // Code, der ausgeführt wird, wenn Variable zu keinem Fall passt
}
```

```csharp
// C#
switch (Variable) {
    case Wert1:
        // Code, der ausgeführt wird, wenn Variable gleich Wert1 ist
        break;
    case Wert2:
        // Code, der ausgeführt wird, wenn Variable gleich Wert2 ist
        break;
    default:
        // Code, der ausgeführt wird, wenn Variable zu keinem Fall passt
        break;
}
```

In sowohl Java als auch C# wird die `break`-Anweisung verwendet, um die `switch`-Anweisung zu verlassen, nachdem ein Fall übereinstimmt.

Diese bedingten Anweisungen sind leistungsstarke Werkzeuge in der Programmierung und ermöglichen es Ihnen, den Ablauf Ihres Codes basierend auf verschiedenen Bedingungen zu steuern.

Zurück zur [Startseite](../README.md)
