//Nick Hochrein
//March 3
//HW 06
//Run Factorial Java Program

//import scanner
import java.util.Scanner;

//define a class
public class RunFactorial{
    
//add main method
    public static void main(String[] args){
        
//accept input and calculate factorial
        Scanner myScanner=new Scanner (System.in);
        System.out.println("Enter an integer between 9 and 16");//ask for integer
        double number=myScanner.nextDouble();//accept input
        while(number<9 || number>16 || (number%1)!=0){ //check for validation of integer
            System.out.println("Invalid input, enter again");
            number=myScanner.nextDouble();
        }
        int solution=1;
        while(number>0){ //calculate factorial
            solution*=number;
            number-=1;
        }
        System.out.println("The factorial equals "+solution); //print out solution
        
    }//close main method
}//close class