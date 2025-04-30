import java.util.Scanner;

public class Uebungsblatt1Aufgabe1eMitternachts {

    /*
    Aufgabenstellung:
    Schreiben Sie ein Java-Programm, das vom Benutzer
    die Koeffizienten a,b und c für eine quadratische Gleichung
    der Form a^2+bx+c=0
    erhält  und due Lösungen ausgibt:
    a. anhand der Diskriminante D=b^2-4ac die Anzahl der Lösungen berechent:
    i. D<0 --> keine Lösung
    ii. D=0 --> eine Lösung
    iii. D>0 --> zwei Lösungen

    b. die Gleichung gegebenenfalls mithilfe der Formel löst:
     **Mitternachtsformel
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //die Koeffizienten als Input von dem Benutzer
        System.out.println("Mitternachtsformel zur Lösung quadratischer Gleichungen: ax^2+bx+=0");
        System.out.print("Bitte geben Sie den Koefffizienten a ein:");
        double a = scanner.nextDouble();

        System.out.print("Bitte geben Sie den Koeffizienten b ein:");
        double b = scanner.nextDouble();


        System.out.print("Bitte geben Sie den Koeffizienten c ein:");
        double c = scanner.nextDouble();

        //Diskriminante berechnen
        double D = b * b - 4 * a * c;
        System.out.println("Diskriminant D=" + D);

        if (D < 0) {
            // d.b,dass es keine reelle Lösung gibt
            System.out.println("Es gibt keine reelle Lösung.");
        } else if (D == 0) {
            //d.b.,dass es eine "doppelte" Lösung gibt
            double x = -b / (2 * a);

        } else { //beachte: else darf keine Bedingung haben
            // Also D>0 --> d.b.,dass es zwei reelle Lösungen gibt
            double x1 = (-b +Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }
        scanner.close();
    }

}