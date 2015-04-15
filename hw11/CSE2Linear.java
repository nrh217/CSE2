//Nick Hochrein
//April 14, 2015
//HW 11
//Fun With Searchin Java Program

//import scanner
import java.util.Scanner;

//define a class
public class CSE2Linear{
    
//define a method
    public static void main(String [] args){
        
//prompt user to enter 15 ints
        Scanner myScanner=new Scanner (System.in);
        boolean flag = false;
        int numList[] = new int[15];
        System.out.print("Enter 15 ints for grades(0-100) in numeric order");
        for (int i=0; i<15; i++){
            numList[i] = -1;
        }
        int counter = 0;
        
        int response = -1;
        while (counter<15){
            if(!myScanner.hasNext()){
                System.out.println("not 15");
                System.exit(1);
            }
            if (!myScanner.hasNextInt()){
                System.out.println("Not an int. Enter another int" + counter);
                System.exit(1);
            }
            response = Integer.parseInt(myScanner.next());
            if ((response>100) || (response<0) ){
                System.out.println("Not in range. enter another" + counter);
                System.exit(1);
            }
            if (counter == 0){
                numList[0] = response;
                counter++;
            }
            else{
                if (response < numList[counter-1]){
                    System.out.println("less than last. enter another" + counter);
                    System.exit(1);
                }
                else{
                    numList[counter]=response;
                    counter++;
                }
            }
        }
        for (int i=0; i<15; i++){
            System.out.println(numList[i]);
        }
        System.out.println("Enter a number to search for");
        int find = myScanner.nextInt();
        int start = 0;
        int end = 15;
        int index = (end-start)/2;
        boolean found = false;
        int i = 0;
        while((index!=start)&&(index!=end)&&(found==false)){
            if(find>numList[index]){
                start = index;
            }
            else if(find<numList[index]){
                end = index;
            }
            else {
                found = true;
            }
            index = (end-start)/2;
            i++;
        }
        if (found == true){
            System.out.println("number is found at " + i);
                
            }
        }
    

        
    

        // for(int i=0; i<3;i++){
            
        //     while(!myScanner.hasNextInt()){
        //          System.out.println("You did not enter an integer. Try again: ");
        //          myScanner.next();
        //     }
            
        //     response = myScanner.nextInt();
            
        //     while(response<0 || response >100){
        //         System.out.println("Not between 0-100 Try again");
                 
        //          while(!myScanner.hasNextInt()){
        //             System.out.println("You did not enter an integer. Try again: ");
        //             myScanner.next();
        //     }
            
        //     response = myScanner.nextInt();
                 
        //     }
            
        //     numList[i] = response;
            
        //     while(i>0 && numList[i] < numList[i-1]){
        //         System.out.println("Your number was not greater than the previous");
        //       while(!myScanner.hasNextInt()){
        //          System.out.println("You did not enter an integer. Try again: ");
        //          myScanner.next();
        //     }
            
        //     response = myScanner.nextInt();
            
        //     while(response<0 || response >100){
        //         System.out.println("Not between 0-100 Try again");
                 
        //          while(!myScanner.hasNextInt()){
        //             System.out.println("You did not enter an integer. Try again: ");
        //             myScanner.next();
        //     }
            
        //     response = myScanner.nextInt();
                 
        //     }
            
        //     numList[i] = response;
            
            
            
            
        // }
        
        
        
        // }
        // System.out.println(numList);
        
        
    
}
