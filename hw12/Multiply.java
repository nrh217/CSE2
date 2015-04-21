//Nick Hochrein
//April 21, 2015
//HW 12
//Matrix multiplication

//import scanner
import java.util.Scanner;

//define class Multiply
public class Multiply{
 
  //takes two ints as args
  //creates array of size height/width equal to inputs
  //fills array with random ints -10 to 10
  //returns filled array
  public static int[][] randomMatrix(int height,int width){    
    int array[][]=new int[height][width];
    for(int i=0; i<height; i++)
        for(int j=0; j<width; j++)
            array[i][j]=(int)((Math.random()*21)-10);
    return array;    
  }
  
  //main method
  //takes 4 input ints for dimentions of matrixes
  //checks if dimentions can be multiplied
  //creates random matrixes
  //multiplies and prints solution
  public static void main(String []args){
      Scanner input=new Scanner(System.in);
      boolean goodIn=false;
      int h1=0;
      int w1=0;
      int h2=1;
      int w2=0;
      while(!goodIn){
        System.out.println("Enter the height and width for the first matrix, then again for the second matrix, all seperated by spaces");
        h1=input.nextInt();
        w1=input.nextInt();
        h2=input.nextInt();
        w2=input.nextInt();
        if(w1==h2) goodIn=true;
        else if(h1<0||h2<0||w1<0||w2<0){
            goodIn=false;
            System.out.println("Error: negative input");
        }
        else System.out.println("Bad input");
      }
      int m1[][]=randomMatrix(h1,w1);
      int m2[][]=randomMatrix(h2,w2);
      int solution[][]=matrixMultiply(m1,m2);
      printMatrix(solution);
      
      
  }
  
  //takes two 2dim arrays of ints
  //checks if they can be multiplied
  //multiplies them and returns solution
  public static int[][] matrixMultiply(int matrix1[][],int matrix2[][]){
      if(matrix1[0].length!=matrix2.length){
          System.out.println("incompatible matrixies");
          return null;
      }
      int solution[][]=new int[matrix1.length][matrix2[0].length];
      for(int i=0; i<solution.length; i++)
        for(int j=0; j<solution[0].length; j++)
            for(int k=0; k<matrix2.length; k++)
                solution[i][j]+=matrix1[i][k]*matrix2[k][j];
      return solution;
  }
   
   //prints input array to screen
  public static void printMatrix(int array[][]){
    for(int i=0; i<array.length; i++){
        for(int j=0; j<array[0].length; j++)
            System.out.print(""+array[i][j]+" ");
        System.out.println();
    }
  } 
}