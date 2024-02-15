# Bedingungen

Programme sind nicht nur eine Folge von Tätigkeiten. In manchen Fällen müssen aufgrund von Parametern (sogenannte Variablen) Entscheidungen getroffen werden, um den weiteren Verlauf des Programms zu definieren. Zum Beispiel:
- Wenn der Angestellte Herr Müller weniger als 1500€ Brutto im Monat verdient, hat er Anspruch auf eine Förderung. In diesem Fall wird im Anschluss die Auszahlung der Förderung angestoßen.
- Wenn die Familie Mayer weniger als 3000€ monatliches Gesamteinkommen hat, hat sie Anspruch auf Wohnbeihilfe. Hier wird der Ablauf zur Auszahlung der Wohnbeihilfe genehmigt.

Entscheidungen können in einem Programm auf verschiedene Art und Weisen erfolgen. 
  - Einerseits mit einem klassischen `if ... then ... else ...` (Wenn Bedingung erfüllt, dann tue dies und sonst tue das). 
  - In speziellen Fälle kann man `switch ... case ... break` verwenden

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

### Erste IF-Anweisungen

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
}
```

```csharp
// C#
Console.WriteLine("Enter the amount: ");
int amount = Convert.ToInt32(Console.ReadLine());

if (amount == 250) {
   Console.WriteLine("The glass is full!");
} else if (amount == 125) {
   Console.WriteLine("The glass is half full!");
} else if (amount < 250) {
   Console.WriteLine("The glass is not full anymore!");
}
```

### Sind alle möglichen Fälle wirklich abgedeckt?

Jetzt fällt uns auf, dass eine Zahl über 250 zu keiner Ausgabe führt. Uns fehlt also noch eine Bedingung:

#### Java 

```Java
Scanner scanner = new Scanner(System.in);
int amount = scanner.nextInt();

if (amount == 250) {
   System.out.println("The glass is full!");
} else if (amount == 125) {
   System.out.println("The glass is half full!");
} else if (amount < 250) {
   System.out.println("The glass is not full anymore!");
} else {
   System.out.println("The glass is more than full!");
}
```

#### C#

```c#
Console.WriteLine("Enter the amount: ");
int amount = Convert.ToInt32(Console.ReadLine());

if (amount == 250) {
   Console.WriteLine("The glass is full!");
} else if (amount == 125) {
   Console.WriteLine("The glass is half full!");
} else if (amount < 250) {
   Console.WriteLine("The glass is not full anymore!");
} else {
   Console.WriteLine("The glass is more than full!");
}
```

Jetzt deckt unser Programm alle Fälle ab und ist soweit optimiert, dass möglichst wenige Bedingungen geprüft werden. Wir sind fürs Erste fertig.

## Die komprimierte Version von WENN-Anweisungen

Stellen Sie sich vor, sie sollen Codezeilen sparen und die DANN- und SONST-Anweisungen befüllen dieselbe Variable. Unter anderem für diesen speziellen Fall gibt es den **ternären Operator**.

#### Java 

```Java
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   int age = scanner.nextInt();

   String ageState = age > 18 ? "adult" : "underage"; // Diese Zeile ist wird unten erklärt
   System.out.println(ageState);
}

```

#### C#

```c#
Console.WriteLine("Enter the age: ");
int age = Convert.ToInt32(Console.ReadLine());

string ageState = age > 18 ? "adult" : "underage";
Console.WriteLine(ageState);
```

***ageState = age > 18 ? "adult" : "underage"*** besteht aus folgenden Elementen:
- ***ageState = <Ausdruck>***: die Variable **ageState** bekommt den Ergebniswert von <Ausdruck> zugewiesen
- ***age > 18*** stellt die zu prüfende Bedingung dar
- ***?*** könnte man als das Fragezeichen am Ende der Bedingung verstehen. Also die Bedingung wird davor gesetzt und danach kommen jene Anweisungen, die je nach Fall ausgeführt werden sollen.
- ***"adult"*** ist der Wert, der ausgegeben wird, wenn die Bedingung wahr ist
- ***:*** trennt die beiden möglichen Ergebnisse: wenn bedingung wahr bzw. falsch ist.
- ***"underage"*** ist der Wert, der ausgegeben wird, wenn die Bedingung falsch ist.

Diese komprimierte Version ist aufgrund der schlechteren Lesbarkeit jedoch sparsam zu verwenden.

## Mehrfache Verzweigung

Darf eine Variable eine bestimmte Anzahl an Werten annehmen und je nach Wert wird ein anderer Code ausgeführt, würde man es natürlich mit verschachtelten WENNs zwar lösen können, so eine Verschachtelung wird aber sehr schnell unübersichtlich. Dafür gibt es die mehrfache Verzweigung. 

In Pseudocode formuliert, würde es folgendermaßen aussehen:

```
falls <Ausdruck> gleich:
  <Wert 1>: <Anweisung(en) 1>
  <Wert 2>: <Anweisung(en) 2>
  <Wert 3>: <Anweisung(en) 3>
  <Wert 4>: <Anweisung(en) 4>
  sonst: <Anweisung(en) 5>
