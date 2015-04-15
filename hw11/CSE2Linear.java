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
        String gradeS="[";
        for (int i=0; i<15; i++){
            gradeS+=" "+numList[i];
        }
        System.out.println(gradeS+" ]");
        System.out.println("Enter a number to search for");
        int find = myScanner.nextInt();
        binary(numList,find);
        scramble(numList);
        System.out.println("Enter another number to search for");
        int find2=myScanner.nextInt();
        linear(numList,find2);
        
}
public static void linear(int []arr,int find){
    boolean found=false;
    int it=0;
    for(int i=0; i<15&&!found; i++){
        if(arr[i]==find){
           found=true;
           it=i;
        } 
    }
    if (found == true){
            System.out.println(find+" was found in " + it + " iterations");
        }
        else
           System.out.println("number not found");
    
}
public static void scramble(int []arr){
    for(int i=0; i<15; i++){
        int rand=(int)(Math.random()*15);
        int temp=arr[i];
        arr[i]=arr[rand];
        arr[rand]=temp;
    }
    String s="[";
    for(int i=0; i<15; i++){
        s+=" "+arr[i];
    }
    System.out.println(s+" ]");
} 

public static void binary(int []arr,int find){
    int start = 0;
    int end = arr.length-1;
    int index = (end+start)/2;
    boolean found = false;
    int i = 0;
    while(start<=end){
        if(find>arr[index]){
            start = index+1;
        }
        else if(arr[index]==find){
            start=end+1;
            found=true;
        }
        else {
            end=index-1;
        }
        index = (end+start)/2;
        i++;
    }
        if (found == true){
            System.out.println(find+" was found in " + i + " iterations");
                
        }
        else
           System.out.println("number not found");
}
    
} 