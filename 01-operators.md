# Operatoren

In der Softwareentwicklung werden Operatoren verwendet, um Operationen, Vergleiche, usw. zwischen Variablen oder Werten zu ermöglichen. Man unterscheidet zwischen arithmetischen Operatoren und logischen Operatoren: 

## arithmetische Operatoren

Mit arithmetischen Operatoren kann man mathematische Berechnungen durchführen:

| Operator | Bedeutung                    |
| ######## | ############################ |
| +        | Addition                     |
| -        | Subtraktion                  |
| *        | Multiplikation               |
| /        | Division                     |
| %        | Modulo (Rest einer Division) |

### Java 

```Java
int a = 7;
int b = 3;
System.out.printf("%d + %d = %d \n", a, b, a + b);                  // 7 + 3 = 10 
System.out.printf("%d - %d = %d \n", a, b, a - b);                  // 7 - 3 = 4 
System.out.printf("%d + %d * %d = %d \n", a, b, b, a + b * b);      // 7 + 3 * 3 = 16 
System.out.printf("(%d + %d) * %d = %d \n", a, b, b, (a + b) * b);  // (7 + 3) * 3 = 30 
System.out.printf("%d %% %d = %d \n", a, b, a % b);                 // 7 % 3 = 1 
System.out.printf("%d / %d = %d \n", a, b, a / b);                  // 7 / 3 = 2 

double c = 7.0;
double d = 3.0;
System.out.printf("%.2f / %.2f = %.2f \n", c, d, c / d);            // 7,00 / 3,00 = 2,33

```

### C#

```c#

```

### Kurzschreibweisen

Manchmal möchte man den aktuellen das Ergebnis einer Operation mit einer Variable wieder in diese Variable hineinspeichern. Hierzu helfen uns Kurzschreibweisen. Diese funktionieren mit allen arithmetischen Operatoren:

#### Java 

```Java
a = a + b; //Langschreibweise
a += b; // Kurzschreibweise

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

#### C#

```c#

```

## Vergleichsoperatoren

Weiters werden für Bedingungen sogenannten Vergleichsoperatoren benötigt. Diese kennen wir aus dem Mathematikunterricht:

| Operator | Bedeutung           |
| ######## | ################### |
| <        | Kleiner             |
| >        | Größer              |
| ==       | Gleich              |
| !=       | Ungleich            |
| <=       | Kleiner oder gleich |
| >=       | Größer oder gleich  |

#### Java 

```Java
int a = 5;
int b = 6;
int c = 5;
System.out.printf("a == b is %s \n", a == b); // false
System.out.printf("a == c is %s \n", a == c); // true
System.out.printf("a != b is %s \n", a != b); // true
System.out.printf("a != c is %s \n", a != c); // false
System.out.printf("a < b is %s \n", a < b);   // true
System.out.printf("a > b is %s \n", a > b);   // false
System.out.printf("a < c is %s \n", a < c);   // false
System.out.printf("a > c is %s \n", a > c);   // false
```

#### C#

```c#

```

## logische Operatoren

Die letzten Operatoren, die wir benötigen, sind sogenannten logische Operatoren. Diese werden wir benötigen, wenn wir mehrere Bedingungen kombinieren wollen:

| Operator | Bedeutung                      |
| ######## | ############################## |
| &        | Und                            |
| \|       | Oder                           |
| ^        | Exklusives Oder                |
| !        | Negation                       |
| &&       | Und mit Kurzschlussauswertung  |
| \|\|     | Oder mit Kurzschlussauswertung |


## Java 

```Java
boolean allEqualFull = a == b & a == c;

boolean allEqual = a == b && a == c; // ist a == b false kann allEqual bereits auf false gesetzt werden, ohne a == c zu prüfen

boolean anyEqualFull = a == b | a == c;

boolean anyEqual = a == b || a == c; // ist a == b true kann anyEqual bereits mit true gesetzt werden, ohne a == c zu prüfen
```

## Ergebnisse von logische Operatoren

Wichtig ist es, sich zu merken, welche Operation wann true und wann false ausgibt:

### a & b bzw. a && b

| a \ b |  true  |  false  |
| true  |  true  |  false  |
| false |  false |  false  |

### a | b bzw. a || b

| a \ b |  true  |  false  |
| true  |  true  |  true   |
| false |  true  |  false  |

### a ^ b

| a \ b |  true  |  false  |
| true  |  false |  true   |
| false |  true  |  false  |

### !a 

| a     |  !a    |
| true  |  false |
| false |  true  |

Zurück zur [Startseite](README.md)
