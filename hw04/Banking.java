//Nick Hochrein
//February 17
//HW 04
//Banking Java Program
//
//import scanner
import java.util.Scanner;

//define a class
public class Banking{
    
//add main method
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in); //define scanner
        int randor=(int)(Math.random()*4000)+1000; //random number between 1000 and 5000
        System.out.println("To view balance type V or v"); //ask for input
        System.out.println("To deposit type D or d"); //ask for input
        System.out.println("To withdraw type W or w"); //ask for input
        String bank=myScanner.next(); //string for switch statement
        switch (bank){
                
                case"v":case"V": //evaluate case v
                     System.out.println("Your balance is: "+randor); //give balance
                     break; //break out of switch
               
                case"d":case"D": //evaluate case d
                    System.out.println("How much would you like to deposit"); //ask how much they want to deposit
                    randor+=myScanner.nextInt(); //add amount to random amount
                    System.out.println("Your balance is: "+randor); //give balance
                    break; //break
                    
                case"w":case"W": //evaluate case w
                    System.out.println("How much would you like to withdraw"); //aks how much they want to withdraw
                    int temp=myScanner.nextInt(); //accept input
                        if(temp > randor){ //check if bank account has that amount
                            System.out.println("Number is too large to withdraw"); //tell them number is too large
                            System.exit(0); //exit
                        } //close if
                   else { 
                       randor-=temp; //calculate how much is left in account
                       System.out.println("Your balance is: "+randor); //give amount  
                   } //close else
                    break; //break
                    
                default: //if no above cases are entered
                    System.out.println("Please enter correct input"); 
                    break;
                    
                
        } //close switch

        
    } //end of main method
} //end of class