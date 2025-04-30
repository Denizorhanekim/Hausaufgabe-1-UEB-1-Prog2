import java.util.Scanner;
public class Uebungsblatt1Aufgabe1bVorzeichen {
    public static void main(String[] args) {

        // Aufgabe 1 b

        /*
        Scanner: typ of the class
        inputnumber: name of the scanner object (name of the variable)
        new: creates a new object in the Speciher
         Scanner(System.in) --> create Scanner constructor so that it reads from the tastatur
         */
        Scanner inputnumber = new Scanner(System.in);
        System.out.print("Bitte gib eine Zahl hin: "); //user gives us a number
        int zahl = inputnumber.nextInt();

        if(zahl>0){
            System.out.println("Die gegebene Zahl "+zahl+" ist positiv und hat das Vorzeichen + .");
        }
        else if(zahl==0){
            System.out.println("Die gegebene Zahl "+zahl+" ist 0 (null), hat kein Vorzeichen und neutral.");

        }
        else{
            System.out.println("Die gegebene Zahl "+zahl+" ist negativ und hat das Vorzeichen - .");
        }
        inputnumber.close();  //saves resources

    }
}
