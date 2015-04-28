//Nick Hochrein
//April 3
//Lab 10
//Arrays Java Program

//import scanner
import java.util.Scanner;

//define a class
public class ArrayInputs{
    
//add main method
    public static void main(String[] args){
        int x=0;
        int num=0;
        double y;
        Scanner myScanner=new Scanner(System.in);
        while(x==0){
            System.out.println("Enter an integer for the size of an array:");
            y=myScanner.nextDouble();
            if((y%1)!=0){
                System.out.println("Not an integer");
            }
            else if(y<0){
                System.out.println("Not a postive number");
            }
            else{
                num=(int)y;
                x++;
            }
        }
        int[]array=new int[num];
        int val;
        System.out.println("Enter "+num+" positive integers:");
        for(int i=0; i<num; i++){
            y=myScanner.nextDouble();
            if((y%1)!=0){
                System.out.println("Not an integer");
                System.out.println("Re-enter all integers");
                i=-1;
            }
            else if(y<0){
                System.out.println("Not a postive number");
                System.out.println("Re-enter all integers");
                i=-1;
            }
            else{
                val=(int)y;
                array[i]=val;
            }
        }
        System.out.println("The array is:");
        for(int j=0; j<array.length; j++){
            System.out.println(array[j]);
        }
    }
}