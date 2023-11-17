# Bedingungen

Sehr häufig müssen wir in unseren Programmen überprüfen, ob eine Bedingung erfüllt ist. Dies kann auf verschiedenen Art und Weisen erfolgen. Einerseits mit einem klassischen if ... then ... else ... (Wenn Bedingung erfüllt, dann tue dies und sonst tue das). In speziellen Fälle kann man switch ... case ... break verwenden

## Wenn *Bedingung erfüllt*, dann *tue dies* sonst *tue das*

Die einfachste Art, Bedingungen zu überprüfen und unterschiedliche Codeteile auszuführen, je nach Bedingungsergebnis wird mit eine ***WENN ... DANN ... SONST ..."-Anweisung geprüft. Hier kommen uns die Operatoren aus dem vorigen Kapitel zugute. Wie funktioniert diese:

```
WENN <Bedingungen erfüllt>
DANN <tue dies>
SONST <tue das>
```

In ***<Bedingungen erfüllt>*** kann eine Bedingung (diese ergibt immer entweder true oder false) vorzufinden sein. Möchte man mehrere Bedingungen in einem überprüfen müssen wir logische Operatoren verwenden, um die einzelnen Bedingungen zu kombinieren.

In ***<tue dies>*** bzw. <tue das> ist jeweils ein eigener Programmcode zu finden. 

### Erste WENN-Anweisungen

Wir wollen ein Programm schreiben, das entscheidet, ob ein Glas voll, nicht mehr voll oder halb voll ist:
- Bei 250 ml ist das Glas voll
- Bei weniger als 250 ml ist das Glas nicht mehr voll
- Bei 125 ml ist das Glas halb voll

Zuerst wollen wir die einzelnen Bedingungen aus der Liste überprüfen:

#### Java 

```Java
Scanner scanner = new Scanner(System.in);
int amount = scanner.nextInt();

if (amount == 250) {
   System.out.println("The glass is full!");
}
if (amount < 250) {
   System.out.println("The glass is not full anymore!");
}
if (amount == 125) {
   System.out.println("The glass is half full!");
}
```

#### C#

```c#

```

### Verschachtelung von Bedingungen

Im vorigen Beispiel merken wir aber schnell, dass das Glas gleichzeitig halb voll und nicht mehr voll ist. Wenn man IF-Anweisungen einfach untereinander schreibt, werden diese der Reihe nach ausgeführt, egal, ob die eine Bedingung eine andere ausschließen würde. Somit müssen die 3 IF-Anweisungen einander ausschließen. Hierfür die ***else*** gedacht. Es bedeutet: *Nur dann, wenn die Bedingung nicht erfüllt ist, führe diesen Code aus*. So verändern wir unser Programm wie folgt:

#### Java 

```Java
Scanner scanner = new Scanner(System.in);
int amount = scanner.nextInt();

if (amount == 250) {
   System.out.println("The glass is full!");
} else if (amount < 250) {
   System.out.println("The glass is not full anymore!");
} else if (amount == 125) {
   System.out.println("The glass is half full!");
}
```

#### C#

```c#

```

### Reihenfolge bei verschachtelte Bedingungen

Jetzt haben wir das Problem, dass nie halb voll ausgegeben wird, weil die Bedingung ***if (amount < 250)*** immer zuerst greift, bevor die Bedingung ***if (amount == 125)*** geprüft werden kann. So müssen wir unser Programm noch einmal ändern:

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
}
```

#### C#

```c#

```

### Sind alle möglichen Fälle wirklich abgedeckt?

Oje, jetzt fällt uns auf, dass eine Zahl über 250 zu keiner Ausgabe führt. Uns fehlt also noch eine Bedingung:

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

```

Jetzt deckt unser Programm alle Fälle ab und ist soweit optimiert, dass möglichst wenige Bedingungen geprüft werden. Wir sind fürs Erste fertig.

## Die komprimierte Version von WENN-Anweisungen

