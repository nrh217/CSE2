//Nick Hochrein
//April 10
//Lab 11
//Arrays Java Program

//import scanner
import java.util.Scanner;

//define a class
public class Arrays{
    
//define a method
    public static int[] search(int[]x,int target){
        int mid=x.length/2;
        if(target==x[mid]){
            System.out.println(target+" was found in the list");
            int[]y=new int[1];
            y[0]=-1;
            return y;
        }
        else if(mid==1&&target>x[mid]){
            System.out.println(target+" was not found in the list");
            int[]y=new int[1];
            y[0]=-1;
            return y;
        }
        else if(mid==0&&target!=x[mid]){
            System.out.println(target+" was not found in the list");
            int[]y=new int[1];
            y[0]=-1;
            return y;
        }
        else if(target<x[mid]){
            int[]y=new int[mid];
            for(int i=0; i<y.length; i++){
                y[i]=x[i];
            }
            return y;
        }
        else if(target>x[mid]&&(x.length%2)!=0){
            int[]y=new int[mid];
            for(int i=0; i<y.length; i++){
                y[i]=x[mid+1+i];
            }
            return y;
        }
        else{
            int[]y=new int[mid-1];
            for(int i=0; i<y.length; i++){
                y[i]=x[mid+1+i];
            }
            return y;
        }
    }

    public static void main(String[] arg){
        Scanner myScanner=new Scanner(System.in);
        int[] array1=new int[50];
        int[] array2=new int[50];
        for(int i=0;i<50;i++){
            array1[i]=(int)(Math.random()*101);
        }
        int max1, min1;
        max1=array1[0];
        min1=array1[0];
        for(int j=1; j<array1.length; j++){
            if(array1[j]<min1){
                min1=array1[j];
            }
            else if(array1[j]>max1){
                max1=array1[j];
            }
        }
        System.out.println("The maximum value of array1 is "+max1+" and the minimum value is "+min1);
        for(int k=0; k<50; k++){
            array2[k]=(int)(Math.random()*101);
        }
        int min2=array2[0];
        int index=0;
        for(int l=0; l<50; l++){
            for(int m=1; m<50; m++){
                if(array2[m]<min2){
                    min2=array2[m];
                    index=m;
                }
            }
            int temp=array2[l];
            array2[l]=array2[index];
            array2[index]=temp;
        }
        System.out.println("The maximum value of array2 is "+array2[49]+" and the minimum value is "+array2[0]);
        int target=0;
        System.out.println("Enter an int>=0");
        double num=myScanner.nextDouble();
        if((num%1)!=0||num<0){
            System.exit(0);
        }
        else{
            target=(int)num;
        }
        int z=0;
        while(z==0){
            int[]y=search(array2,target);
            if(y[0]==-1){
                z++;
            }
        }
        
    }
}