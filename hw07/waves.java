//Nick Hochrein
//March 17
//HW 07
//Waves Java Program

//import scanner
import java.util.Scanner;

//define a class
public class waves{
    
//add main method
    public static void main(String[] args){
        
//have user input integer between 1 and 30
        Scanner myScanner=new Scanner (System.in);
        System.out.println("Enter an integer between 1 and 30, inclusively.");
//check if number is an integer within range
        for(double number=myScanner.nextDouble();number<1||number>30||(number%1)!=0;number=number){
            System.out.println("Invalid input, enter again.");
            number=myScanner.nextDouble();
        }
        
        
        
    }
}