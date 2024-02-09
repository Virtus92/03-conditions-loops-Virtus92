# Erreichbarkeit von Variablen im Code (Scope)

Wie im letzten Kapitel bereits gelernt, benötigen Programme "Behälter" zur Speicherung von Daten wie:
- Personendaten
- Zwischenergebnisse von Rechnungen
- ...

Diese werden `Variablen` gennant.Eine Variable besteht in den meisten Programmiersprachen aus folgenden Bestandteilen:
- der `Name` der Variable, mit dem diese im Rahmen des Programms aufgerufen werden kann
- der `Wert` der Variable. Dies ist der Inhalt dieser Variable
- der `Datentyp` der Variable definiert, welche Werte in die Variable hineingespeichert werden dürfen. In vielen Programmiersprachen wird auch der Datentyp explizit definiert (in manchen Programmiersprachen wird kein Datentyp definiert, sodass man in der Variable ziemlich alles hineinspeichern kann.). In diesem Kapitel arbeiten wir mit typisierten Programmiersprachen, also definieren wir den Datentyp bei der Deklaration der Variable.

Bisher haben wir lediglich die letzten 3 Eigenschaften einer Variable gesehen. Variablen haben aber eine 4. Eigenschaft: der **Scope** der Variable.
Dieser definiert, wo die Variable verwendet werden darf: 
  - innerhalb eines Blocks (z.B. innerhalb eines IF-Statements)
  - innerhalb einer Methode
  - innerhalb einer Klasse
  - global (wird in der Regel nicht verwendet)

Zur Veranschaulichung und Erklärung nehmen wir unser Beispiel vom vorigen Kapitel her:

Wir wollen am Schluss unseres Programms die Ausgabe in der Console machen und deklarieren die Variable `status` mit einem zu kleinen Scope.

## Java 

```Java
Scanner scanner = new Scanner(System.in);
int amount = scanner.nextInt();

if (amount == 250) {
   String status = "full"; // Wenn die Variable hier deklariert wird, ist diese auch nur in diesem Block erreichbar, sprich nur zwischen den { } von der IF-Anweisung.
} 

System.out.println("The glass is " + status); // Hier ist die Variable status also nicht erreichbar. Diese Anweisung würde zu einem Fehler führen.

```

## C#

```c#
Console.WriteLine("Enter the amount: ");
int amount = Convert.ToInt32(Console.ReadLine());

if (amount == 250) {
   string status = "full"; // Wenn die Variable hier deklariert wird, ist diese auch nur in diesem Block erreichbar, sprich nur zwischen den { } von der IF-Anweisung.
} 

System.out.println("The glass is " + status); // Hier ist die Variable status also nicht erreichbar. Diese Anweisung würde zu einem Fehler führen.
```

Wir müssen unsere Variable also im übergeordneten Block definieren, in diesem Fall dort, wo `scanner` und `amount` definiert sind. 

## Variable am richtigen Ort deklarieren

> [!IMPORTANT]
> Grundsätzlich gilt die Regel, jede Variable ist dort zu deklarieren, wo sie den kleinstmöglichen Scope hat und jedoch überall dort erreichbar ist, wo sie benötigt wird: jede Variable soll in jenem Block deklariert werden, der alle Aufrufe dieser Variable beinhaltet. Die Gründe dafür sind:
> - Variablen verbrauchen Speicher. So soll der Speicher wieder freigegeben werden können, wenn diese nicht mehr gebraucht wird.
> - ein zu großer Scope kann unter Umständen zu Wechselwirkungen führen (z.B. eine Methode verändert den Wert von der Variable A, während eine andere Methode A verwendet).

Sollte der Scope zu klein sein: z.B. die Variable ist in einem Block definiert und das Programm versucht, diese im übergeordneten Block aufzurufen, so wird das Programm einen Fehler beim Compilieren auswerfen. (Siehe Beispiel weiter oben) 

Wir deklarieren in unserem Beispiel die Variable `status` also in dem Block, der alle Aufrufe beinhaltet:

### Java 

```Java
Scanner scanner = new Scanner(System.in);
int amount = scanner.nextInt();
String status = "";

if (amount == 250) {
   status = "full";
} else if (amount == 125) {
    status = "half full";
} else if (amount < 250) {
   status = "not full anymore";
} else {
    status = "more than full";
}

System.out.println("The glass is " + status + "!");

```

### C#

```c#
Console.WriteLine("Enter the amount: ");
int amount = Convert.ToInt32(Console.ReadLine());
string status = "";

if (amount == 250) {
   status = "full";
} else if (amount == 125) {
   status = "half full";
} else if (amount < 250) {
   status = "not full anymore";
} else {
   status = "more than full";
}

System.out.println("The glass is " + status);
```

Was war der Grund, warum wir die Ausgabe erst am Schluss machen und nicht in jedem If-Block ein Mal?

So haben wir dafür gesorgt, dass wir die Ausgabe auch sehr einfach verändern können. 

Angenommen, wir wollen folgenden Text ausgeben: `"The status of the glass is: " + status + "!"`. 

Im Beispiel des vorigen Kapitels hatten wir in jedem If-Statement die Konsolenausgabe. Dort hätten wir den Text in jedem IF-Statement ändern müssen. 

In der neuen Variante müssen wir den Text lediglich ein Mal am Schluss ändern. Das spart uns nicht nur Arbeit, sondern sorgt auch dafür, dass wir nirgendwo vergessen, den Text anzupassen (geringere Fehleranfälligkeit).

Zurück zur [Startseite](README.md)
