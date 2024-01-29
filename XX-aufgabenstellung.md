# Aufgabenstellungen

Folgende Aufgabenstellungen sind zu lösen. Die dafür nötigen Informationen findest du in den weiteren Kapiteln.

## Operatoren

### Übung/Exercise 2.1: Eigenschaften einer Zahl / Characteristics of a number

**DE:**

Schreibe ein Programm, dass von der Konsole eine Zahl einliest und ausgibt:
- ob es sich um eine runde Zahl handelt
- ob die Zahl gerade ist
- ob die Zahl deiner Glückszahl entspricht (denk dir hierfür einfach eine eigene Glückszahl aus und gib sie zu Beginn des Programms auf der Konsole aus)
- ob die Zahl zweistellig ist

Tipp: Für die ersten beiden Punkte wirst du die Modulo Funktion brauchen. 

***EN:***

Write a program that reads a number from the console and calculates and prints characteristics of it:

    is the number round
    is the number even
    does the number equal your lucky number (choose any lucky number for this and print it to the console at the start of the program)
    does it have two digits

Hint: You might find the modulo operation helpful for the first two exercises. 


#### Abnahmekriterien

- die Benutzer\*innenführung ist klar
- die Variablennamen sind aussagekräftig
- das Programm funktioniert und entspricht den Anforderungen
- der\*die Teilnehmer\*in ist in der Lage sein\*ihr Programm zu erklären

### Übung/Exercise 2.2: Arbeits- oder Freizeit? / free time or work time?

**DE:**

In der CODERS.BAY arbeiten wir von 8:30 bis 15:30 Uhr. Schreibe ein Programm, das eine Zahl von der Konsole einliest und ausgibt ob die Stunde in der Arbeitszeit liegt oder nicht.

Bonus: von 12:00 bis 12:30 Uhr ist immer Mittagspause, gib also in der Zeit aus, dass Mittag ist. 

***EN:***

At CODERS.BAY we usually work from 8 to 15:30 o'clock. Write a program, that reads a number from the console and prints whether that hour is during our work time or not.

Bonus: We go for a lunch break between 12 and 13 o'clock, print that info in case the given number is between 12 and 13. 

#### Abnahmekriterien

- die Variablennamen sind aussagekräftig
- die Start- und Endezeit sind als Date gespeichert und für Vergleiche werden Date-Methoden verwendet???
- das Programm funktioniert und löst die geforderten Aufgaben
- der\*die Teilnehmer\*in ist in der Lage sein\*ihr Programm zu erklären

## Bedingungen

### Übung/Exercise 2.3: Noten übersetzen / Translating grades

**DE:**

Schreibe ein Programm, dass eine Schulnote in numerischer Form (1-5) in seine textuelle Form übersetzt:

    Bei einer 1 wird "Sehr gut" auf die Konsole geschrieben
    Bei einer 2 wird "Gut" auf die Konsole geschrieben
    Bei einer 3 wird "Befriedigend" auf die Konsole geschrieben
    Bei einer 4 wird "Genügend" auf die Konsole geschrieben
    Bei einer 5 wird "Nicht Gengügend" auf die Konsole geschrieben

***EN:***

Write a program that translates grades from its numerical form to a word representation.

    Print "Very good" in case of a 1.
    Print "Good" in case of a 2.
    Print "Satisfactory" in case of a 3.
    Print "Sufficient" in case of a 4.
    Print "Not sufficient" in case of a 5.

#### Abnahmekriterien

- Variablenname aussagekräftig und Datentyp sinnvoll gewählt
- das Programm funktioniert und bildet alle angeforderten Punkte korrekt ab
- der\*die Teilnehmer\*in ist in der Lage sein\*ihr Programm zu erklären und warum er\*sie es so gelöst hat (switch wäre hier die bessere Variante)

## Schleifen

### Übung/Exercise 2.4: OachkatzlSchwoaf / FizzBuzz

**DE:**

OachkatzlSchwoaf ist ein Spiel um Kindern Division näher zu bringen. Die Regeln sind einfach - Reih um wird beginnend bei der Zahl 1 nach oben gezählt. Ist die Zahl durch drei teilbar, darf die Zahl allerdings nicht genannt werden - man muss Oachkatzl sagen, ist die Zahl durch fünf teilbar muss Schwoaf gesagt werden. Und - ist die Zahl durch drei und fünf teilbar, muss OachkatzlSchwoaf gesagt werden.

Als Beispiel: “Eins! Zwei! Oachkatzl(3)! Vier! Schwoaf(5)! Oachkatzl(6)! Sieben! Acht! Oachkatzl(9)! Schwoaf(10)! Elf! Oachkatzl(12)! Dreizehn! Vierzehn! OachkatzlSchwoaf(15)! Sechzehn!”

Schreibe ein Programm, dass die Zahlen von 1 - 100 nach diesem Schema ausgibt. Du musst die Zahlen nicht in Wortform ausgeben, numerisch reicht. 

***EN:***

