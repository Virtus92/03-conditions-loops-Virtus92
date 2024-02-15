# Erreichbarkeit von Variablen im Code (Scope)

Wie im letzten Kapitel bereits gelernt, benötigen Programme "Behälter" zur Speicherung von Daten wie:
- Personendaten
- Zwischenergebnisse von Rechnungen
- ...

Diese werden `Variablen` gennant. Eine Variable besteht in den meisten Programmiersprachen aus folgenden Bestandteilen:
- der `Name` der Variable, mit dem diese im Rahmen des Programms aufgerufen werden kann
- der `Wert` der Variable. Dies ist der Inhalt dieser Variable
- der `Datentyp` der Variable definiert, welche Werte in die Variable hineingespeichert werden dürfen. In vielen Programmiersprachen wird auch der Datentyp explizit definiert (in manchen Programmiersprachen wird kein Datentyp definiert, sodass man in der Variable ziemlich alles hineinspeichern kann, z.B. Javascript). In diesem Kapitel arbeiten wir mit typisierten Programmiersprachen, also definieren wir den Datentyp bei der Deklaration der Variable.

Bisher haben wir lediglich die genannten 3 Eigenschaften einer Variable kennengelernt. Variablen haben aber eine 4. Eigenschaft: der `Scope` der Variable.

In der Programmierung bezieht sich der `Scope` auf den Gültigkeitsbereich einer Variable, das heißt, an welchen Stellen im Code auf die Variable zugegriffen werden kann. Es ist wichtig zu verstehen, wo eine Variable deklariert ist und wo sie verwendet werden kann. Hier betrachten wir die Erreichbarkeit von Variablen in Java und C#.

## Java

In Java wird der Scope einer Variable durch die geschweiften Klammern `{}` definiert. Eine Variable, die innerhalb dieser Klammern deklariert wird, ist nur innerhalb dieser Klammern sichtbar. Hier ein Beispiel:

```java
// Variable `zahl` ist nur im Bereich des IF-Statements sichtbar
if (condition) {
    int number = 10;
    // Variable `number` kann hier verwendet werden
}

// Hier ist die Variable `number` nicht mehr erreichbar und würde einen Fehler verursachen
```

Um sicherzustellen, dass die Variable in einem größeren Bereich sichtbar ist, muss sie außerhalb der geschweiften Klammern deklariert werden:

```java
// Variable `zahl` ist jetzt im gesamten Block sichtbar
int number;
if (condition) {
    number = 10;
    // Variable `number` kann hier verwendet werden
}

// Variable `number` kann hier immer noch verwendet werden
```

## C#

In C# funktioniert die Erreichbarkeit von Variablen ähnlich wie in Java. Der Scope wird durch geschweifte Klammern definiert:

```csharp
// Variable `number` ist nur im Bereich des IF-Statements sichtbar
if (condition) {
    int number = 10;
    // Variable `number` kann hier verwendet werden
}

// Hier ist die Variable `number` nicht mehr erreichbar und würde einen Fehler verursachen
```

Um die Variable in einem größeren Bereich sichtbar zu machen, muss sie außerhalb der geschweiften Klammern deklariert werden:

```csharp
// Variable `number` ist jetzt im gesamten Block sichtbar
int number;
if (condition) {
    number = 10;
    // Variable `number` kann hier verwendet werden
}

// Variable `number` kann hier immer noch verwendet werden
```

> [!IMPORTANT] Es ist wichtig, den Scope von Variablen so zu steuern, dass sie nur dort sichtbar sind, wo sie benötigt werden. Dies verbessert die Lesbarkeit des Codes und vermeidet potenzielle Fehler durch den Zugriff auf undefinierte Variablen. 

Zurück zur [Startseite](README.md)
