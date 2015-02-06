//Nick Hochrein
//February 6
//Lab 03
//Arithmetic Calculations and Input
//
//import scanner
import java.util.Scanner;

//define a class
public class BigMac{

//add main method
    public static void main(String[] args) {
        
//inputs
    Scanner myScanner;
    myScanner=new Scanner (System.in);
    System.out.print("Enter the number of Big Macs (an integer>0):"); //prompt user for number of  big macs
    int nBigMacs=myScanner.nextInt(); //accept user input
    System.out.print("Enter the cost per Big Mac as"+"a double (in the form xx.xx):"); //prompt user for cost of Big Mac
    double BigMac$=myScanner.nextDouble(); //accept user input
    System.out.print("Enter the percent tax as a whole number (xx):"); //prompt user for percent tax
    double taxRate=myScanner.nextDouble(); //accept user input
    taxRate/=100;

//calculate outputs
    double cost$; //create variable for cost
    int dollars, dimes, pennies; //variables to be specific on cost
    cost$=nBigMacs*BigMac$*(1+taxRate); //calculate cost
    dollars=(int) cost$; //calculate dollar amount
    dimes=(int) (cost$*10)%10; //calcuate amount per 10 cents
    pennies=(int) (cost$*100)%10; //calculate amount per 1 cent
    System.out.println("The total cost of "+nBigMacs+" BigMacs at $"+BigMac$+" per BigMac, with a sales tax of "+ (int) (taxRate*100)+"%, is $"+dollars+'.'+dimes+pennies);
    
    } //end of main method
} //end of class