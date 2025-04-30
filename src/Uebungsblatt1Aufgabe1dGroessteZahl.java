import java.util.Scanner;

public class Uebungsblatt1Aufgabe1dGroessteZahl {

    /*
    Aufgabenstellung:
    Schreiben Sie ein Java-Programm, das vom benutzer drei Zahlen erhält
    und die höchste Zahl ausgibt.
     */
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        // 3 Zahlen als Input
        System.out.print("Bitte geben Sie die erste Zahl ein:");
        double zahl1=scanner.nextDouble();
        System.out.print("Bitte geben Sie die zweite Zahl ein:");
        double zahl2=scanner.nextDouble();
        System.out.print("Bitte geben Sie die dritte Zahl ein:");
        double zahl3=scanner.nextDouble();

        //Finden Sie die größte zahl

        double dieGrößte=zahl1; //erstmals so annehmen  dass die zahl1 die größte ist (als ob)
    if(zahl2> dieGrößte){
        dieGrößte=zahl2;
    }
        if(zahl3> dieGrößte){
            dieGrößte=zahl3;
        }
        System.out.println("Die größte eingegebene Zahl ist:"+ dieGrößte);
        scanner.close();


    }
}
