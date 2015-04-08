//Nick Hochrein
//April 7
//HW 10
//Remove Elements Program

//import random generator
import java.util.Random;

//import scanner
import java.util.Scanner;

//define a class
public class RemoveElements{
  
//define method
    public static int [] randomInput(){
        Random random= new Random();
        int value[]=new int[10];
        for(int i=0;i<10; i++){
            value[i]=random.nextInt(10);
        }//close for
        return value;
    }//close randomInput method
  
  public static int[] delete(int list[], int pos){
      int length=list.length - 1;
      int value[]= new int[length];
      int counter = 0;
      if(pos>9 || pos<0){
          System.out.println("The index is not valid");
          return list;
      }//close if statement
      else{
          System.out.println("Index "+pos+" element was removed");
          }//close else statement
      for(int i=0;i<length; i++){
          if(i==pos){
              continue;
      }//close if statement
          else{
              value[counter]=list[i];
              counter++;
          }//close else statement
      }//close for loop
      return value;
  }//close delete method
  
  public static int[] remove(int list[],int target){
      int counter=0;
      for(int i=0;i<list.length; i++){
          if(list[i]==target){
              counter++;
          }//close if statement
      }//close for loop
      
      if(counter==0){
          System.out.println("Element "+target+" was not found");
          return list;
      }//close if statement
      else{
          System.out.println("Element "+target+" was removed ("+counter+")");
      }//close else statement
      int value[]= new int[list.length - counter];
      int index=0;
      for(int i=0;i<list.length; i++){
          if(list[i]==target){
              continue;
          }//close if statement
          else{
              value[index]=list[i];
              index++;
          }//close else statement
      }//close for loop
      return value;
  }//close remove method 
  
  
//define main method
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int value[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	value = randomInput();
  	String out = "The original array is:";
  	out += listArray(value);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(value,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(value,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }//close main method
 
  public static String listArray(int value[]){
	String out="{";
	for(int j=0;j<value.length;j++){
  	if(j>0){
    	out+=", ";
  	}//close if statement
  	out+=value[j];
	}//close for loop
	out+="} ";
	return out;
  }//close listArray method
}//close class
