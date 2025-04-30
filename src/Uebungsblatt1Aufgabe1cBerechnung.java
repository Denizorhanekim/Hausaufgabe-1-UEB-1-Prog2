import java.util.Scanner;

public class Uebungsblatt1Aufgabe1cBerechnung {

    /*
    Aufgabenstellung:
    Schreiben Sie ein Java-Programm, das com benutzer zwei Zahlen erhjält und die Summe (Addition),
    Multiplikation, Subtraktion, Division ausgibt.
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        Scanner makes it possible that we can take inputs from the user
        Addition, Subtraktion, Multiplikaiton: problemlos
        Division: muss nicht ganze Zahl ausgeben --> wir brauchen double
         */

        System.out.println("Bitte geben Sie die erste Zahl ein: ");
        double zahl1=scanner.nextDouble();
        System.out.print("Bitte geben Sie die zweite Zahl ein:");
        double zahl2=scanner.nextDouble();

        double addition=zahl1+zahl2;
        double subtraktion=zahl1-zahl2;
        double multiplikation=zahl1*zahl2;
        double division=zahl1/zahl2; // ? 2.sayi sifir olamaz bunu koduna ekle, double yerine float da olabilir

    // dem Benutzer die Ergebnisse anzeigen
        System.out.println("Addition:"+addition);
        System.out.println("Subtraktion:"+subtraktion);
        System.out.println("Multiplikation:"+multiplikation);
        System.out.println("Division:"+division);

        scanner.close();

    }
}
