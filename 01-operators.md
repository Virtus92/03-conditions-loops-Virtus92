# Operatoren

In der Softwareentwicklung werden Operatoren verwendet, um Operationen und Vergleiche zwischen Variablen oder Werten zu ermöglichen. Man unterscheidet zwischen arithmetischen, relationalen und logischen Operatoren.

## Arithmetische Operatoren

Mit arithmetischen Operatoren kann man mathematische Berechnungen durchführen:

| Operator | Bedeutung                   |
| -------- | --------------------------- |
| +        | Addition                    |
| -        | Subtraktion                 |
| *        | Multiplikation              |
| /        | Division                    |
| %        | Modulo (Rest einer Division) |

**Arithmetische Operatoren: Ein einfaches Lernbeispiel in Java und C#**

In diesem Beispiel werden wir die arithmetischen Operatoren in den Programmiersprachen Java und C# kennenlernen. Arithmetische Operatoren werden verwendet, um mathematische Operationen durchzuführen, wie Addition, Subtraktion, Multiplikation und Division.

### Java-Codebeispiel:

```java
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
```

### C#-Codebeispiel:

```csharp

        // Arithmetische Operatoren

        // Variablen deklarieren und initialisieren
        int a = 10;
        int b = 5;

        // Addition
        int additionResult = a + b;
        Console.WriteLine("Addition: " + a + " + " + b + " = " + additionResult);

        // Subtraktion
        int subtractionResult = a - b;
        Console.WriteLine("Subtraktion: " + a + " - " + b + " = " + subtractionResult);

        // Multiplikation
        int multiplicationResult = a * b;
        Console.WriteLine("Multiplikation: " + a + " * " + b + " = " + multiplicationResult);

        // Division
        int divisionResult = a / b;
        Console.WriteLine("Division: " + a + " / " + b + " = " + divisionResult);

        // Modulo (Rest der Division)
        int moduloResult = a % b;
        Console.WriteLine("Modulo: " + a + " % " + b + " = " + moduloResult);
```

### Erklärung:

Beide Codebeispiele führen arithmetische Operationen mit den Variablen `a` und `b` durch und geben die Ergebnisse aus. Die Operatoren sind in beiden Sprachen ähnlich:

- **Addition (`+`):** Addiert die Werte von `a` und `b`.
- **Subtraktion (`-`):** Subtrahiert den Wert von `b` von `a`.
- **Multiplikation (`*`):** Multipliziert die Werte von `a` und `b`.
- **Division (`/`):** Teilt den Wert von `a` durch `b`. Das Ergebnis ist eine Ganzzahl, da beide Variablen vom Typ `int` sind.
- **Modulo (`%`):** Gibt den Rest der Division von `a` durch `b` zurück.

### Ausgabe:

Wenn du diese Java- und C#-Codebeispiele ausführst, sollten die Ergebnisse der arithmetischen Operationen auf der Konsole angezeigt werden. Du kannst die Werte von `a` und `b` nach Belieben ändern und die Auswirkungen auf die Ergebnisse beobachten.

## Kurzschreibweisen

Kurzschreibweisen helfen, das Ergebnis einer Operation mit einer Variable wieder in diese Variable zu speichern. Diese funktionieren mit allen arithmetischen Operatoren:

### Java Beispiel

```java
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
```

### C# Beispiel

```csharp
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
```

## Relationale Operatoren (Vergleichsoperatoren)

In der Programmierung werden relationale Operatoren verwendet, um Werte zu vergleichen. Diese Operatoren geben in der Regel einen booleschen Wert (`true` oder `false`) zurück.

Hier sind die häufigsten relationalen Operatoren:

| Operator | Bedeutung           |
| -------- | -------------------  |
| `<`      | Kleiner             |
| `>`      | Größer              |
| `==`     | Gleich              |
| `!=`     | Ungleich            |
| `<=`     | Kleiner oder gleich |
| `>=`     | Größer oder gleich  |

## Beispiel

Angenommen, wir haben zwei Variablen `a` und `b`, und wir wollen ihre Beziehung zueinander überprüfen.

### Beispiel in Java

```java
int a = 5;
int b = 8;

boolean isALessThanB = a < b;     // true
boolean isAGreaterThanB = a > b;  // false
boolean areAAndBEqual = a == b;   // false
boolean areANotEqualB = a != b;    // true
boolean isALessThanOrEqualB = a <= b;  // true
boolean isAGreaterThanOrEqualB = a >= b;  // false
```

