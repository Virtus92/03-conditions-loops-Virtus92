# Variablen und Erreichbarkeit im Code

Zur Veranschaulichung und Erklärung nehmen wir unser Beispiel vom vorigen Kapitel her:

Wir wollen jetzt erst am Schluss des Programms die Ausgabe in der Console machen. Wir benötigen also eine Variable, die den Status des Glas abspeichert. Versuchen wir es mal:

#### Java 

```Java
Scanner scanner = new Scanner(System.in);
int amount = scanner.nextInt();

if (amount == 250) {
   String status = "full"; // Wenn die Variable hier deklariert wird, ist diese auch nur in diesem Block erreichbar, sprich nur zwischen den { } von der IF-Anweisung.
} 

System.out.println("The glass is " + status); // Hier ist die Variable status also nicht erreichbar. Diese Anweisung würde zu einem Fehler führen.

```

#### C#

```c#

```

Wir müssen unsere Variable also im übergeordneten Block definieren, in diesem Fall dort, wo ***scanner*** und ***amount*** definiert sind. 

Hier gilt die Regel, jede Variable muss in jenem Block deklariert werden, der alle Aufrufe dieser Variable beinhaltet oder in einem übergeordneten Block. Ansonsten wird das Programm einen Fehler beim Compilieren auswerfen. Warum ist es gut, Variablen genau in dem Block zu deklarieren, wo man diese benötigt: So kann der für die Variable benötigte Speicher freigegeben werden, sobald der Block abgeschlossen wurde. So sorgt ihr dafür, dass eure Programme zu jedem Zeitpunkt lediglich den Speicher verbrauchen, der tatsächlich unbedingt benötigt wird. 

Wir deklarieren die Variable ***status*** also in dem Block, der alle Aufrufe beinhaltet:

#### Java 

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

#### C#

```c#

```

Was war der Grund, warum wir die Ausgabe erst am Schluss machen?

So haben wir dafür gesorgt, dass wir sehr einfach die Ausgabe auch verändern können. Angenommen, wir wollen folgenden Text ausgeben: ***"The status of the glass is: " + status + "!"*** In der vorherigen Variante hätten wir den Text 4 Mal ändern müssen. In der neuen Variante müssen wir den Text lediglich ein Mal ändern. Das spart uns nicht nur Arbeit, sondern verhindert es auch, dass wir irgendwo vergessen, den Text anzupassen.

Zurück zur [Startseite](README.md)