Ende
```

Also falls `<Ausdruck>` `<Wert 1>` annimmt, führe `<Anweisung(en) 1>` aus bzw. `<Wert 2>`, führe `<Anweisung(en) 2>` aus bzw. `<Wert 3>` ...

`<Ausdruck>` kann hier im einfachsten Falle eine Variable sein, die verschiedene Werte annehmen darf oder eine Operation, die idealerweise mehr als 2 mögliche Werte annehmen darf.

Zu erwähnen ist, dass <Wert 1>, <Wert 2>, ... den Rückgabewert des Ausdruckes darstellen! Es kann also Werte oder das Ergebnis von Operationen wie a + b sein (zB eine Zahl, einen String, ...).

Das bedeutet auch, dass im Gegensatz zur WENN-Anweisung keine Bedingungen wie: i > 5, die einen boolschen Wert ergeben, erlaubt sind, da diese sich nicht direkt auf den `<Ausdruck>` beziehen.

#### Java 

```Java
switch (Variable){
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

#### C#

```c#
switch (Variable){
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

In einem switch-statement sind folgende Schlüsselwörter zu beachten:
- `switch`: öffnet den Block der mehrfachen Verzweigung. Unmittelbar danach ist der `<Ausdruck>` zu finden.
- `case`: startet den Block eines Anwendungsfalls. Direkt danach folgt das Kriterium für die Auswahl dieses Falles. 
- `break`: wird verwendet, um die switch-Anweisung zu verlassen, nachdem ein Fall übereinstimmt. 
- `default`: sollte keiner der Werte `<Ausdruck>` entsprechen, wird der darauffolgender Code-Teil ausgeführt. Dieses Schlüsselwort ist optional. Dieser Code-Teil benötigt keinen `break`, da er am Schluss ist.

Diese bedingten Anweisungen sind leistungsstarke Werkzeuge in der Programmierung und ermöglichen es Ihnen, den Ablauf Ihres Codes basierend auf verschiedenen Bedingungen zu steuern.

### Mehrfache Ausdrücke und Gruppierung von Kriterien

Seit JDK 12 können mehrere Kriterien nach einem ***case*** vorkommen, getrennt durch einen Beistrich.

Seit JDK 13 stehen auch sogennante **switch-Ausdrücke** zur Verfügung. Der Vorteil darin ist, dass kein ***break*** mehr benötigt wird.
Hierfür ändert sich die Notation. Statt dem ***:*** nach dem gesuchten Wert werden ***->*** verwendet. Diese müssen mit ***,*** getrennt werden.

Wichtig ist zu wissen, dass **switch-Ausdrücke** **alle möglichen Kriterien/Werte abdecken müssen** (entweder mit einem default-Block oder die case-Blöcke decken alles ab), während switch-Statements durchaus Kriterien/Werte auslassen können.

Auch neu mit den switch-Expressions ist das Schlüsselwort ***yield*** statt ***return***. Damit kann der ***case***-Block einen Wert zurückgeben. 

[Pattern-Matching](https://docs.oracle.com/en/java/javase/17/language/pattern-matching-switch-expressions-and-statements.html#GUID-E69EEA63-E204-41B4-AA7F-D58B26A3B232) wird in dieser Anleitung bewusst ausgelassen, da derzeit nicht sinnvoll. Sollte Interesse bestehen, könnte ihr euch einlesen.

#### Java 

```Java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int grade = scanner.nextInt();

    String gradeDescription = switch (grade){
        case 1 -> yield "Sehr gut";
        case 2 -> yield "Gut"; 
        case 3 -> yield "Befriedigend"; 
        case 4 -> yield "Genügend"; 
        case 5 -> yield "Nicht Genügend"; 
        default -> yield "Ist keine Note!";
   }

   System.out.println("Your grade ist: " + gradeDescription + "!");
}
```

#### C#

```c#

```



Zurück zur [Startseite](README.md)
