import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Uebungsblatt1Aufgabe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie die Länge des Arrays ein: ");
        int laenge = scanner.nextInt();
        int[] array = new int[laenge];

        System.out.println("Bitte geben Sie " + laenge + " ganze Zahlen ein:");
        for (int i = 0; i < laenge; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // a) Durchschnitt
        double summe = 0;
        for (int i = 0; i < laenge; i++) {
            summe += array[i];
        }
        double durchschnitt = summe / laenge;
        System.out.println("a) Durchschnitt: " + durchschnitt);

        // b) Standardabweichung
        double quadratSumme = 0;
        for (int i = 0; i < laenge; i++) {
            quadratSumme += Math.pow(array[i] - durchschnitt, 2);
        }
        double standardabweichung = Math.sqrt(quadratSumme / (laenge - 1));
        System.out.println("b) Standardabweichung: " + standardabweichung);

        // c) Maximalwert
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("c) Maximalwert: " + max);

        // d) Minimalwert
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("d) Minimalwert: " + min);

        // e) Index eines gesuchten Werts
        System.out.print("e) Bitte geben Sie den gesuchten Wert ein: ");
        int gesuchterWert = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == gesuchterWert) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Der Wert " + gesuchterWert + " befindet sich an Index: " + index);
        } else {
            System.out.println("Der Wert " + gesuchterWert + " wurde im Array nicht gefunden.");
        }

        // f) Element entfernen
        System.out.print("f) Welchen Wert möchten Sie aus dem Array entfernen? ");
        int zuEntfernenderWert = scanner.nextInt();
        int indexToRemove = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == zuEntfernenderWert) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            int[] neuesArray = new int[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != indexToRemove) {
                    neuesArray[j++] = array[i];
                }
            }
            System.out.println("Neues Array nach dem Entfernen von " + zuEntfernenderWert + ": " + Arrays.toString(neuesArray));
        } else {
            System.out.println("Der Wert " + zuEntfernenderWert + " wurde im Array nicht gefunden.");
        }

        // g) Ein neues Element an einer bestimmten Position einfügen
        System.out.print("g) Bitte geben Sie den neuen Wert ein, den Sie einfügen möchten: ");
        int neuerWert = scanner.nextInt();

        System.out.print("Bitte geben Sie die Position ein (0 bis " + array.length + "), an der Sie den Wert einfügen möchten: ");
        int position = scanner.nextInt();

// Position prüfen
        if (position < 0 || position > array.length) {
            System.out.println("Ungültige Position. Muss zwischen 0 und " + array.length + " liegen.");
        } else {
            // Neues Array erstellen, das ein Element länger ist
            int[] erweitertesArray = new int[array.length + 1];

            // Elemente bis zur Einfügeposition übernehmen
            for (int i = 0; i < position; i++) {
                erweitertesArray[i] = array[i];
            }

            // Neuen Wert einfügen
            erweitertesArray[position] = neuerWert;

            // Restliche Elemente nach rechts verschieben
            for (int i = position; i < array.length; i++) {
                erweitertesArray[i + 1] = array[i];
            }

            // Ergebnis wird ausgeben
            System.out.println("Neues Array nach dem Einfügen von " + neuerWert + " an Position " + position + ":");
            System.out.println(Arrays.toString(erweitertesArray));
        }


        scanner.close();
    }
}
