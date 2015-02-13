//Nick Hochrein
//February 13
//Lab 04
//Cookies Java Program
//
//import scanner
import java.util.Scanner;

//define a class
public class Cookies{
    
//add main method
    public static void main(String[] args) {

//receive and check inputs
    int nPeople; //define variable
    Scanner myScanner;
    myScanner=new Scanner (System.in);
    System.out.print("Enter the number of people:"); //prompt user for number of people
    if(myScanner.hasNextInt()) {
      nPeople=myScanner.nextInt();  
    } //close if
    else{
        System.out.println("You did not enter an int for people");
        return; //Leave the program, the progra terminates
    } //close else
    if(nPeople>0) {
        nPeople=nPeople;
    } //close if
    else{
        System.out.println("The number of people isn't greater than 0");
        return; //Leave the program, the program terminates
    } //close else
    int nCookies; //define variable
    System.out.print("Enter the number of cookies you are planning to buy:"); //prompt user for planned number of cookies
    if(myScanner.hasNextInt()) {
        nCookies=myScanner.nextInt();
    } //close if
    else{
        System.out.println("You did not enter an int for cookies");
        return; //leave the program
    } //close else
    if(nCookies>0) {
        nCookies=nCookies; //change nothing if true
    } //close if
    else{
        System.out.println("The number of cookies isn't greater than 0");
        return; //leave the program
    } //close else
    int nCookiesPerPerson;
    System.out.print("How many cookies do you want each person to get:"); //prompt user for number of cookies per person
    if(myScanner.hasNextInt()) {
        nCookiesPerPerson=myScanner.nextInt();
    } //close if
    else{
        System.out.println("You did not enter an int for cookies per person");
        return; //leave the program
    } //close else
    if(nCookiesPerPerson>0) {
        nCookiesPerPerson=nCookiesPerPerson; //change nothing if true
    } //close if
    else{
        System.out.println("The number of cookies per person isn't greater than 0");
        return; //leave the program
    } //close else
    int numberNeeded; //give variable for cookies needed
    if((nCookies/nPeople)>=nCookiesPerPerson) {
        System.out.print("You have enough cookies for each person ");
    } //close if
    else{
        System.out.print("You will not have enough cookies. ");
        numberNeeded=(nCookiesPerPerson-(nCookies/nPeople))*nPeople; //calculate cookies needed
        System.out.println("You need to buy at least "+numberNeeded+" more");
    } //close else
    if(nCookies%nPeople == 0){
        System.out.println("and the amount will divide evenly");
    } //close if
    else{
        System.out.println("but the amount will not divide evenly");
    } //close else
    
    }//end of main method
} //end of class