FizzBuzz is a game to explain divisions to children. The rules are simple - Starting with the number one players count up by one. Is the number dividable by three, you are not allowed to say the number but say "Fizz". Is it dividable by five "Buzz" needs to be said and if it's dividable by both three and five "FizzBuzz" needs to be said.

A round would start like this: “One! Two! Fizz(3)! Four! Buzz(5)! Fizz(6)! Seven! Eight! Fizz(9)! Buzz(10)!”

Write a program, that prints the numbers from 1 to 100 by those rules. You don't have to print the numbers as words, the numerical representation is sufficient. 

#### Abnahmekriterien

- Variablennamen aussagekräftig und Datentypen sinnvoll gewählt
- Benutzerführung klar, sofern vorhanden 
- das Programm funktioniert und bildet alle angeforderten Punkte korrekt ab
- der\*die Teilnehmer\*in ist in der Lage sein\*ihr Programm zu erklären und warum er\*sie es so gelöst hat (hier ist eine for-Schleife am sinnvollsten, auch wenn man while verwenden kann)

### Übung/Exercise 2.5: Das kleine Einmal-Eins

**DE:**

Schreibe mit Hilfe von Schleifen das kleine 1 x 1 auf der Konsole aus. Deine Ausgabe sollte in etwa folgendermaßen aussehen:

```
1er Reihe:
1 * 1 = 1
2 * 1 = 2
...
10 * 1 = 10
2er Reihe:
1 * 2 = 2
...
9 * 10 = 90
10 * 10 = 100
```

***EN:***

Use loops to print the 1 x 1 to the console. Your result should look something like this:

```
times 1:
1 * 1 = 1
2 * 1 = 2
...
10 * 1 = 10
times 2:
1 * 2 = 2
...
9 * 10 = 90
10 * 10 = 100
```

#### Abnahmekriterien

- Variablennamen aussagekräftig und Datentypen sinnvoll gewählt
- Benutzerführung klar, sofern vorhanden 
- das Programm funktioniert und bildet alle angeforderten Punkte korrekt ab
- der\*die Teilnehmer\*in ist in der Lage sein\*ihr Programm zu erklären und warum er\*sie es so gelöst hat (hier sind verschachtelte for-Schleifen am sinnvollsten, auch wenn man while-Schleifen verwenden könnte)

### Übung/Exercise 2.6: Caesar Chiffre

**DE:**

Wir wissen ja, dass jedes Zeichen in Java einen eindeutigen Code hat. Genauergesagt ist die numerische Repräsentation eines Characters/Zeichens der Unicode.

Die Caesar Chiffre ist ein simpler Verschlüsselungsalgorithmus bei dem alle Buchstaben um einen bestimmten offset X verschoben werden, erreichst du das Z solltest du wieder beim A starten, Sonderzeichen werden wir jetzt einmal auslassen.

Mit einer Caesar Chiffre von 6 würde aus dem Text:

```
Ein Charakter namens Caesar!
```

folgendes werden:

```
Kot Ingxgqzkx tgskty Igkygx!
```

wenn wir diesen Text nochmal um 6 verschlüsseln würde aus dem Text:

```
Quz Otmdmwfqd zmyqze Omqemd!
```

Schreibe ein Programm dass von der Konsole einen beliebiglangen Text einliest, danach zufällig einen Schlüssel zwischen 1 und 26 wählt und den verschlüsselten String ausgibt. 

***EN:***

We know that every letter in Java has a unique code. In detail the numerical representation of a character is the Unicode.

The caesar chiffre is a simple encryption algorithm, that rotates every letter with an offset X. When you reach the Z you should start again with the A for the purpose of this exercise. Moreover we will ignore all special characters for now.

With a Caesar Chiffre of 6 the following text

```
Ein Charakter namens Caesar!
```

would be encrypted to:

```
Kot Ingxgqzkx tgskty Igkygx!
```

when an encrypted again with a key of 6 we get:

```
Quz Otmdmwfqd zmyqze Omqemd!
```

Write a program that reads any text from the console, generates a key between 1 and 26 and prints the encrypted message. 

#### Abnahmekriterien

- Variablennamen aussagekräftig und Datentypen sinnvoll gewählt
- Benutzerführung klar, sofern vorhanden 
- Trennung zwischen Klartext und verschlüsselter Text, um Vergleich nach Entschlüsselung zu erlauben
- das Programm funktioniert und bildet alle angeforderten Punkte korrekt ab
- der\*die Teilnehmer\*in ist in der Lage sein\*ihr Programm zu erklären und warum er\*sie es so gelöst hat (hier ist eine for-Schleife am sinnvollsten, auch wenn man eine while-Schleife verwenden könnte)

## Arrays

### Übung/Exercise 2.7: Berechnung des Maximums / Maxima calculation

**DE:**

Schreibe ein kleines Programm, welches eine Liste von Zahlen über die Konsole zahlenweise einliest. Mit 'q' solltest du die Eingabe beenden können. Errechne dir danach aus der eben eingelesenen Liste das Maximum und gib es auf der Konsole aus. 

***EN:***

Provide a program that reads numbers from the console until it reads the letter 'q'. Calculate the maximum of all values and print it to the console.