Stellen Sie sich vor, sie sollen Codezeilen sparen und die DANN- und SONST-Anweisungen befüllen dieselbe Variable. Genau für diesen speziellen Fall wurde der **ternäre Operator** geschaffen. Hier ein Beispiel zur Veranschaulichung:

#### Java 

```Java
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   int age = scanner.nextInt();

   String ageState = age > 18 ? "adult" : "underage"; // Diese Zeile ist wird unten erklärt
   System.out.println(ageState);
}

```

***ageState = age > 18 ? "adult" : "underage"*** besteht aus folgenden Elementen:
- ***ageState = <Ausdruck>***: die Variable **ageState** bekommt den Ergebniswert von <Ausdruck> zugewiesen
- ***age > 18*** stellt die zu prüfende Bedingung dar
- ***?*** könnte man als das Fragezeichen am Ende der Bedingung verstehen. Also die Bedingung wird davor gesetzt und danach kommt was zu tun ist.
- ***"adult"*** ist der Wert, der ausgegeben wird, wenn die Bedingung wahr ist
- ***:*** trennt die beiden möglichen Ergebnisse (wenn bedingung wahr bzw. falsch). Man könnte sich vorstellen ***:*** stellt das sonst dar.
- ***"underage"*** ist der Wert, der ausgegeben wird, wenn die Bedingung falsch ist.

Diese komprimierte Version ist aufgrund der schlechteren Lesbarkeit jedoch sparsam zu verwenden.

#### C#

```c#

```


## Mehrfache Verzweigung

Darf eine Variable eine bestimmte Anzahl an Werten annehmen und je nach Wert wird ein anderer Code ausgeführt, würde man es natürlich mit verschachtelten WENNS zwar lösen können, so eine Verschachtelung wird aber sehr schnell unübersichtlich. Dafür gibt es die mehrfache Verzweigung. 

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

Also falls <Ausdruck> <Wert 1> annimmt, führe <Anweisung(en) 1> aus bzw. <Wert 2>, führe <Anweisung(en) 2> aus bzw. <Wert 3> ...

<Ausdruck> kann hier im einfachsten Falle eine Variable sein, die verschiedene Werte annehmen darf oder eine Operation, die idealerweise mehr als 2 mögliche Werte annehmen darf.

Zu erwähnen ist, dass <Wert 1>, <Wert 2>, ... sich bezieht immer auf den Ausdruck und stellt den Rückgabewert des Ausdruckes dar! Es können also Werte oder Operationen wie a + b sein (zB eine Zahl, einen String, ...). 

Das bedeutet auch, dass im Gegensatz zur WENN-Anweisung keine Bedingungen wie: i > 5, die einen boolschen Wert ergeben, erlaubt sind, da diese sich nicht direkt auf den <Ausdruck> beziehen.

#### Java 

```Java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int grade = scanner.nextInt();

    switch (grade){
        case 1: System.out.println("Sehr gut"); break;
        case 2: System.out.println("Gut"); break;
        case 3: System.out.println("Befriedigend"); break;
        case 4: System.out.println("Genügend"); break;
        case 5: System.out.println("Nicht Genügend"); break;
        default: System.out.println("Ist keine Note!");
   }
}
```
In einem switch-statement sind folgende Schlüsselwörter zu beachten:
- ***switch***: öffnet den Block der mehrfachen Verzweigung. Unmittelbar danach ist der <Ausdruck> zu finden.
- ***case***: startet den Block eines Anwendungsfalls. Direkt danach folgt das Kriterium für die Auswahl dieses Falles. 
- ***break***: sagt aus, dass der switch-Block hier abgebrochen wird, weil der Wert bereits gefunden wurde. 
- ***default***: sollte keiner der Werte <Ausdruck> entsprechen, wird der darauffolgender Code-Teil ausgeführt. Dieses Schlüsselwort ist optional. Dieser Code-Teil benötigt keinen ***break***, da er am Schluss ist.


#### C#

```c#

```

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
