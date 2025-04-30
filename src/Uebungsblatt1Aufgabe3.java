import java.util.Random;
import java.util.Scanner;

public class Uebungsblatt1Aufgabe3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random(System.currentTimeMillis()); // here Random(...) -> constructor method ?3

        /*
        explaining the syntax "Random rnd = new Random(System.currentTimeMillis());
        Random : Term Class; Function Java's java.util.Random class ,used to create pseduozufällige Zahlen
        rnd : Term Variable Name; Function name of the object created from the rndom class , defined by the coder
        = Assignment Operator
        new : Term Object Creator Operator, Function used to create a new object in the Memory in Java objects are created wth the keyword "new"
        Random(..) : Term Constructor; Function constructor of the Random CLass, called when creating a new Random object
        System: Term Class; Function takes place in Java's java.lang package , helps get a hold of tools related to Sytsem
        . Term Dot Operator; Function used to access a method or a variable inside a class or an object
        currentTimeMillsi(): Name Static Method; Function a method that belongs to the System Class, time in miillisekunden , long ??

        new Random(...) -->  takes the number as a seed and created a new Random object
         */

        int secret = 1 + rnd.nextInt(10); // erzeugt eine Zahl zwischen
        System.out.println("**Welcome to the Guessing Game. You have 10 shots to guess the number in my mind. I have a hint for you: It's a  secret number between 1(inkl.) and 10(inkl.");
        System.out.println("If you'd like to exit the game type 99.");
        int guess; // variable that holds the users guess
        int shots = 0;  // variable that counts the users shits/tries--> 0 at beginning
        while (true) {
            /*
            loop can go forever, we can exit when we'd like to--> break will stop the loop.this means either user won, left the game or used 10 shots
             */
            shots++;
            System.out.print(shots + ". guess: ");
            guess = sc.nextInt();

            if (guess == 99) {
                System.out.println("End of game wth the will of the user");
                break; //game over when 99 is typed in
            }
            if (guess == secret) {
                System.out.println("Congatulatios! You have guessed the secret number!!");
                break;
            } else {
                System.out.println("Your guess is wrong. Please try again.");
            }

            if (shots == 10) {
                System.out.println("Unfortunately, you have used all your 10 shots. And game ended.");
                break;
            }
        }
        sc.close();
    }
}
