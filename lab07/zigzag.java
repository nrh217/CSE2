//Nick Hochrein
//March 6
//Lab 07
//ZIGZAG Java Program

//import scanner
import java.util.Scanner;

//define a class
public class zigzag{
    
//add main method
    public static void main(String[] args){
        
//define variable and print out *
        int nStars=10;
        int counter=nStars;
        int counter2=nStars;
        int counter3=nStars;
        int number=2;
        int number2=1;
        int number3=2;
        while(counter>0){
            System.out.print("*");
            counter-=1;
        }
        System.out.println("");
        while(counter2>0){
            System.out.println("*");
            while(number%number2!=0){
                System.out.print(" ");
                number2+=1;
            }
            counter2-=1;
            number=(number+number3);
            number3+=1;
        }
        
        
        
        
        
    }
}