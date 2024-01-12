# Variablen und Erreichbarkeit im Code

Wie im letzten Kapitel bereits gelernt, benötigen Programme "Behälter" zur Speicherung von Daten wie:
- Personendaten
- Zwischenergebnisse von Rechnungen
- ...

Diese werden **Variablen** gennant.Eine Variable besteht in den meisten Programmiersprachen aus folgenden Bestandteilen:
- der **Name** der Variable mit dem diese im Rahmen des Programms aufgerufen werden kann
- der **Wert** der Variable. Dies ist der Inhalt dieser Variable
- der **Datentyp** der Variable definiert, welche Werte in die Variable hineingespeichert werden dürfen. In vielen Programmiersprachen wird auch der Datentyp explizit definiert (in manchen Programmiersprachen wird kein Datentyp definiert, sodass man in der Variable ziemlich alles hineinspeichern kann.). In diesem Kapitel arbeiten wir mit typisierten Programmiersprachen, also definieren wir den Datentyp bei der Deklaration der Variable.

Bisher haben wir lediglich die letzten 3 Eigenschaften einer Variable gesehen. Variablen haben aber eine 4. Eigenschaft: der **Scope** der Variable.
Dieser definiert, wo die Variable verwendet werden darf: 
  - innerhalb eines Blocks (z.B. innerhalb eines IF-Statements)
  - innerhalb einer Methode
  - innerhalb einer Klasse
  - global (wird in der Regel nicht verwendet)

Zur Veranschaulichung und Erklärung nehmen wir unser Beispiel vom vorigen Kapitel her:

Wir wollen jetzt erst am Schluss des Programms die Ausgabe in der Console machen. Wir benötigen also eine Variable, die den Status des Glas abspeichert. Versuchen wir es mal:

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

```

Wir müssen unsere Variable also im übergeordneten Block definieren, in diesem Fall dort, wo ***scanner*** und ***amount*** definiert sind. 

## Variable am richtigen Ort deklarieren

Hier gilt die Regel, jede Variable ist dort zu deklarieren, wo sie den kleinstmöglichen Scope hat und jedoch überall dort erreichbar ist, wo sie benötigt wird: jede Variable soll in jenem Block deklariert werden, der alle Aufrufe dieser Variable beinhaltet. Sollte der Scope zu klein sein: z.B. die Variable ist in einem Block definiert und das Programm versucht, diese im übergeordneten Block aufzurufen, so wird das Programm einen Fehler beim Compilieren auswerfen. 

Warum ist es gut, Variablen genau in dem Block zu deklarieren, wo man diese benötigt: So kann der für die Variable benötigte **Speicher freigegeben** werden, sobald der Block abgeschlossen wurde. So sorgt ihr dafür, dass eure Programme zu jedem Zeitpunkt lediglich den Speicher verbrauchen, der tatsächlich unbedingt benötigt wird. 

Wir deklarieren in unserem Beispiel die Variable ***status*** also in dem Block, der alle Aufrufe beinhaltet:

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

System.out.println("The glass is " + status + "!"); // Hier ist die Variable status also nicht erreichbar. Diese Anweisung würde zu einem Fehler führen.

```

### C#

```c#

```

Was war der Grund, warum wir die Ausgabe erst am Schluss machen?

So haben wir dafür gesorgt, dass wir sehr einfach die Ausgabe auch verändern können. Angenommen, wir wollen folgenden Text ausgeben: ***"The status of the glass is: " + status + "!"*** In der vorherigen Variante hätten wir den Text 4 Mal ändern müssen. In der neuen Variante müssen wir den Text lediglich ein Mal ändern. Das spart uns nicht nur Arbeit, sondern verhindert es auch, dass wir irgendwo vergessen, den Text anzupassen.

Zurück zur [Startseite](README.md)
