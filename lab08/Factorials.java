//Nick Hochrein
//March 20
//Lab 08
//Factorials Java Program

//import scanner
import java.util.Scanner

//define a class
public class Factorials{
    
//add main method
    public static void main(String[] args){
        Scanner myScanner=new Scanner (System.in);
        System.out.println("Enter a postive integer.");
        double number=myScanner.nextDouble();
        while(number<1 || (number%1)!=0){
            System.out.println("Invalid input. Enter again.");
            number=myScanner.nextDouble();
        }
        int solution=0;
        int counter=0;
        while(counter<=number){
            solution+=factorial(counter);
            counter++;
        }
        System.out.println(solution);
        
        
        
    }
}