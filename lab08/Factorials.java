//Nick Hochrein
//March 20
//Lab 08
//Factorials Java Program

//import scanner
import java.util.Scanner;

//define a class
public class Factorials{
    
//add main method
    public static int factorial(int x){
        int answer=1;
       while(x>0){
           answer*=x;
           x--;
       }
       return answer;
    }
    
    public static void print(int x, int answer){
        System.out.println("The super factorial of "+x+" is "+answer);
    }
    
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num=myScanner.nextInt();
        int answer=0;
        for(int i=num; i>0; i--){
            answer+=factorial(i);
        }
        print(num,answer);
    }
}