//Nick Hochrein
//April 17, 2015
//Lab 12
//Row and Column Major Matrices Java Program

//import scanner
import java.util.scanner;

//define a class
public class Matrices{
    
//Define increasing Matrix method
    public static int[][] increasingMatrix(int width, int height, boolean format){
        int[][]array=new int[3][3];
        int input=1;
        if(format=true){
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                    array[i][j]=input;
                    input++;
                }
            }
        }
        else{
            int input2=1;
            for(int a=0;a<array.length;a++){
                for(int b=0; b<array[i].length;b++){
                    array[i][j]=input2;
                    input2+=3;
                }
                input2-=5;
            }
        }
        return array;
    }
    
    
    
    
    
    
}