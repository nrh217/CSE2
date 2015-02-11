//Nick Hochrein
//February 10
//HW 03
//Four Digits Java Program
//
//import scanner
import java.util.Scanner;

//define a class
public class FourDigits{
    
//add main method
    public static void main(String[] args) {

//inputs
    Scanner myScanner;
    myScanner=new Scanner (System.in);
    System.out.print("Enter number:"); //prompt user for input
    double number=myScanner.nextDouble(); //accept user input
    
//calculate first four digits
    int myInt=(int) number;
    double digits=(number*10000)-(myInt*10000); //calculate four digits
    int answer=(int) digits;
    
//print answer
    System.out.println("The four digits are "+answer);
    
    } //end of main method
} //end of class