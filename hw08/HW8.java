//Nick Hochrein
//March 24
//Hw 08
//
//HW 08 Java Program

//import scanner
import java.util.Scanner;

//define a class
public class HW8{
    
public static void main(String[] args) {
        char option;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = Scanner.next("Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = Scanner.next("Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = Scanner.next("Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = Scanner.next("Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = Scanner.next("AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        input = Scanner.next(Scanner);
        System.out.println("Hero! Have a good day!");
    }



}