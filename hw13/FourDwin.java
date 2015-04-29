//Nick Hochrein
//April 28
//HW 13
//To the Fourth Dimension and Beyond Java Program

//import scanner
import java.util.Scanner;
import java.lang.Number;

//create class
public class FourDwin{
    
//method to print out members, sum, and mean of array
    public static void statArray(double[][][][]x){
        int elements=0;
        int sum=0;
        int mean;
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                for(int k=0;k<x[i][j].length;k++){
                    for(int m=0;m<x[i][j][k].length;m++){
                        elements++;
                        sum+=x[i][j][k][m];
                    }
                }
            }
        }
        mean=(sum/elements);
        System.out.println("Members: "+elements);
        System.out.println("Sum: "+sum);
        System.out.println("Mean: "+mean);
    }
  
//method to sort 4D arrays using insertion sort by size of 3D arrays  
    public static void sort4DArray(double[][][][]x){
        for(int i=1;i<x.length;i++){
            boolean swap=false;
            for(int j=0; j<i&&!swap; j++){
                if(arraySize(x[i])<=arraySize(x[j])){
                    double temp[][][]=x[i];
                    for(int k=i; k>j; k--)
                        x[k]=x[k-1];
                    x[j]=temp;
                    swap=true;
                }
                if(arraySize(x[j])==arraySize(x[j+1])){
                    double low1=x[j][0][0][0];
                    double low2=x[j+1][0][0][0];
                    for(int a=j; a<=j+1; a++)
                        for(int b=0; b<x[a].length; b++)
                            for(int c=0; c<x[a][b].length; c++)
                                for(int d=0; d<x[a][b][c].length; d++){
                                    if(a==j){
                                        if(x[a][b][c][d]<low1)
                                            low1=x[a][b][c][d];
                                    }
                                    else if(x[a][b][c][d]<low2)
                                        low2=x[a][b][c][d];
                                }
                    if(low2<low1){
                        double temp[][][]=x[j];
                        x[j]=x[j+1];
                        x[j+1]=temp;
                    }
                }
            }
            
        }
    }
    
    public static int arraySize(double[][][] array){
        int sum=0;
        for(int i=0; i<array.length; i++)
            for(int j=0; j<array[i].length; j++)
                sum+=array[i][j].length;
        return sum;
    }

    public static int arraySize3(double[][] array){
        int sum=0;
        for(int i=0; i<array.length; i++)
            sum+=array[i].length;
        return sum;
    }
//method to sort 3D arrays by selection sort    
    public static void sort3DArray(double[][][][]x){
        for(int i=0; i<x.length; i++)
            for(int j=0; j<x[i].length-1; j++){
                int small=arraySize3(x[i][j]);
                int loc=j;
                for(int k=j; k<x[i].length; k++)
                    if(arraySize3(x[i][k])<small){
                        small=arraySize3(x[i][j]);
                        loc=k;
                    }
                double[][] temp=x[i][j];
                x[i][j]=x[i][loc];
                x[i][loc]=temp;
            }
    }

//method to print out array in nested paranthetical format
    public static void printArray(double[][][][] x){
        System.out.print("{");
        for(int i=0;i<x.length;i++){
            System.out.print("{");
            for(int j=0;j<x[i].length;j++){
                System.out.print("{");
                for(int k=0;k<x[i][j].length;k++){
                    System.out.print("{");
                    for(int m=0;m<x[i][j][k].length;m++){
                       System.out.print(x[i][j][k][m]+", ");
                    }
                    System.out.print("}");
                    System.out.println();
                }
                System.out.print("}");
            }
            System.out.print("}");
        }
        System.out.print("}");
    }

//main method to create 4D array
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);
        System.out.println("Enter an integer X:");
        int x=myScanner.nextInt();
        System.out.println("Enter an integer Y where Y > X:");
        int y=myScanner.nextInt();
        while(x>=y){
            System.out.println("Bad Input");
            System.out.println("Enter an Integer Y where Y > X");
            y=myScanner.nextInt();
        }
        int a=getRand(x,y);
        int b=getRand(x,y);
        int c=getRand(x,y);
        double[][][][]array=new double[3][a][b][c];
        //add values to 4D array of one decimal doubles between 0 and 30
        for(int i=0; i<array.length; i++)
            for(int j=0; j<array[i].length; j++)
                for(int k=0; k<array[i][j].length; k++)
                    for(int m=0; m<array[i][j][k].length; m++){
                        Integer integer=getRand(0,9);
                        array[i][j][k][m]=(getRand(0,30)+(integer.doubleValue()/10));
                    }
        System.out.println("Printing original array");
        printArray(array);
        sort4DArray(array);
        sort3DArray(array);
        System.out.println("Printing sorted array");
        printArray(array);
        
    }


public static int getRand(int low, int high){
   int range=high-low+1;
   int r=((int)(Math.random()*range)+low);
   return r;
}


}