### Beispiel in C#

```csharp
int a = 5;
int b = 8;

bool isALessThanB = a < b;     // true
bool isAGreaterThanB = a > b;  // false
bool areAAndBEqual = a == b;   // false
bool areANotEqualB = a != b;    // true
bool isALessThanOrEqualB = a <= b;  // true
bool isAGreaterThanOrEqualB = a >= b;  // false
```

Diese Operatoren sind wichtig, wenn Sie Bedingungen in Ihren Programmen erstellen möchten, wie zum Beispiel "Wenn `a` größer als `b` ist, dann mache etwas."

## Logische Operatoren

Logische Operatoren werden verwendet, um Boolesche Werte zu kombinieren und Bedingungen zu erstellen, die auf mehreren Werten basieren. 

Stellen wir uns vor, wir bieten den:die Benutzer:in Suchbegriffe in ein Suchfeld einzugeben. Wenn diese:r mehrere Begriffe eingibt könnten wir definieren, dass:
- entweder alle Begriffe enthalten sein müssen, so müssten wir den logischen Operator `&&` (Und) zwischen den Bedingungen verwenden
- oder eines der Begriffe enthalten sein muss, so müssten wir den logischen Operator `||` (Oder) zwischen den Bedingungen verwenden
- wenn nur eines der Begriffe enthalten sein muss, aber die anderen nicht wird der Operator `^` (exklusiv Oder) zwischen den Bedingungen verwendet
- soll aber ein Begriff nicht enthalten sein, müssten wir den logischen Operator `!` (Negation) unmittelbar vor der Bedingung verwenden

Hier nochmals die wichtigsten logischen Operatoren aufgezählt:

- `&&` (Und)
- `||` (Oder)
- `^` (exklusiv Oder)
- `!` (Negation)

## Beispiel

Angenommen, wir haben zwei Boolesche Variablen `x` und `y`, und wir wollen logische Operationen mit ihnen durchführen.

### Beispiel in Java

```java
boolean x = true;
boolean y = false;

boolean andResult = x && y; // false
boolean orResult = x || y;  // true
boolean xorResult = x ^ y;  // true
boolean notResultX = !x;    // false
boolean notResultY = !y;    // true
```

### Beispiel in C#

```csharp
bool x = true;
bool y = false;

bool andResult = x && y; // false
bool orResult = x || y;  // true
bool xorResult = x ^ y;  // true
bool notResultX = !x;    // false
bool notResultY = !y;    // true
```

## Ergebnisse von logischen Operatoren

Die Ergebnisse von logischen Operatoren können in sogenannten Wahrheitstabellen dargestellt werden.

### Wahrheitstabellen für logische Operatoren

Hier folgen die Wahrheitstabellen für die logischen Operatoren "Und" (`&&`), "Oder" (`||`), "exklusiv Oder" (`^`) und "Negation" (`!`):

#### "Und" (`&&`) Wahrheitstabelle

| A     | B     | A && B |
| ----- | ----- | ------- |
| true  | true  | true    |
| true  | false | false   |
| false | true  | false   |
| false | false | false   |

#### "Oder" (`||`) Wahrheitstabelle

| A     | B     | A \|\| B |
| ----- | ----- | --------- |
| true  | true  | true      |
| true  | false | true      |
| false | true  | true      |
| false | false | false     |

#### "exklusiv Oder" (`^`) Wahrheitstabelle

| A     | B     | A \|\| B |
| ----- | ----- | --------- |
| true  | true  | false     |
| true  | false | true      |
| false | true  | true      |
| false | false | false     |

#### "Negation" (`!`) Wahrheitstabelle

| A     | !A    |
| ----- | ----- |
| true  | false |
| false | true  |

Diese Wahrheitstabellen zeigen die möglichen Ergebnisse der logischen Operatoren für alle Kombinationen der Eingabewerte `A` und `B`, sowie die Negation von `A`.

### Bedeutung der Werte

- `true`: Der Ausdruck ist wahr.
- `false`: Der Ausdruck ist falsch.

Die logischen Operatoren ermöglichen es, komplexe Bedingungen zu erstellen, indem mehrere Ausdrücke miteinander kombiniert werden. Zum Beispiel kann man sagen: "Wenn x wahr ist und y wahr ist, dann mache etwas."

Im folgenden Kapitel lernen wir wie solche Bedingungen erstellt werden.

Zurück zur [Startseite](README.md)