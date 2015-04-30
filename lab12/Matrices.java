//Nick Hochrein
//April 17, 2015
//Lab 12
//Row and Column Major Matrices Java Program

//define a class
public class Matrices{
    
//Define increasing Matrix method
    public static int[][] increasingMatrix(int width, int height, boolean format){
        int input=1;
        int[][]array;
        if(format=true){
            array=new int[height][width];
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                    array[i][j]=input;
                    input++;
                }
            }
        }
        else{
            int input2=1;
            array=new int[width][height];
            for(int a=0;a<array.length;a++){
                for(int b=0; b<array[a].length;b++){
                    array[a][b]=input2;
                    input2+=3;
                }
                input2-=5;
            }
        }
        return array;
    }
    
    public static void printMatrix(int[][]array, boolean format){
        if(format=true){
            for(int i=0;i<array.length;i++){
                System.out.print("[ ");
                for(int j=0;j<array[i].length;j++){
                    System.out.print(array[i][j]+" ");
                }
                System.out.println("]");
                System.out.println("");
            }
        }
        else{
            for(int m=0;m<array[0].length;m++){
                System.out.print("[ ");
                for(int n=0;n<array.length;n++){
                    System.out.print(array[n][m]+" ");
                }
                System.out.println("]");
                System.out.println("");
            }    
        }
    }
    
    public static int[][] translate(int[][]array){
        int width=array[0].length;
        int height=array.length;
        int[][]array2=new int[height][width];
        for(int i=0;i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                array2[i][j]=array[j][i];
            }
        }
        return array2;
    }
    
    public static int[][] addMatrix(int[][]a, boolean formata, int[][]b, boolean formatb){
       int height1, height2, width1, width2;
       int [][] a2;
       int[][]b2;
       if(formata=true){
           height1=a.length;
           width1=a[0].length;
       }
       else{
           height1=a[0].length;
           width1=a.length;
           a2=translate(a);
       }
       if(formatb=true){
           height2=b.length;
           width2=b[0].length;
       }
       else{
           height2=b[0].length;
           width2=b.length;
           b2=translate(b);
       }
       if(height1!=height2||width1!=width2){
           System.out.println("the arrays cannot be added!");
           return null;
       }
       int[][]array=new int[height1][width1];
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a[i].length;j++){
               array[i][j]=a[i][j]+b[i][j];
           }
        }
        return array;
    }
    
    public static void main(String[] args){
        int width1=(int)(Math.random()*5)+1;
        int height1=(int)(Math.random()*5)+1;
        int width2=(int)(Math.random()*5)+1;
        int height2=(int)(Math.random()*5)+1;
        int[][] matA=increasingMatrix(width1,height1,true);
        int[][] matB=increasingMatrix(width1,height1,false);
        int[][] matC=increasingMatrix(width2,height2,true);
        System.out.println("Generating a matrix with width "+width1+" and height "+height1);
        printMatrix(matA,true);
        System.out.println("Generating a matrix with width "+width1+" and height "+height1);
        printMatrix(matB,false);
        System.out.println("Generating a matrix with width "+width2+" and height "+height2);
        printMatrix(matC,true);
        int[][]addAB=addMatrix(matA,true,matB,false);
        System.out.println("Adding first and second marices");
        printMatrix(addAB,true);
        int[][]addAC=addMatrix(matA,true,matC,true);
        if(addAC!=null){
            printMatrix(addAC,true);
        }    
    }
    
    
    
    
}