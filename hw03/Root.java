//Nick Hochrein
//February 10
//HW03
//Root Java Program
//
//import scanner
import java.util.Scanner;

//define a class
public class Root{
    
//add main method
    public static void main(String[] args) {

//inputs
    Scanner myScanner;
    myScanner=new Scanner (System.in);
    System.out.print("Enter number:"); //prompts user for inut of number
    double number=myScanner.nextDouble(); //accept user input
    
//estimate cube root of number
    double guess=number/3; //create first guess
    guess=(2*guess*guess*guess+number)/(3*guess*guess); //create better estimate or guess
    guess=(2*guess*guess*guess+number)/(3*guess*guess); //create better estimate or guess
    guess=(2*guess*guess*guess+number)/(3*guess*guess); //create better estimate or guess
    guess=(2*guess*guess*guess+number)/(3*guess*guess); //create better estimate or guess
    guess=(2*guess*guess*guess+number)/(3*guess*guess); //create better estimate or guess
    double number2=guess*guess*guess; //check answer
    
//print out statement
    System.out.println("The cube root is "+guess); 
    System.out.println(guess+"*"+guess+"*"+guess+"="+number2);
    
    } //end of main method
} //end of class