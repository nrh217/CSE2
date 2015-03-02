//Nick Hochrein
//March 3
//HW 06
//Get Integers Java Program

//import scanner
import java.util.Scanner;

//define a class
public class GetIntegers{
    
//add main method
    public static void main(String[] args){
        
//ask user for 5 non-negative integers
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter 5 non-negative integers");//ask for 5 integers
        int number1=myScanner.nextInt();//accept first integer
        int number2=myScanner.nextInt();//accept second integer
        int number3=myScanner.nextInt();//accept input
        int number4=myScanner.nextInt();//accept input
        int number5=myScanner.nextInt();//accept input
        while(number1<0 || number2<0 || number3<0 || number4<0 || number5<0){//check for correct input
            System.out.println("The integers entered are not valid");
            System.out.println("Enter again");
            number1=myScanner.nextInt();
            number2=myScanner.nextInt();
            number3=myScanner.nextInt();
            number4=myScanner.nextInt();
            number5=myScanner.nextInt();
        }   
        int sum=number1+number2+number3+number4+number5; //calculate sum
        System.out.println("Sum is "+sum);//print out answer
        
        
        
    }//close main method
}//close class