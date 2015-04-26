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
        
        double num;
        int nStars;
        int counter=0;
        boolean solution=true;
        Scanner myScanner=new Scanner(System.in);
        System.out.println("Enter an int between 3 and 33:");
        num=myScanner.nextDouble();
       while(counter<1){
            while((num%1)==0){
                if(num>=3&&num<=33){
                    nStars=(int)num;
                    counter=1;
                   break;
                }
                else{
                    System.out.println("Number is not within range");
                    System.out.println("Enter an int between 3 and 33:");
                    num=myScanner.nextDouble();
                }
            }
           if(counter==0){
               System.out.println("Number is not an int");
               System.out.println("Enter an int between 3 and 33:");
               num=myScanner.nextDouble();
           }
       }
       
        
//define variable and print out *
        nStars=(int)num;
        String star="*";
        String space=" ";
        for(int i=0; i<nStars; i++){
            System.out.print(star);
        }
        System.out.println("");

//print out stars diagonally        
        String answer=space+star;
       for(int i=0;i<nStars-1;i++){
           System.out.println(answer);
           answer=(space+answer);
       }
       for(int i=0; i<nStars; i++){
            System.out.print(star);
        }
        System.out.println("");
        
        
        
    }
}