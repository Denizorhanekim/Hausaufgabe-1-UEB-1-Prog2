import java.util.Scanner;
/*
importing Scanner class from standard Java library
scanner is used to take inputs from the user
 */
public class Uebungsblatt1Aufgabe1aBegrüßung {
public static void main(String[]args){
    //Aufgabe1
    //a.
    Scanner scanner = new Scanner(System.in);
    /*
    creatign a new Scanner object
    System.in --> Tastatur input
    a tool is created to take user data/input
     */
System.out.print("Bitte geben Sie Ihren Namen ein:");
/*
Screen will message the user to write their name
 */
    String name = scanner.nextLine();
    /*
    reads the input written by the user and saves the users input in the variable 'name'
    users enters their name and presses enter to make this line work
     */
    System.out.println("Hallo,"+name+"! Schön, dich kennenzulernen.");
    /*
    the input (name) taken from the user will be used to greet the user wth their name in a personlised way
     */
}

}
