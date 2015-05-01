//Nick Hochrein
//May 1 2015
//Lab 13
//Arrays that run you ragged Java Program

//define a class
public class RaggedArrays{
    
//define methods
    public static int[][] resize(int[][]array){
        int maxLength=array[4].length;
        int[][]array2=new int[5][maxLength];
        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array2[i].length;j++){
                if(j>(array[i].length-1)){
                    array2[i][j]=0;
                }
                else{
                    array2[i][j]=array[i][j];
                }
            }
        }
        return array2;
    }
    
    public static void printArray(int[][]array){
        for(int i=0;i<array.length;i++){
            System.out.print("row "+(i+1)+": ");
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static int findMin(int[]array){
        int min=40;
        int index=0;
        for(int j=0;j<array.length;j++){
            if(array[j]<min){
               min=array[j];
               index=j;
            }
        }
        array[index]=40+min;
        return min;
    }
    
    public static int[][] sort(int[][]array){
        int index=0;
        int num;
        int[][]array2=new int[5][];
        for(int z=0;z<array2.length;z++){
            num=(z*3)+5;
            array2[z]=new int[num];
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array2[i][j]=findMin(array[i]);
            }
        }
        return array2;
    }
    
    public static void main(String[] args){
        int[][]array=new int[5][];
        int num;
        int[][]array2;
        int[][]array3;
        for(int i=0;i<array.length;i++){
            num=(i*3)+5;
            array[i]=new int[num];
        }
        for(int j=0;j<array.length;j++){
            for(int k=0;k<array[j].length;k++){
                array[j][k]=(int)(Math.random()*40);
            }
        }
        System.out.println("The array before sorting");
        printArray(array);
        array2=sort(array);
        System.out.println("The array after sorting");
        printArray(array2);
        array3=resize(array2);
        System.out.println("The array after sorting and copying");
        printArray(array3);
    }
}