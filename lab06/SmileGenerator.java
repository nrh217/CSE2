//Nick Hochrein
//February 27
//Lab 06
//Smile Generator Java Program

//define a class
public class SmileGenerator{
    
//add main method
    public static void main(String[] args){
        
//create for loop to generate 5 smileys
        int i;
        for(i=0; i<5;i++){
            System.out.print(":) ");
        }
        System.out.println("");
        System.out.println("");
//create 5 in while loop
        i=0;
        while(i<5){
         System.out.print(":) ");
         i++;
        }
        System.out.println("");
        System.out.println("");
//create 5 in do-while loop
        i=0;
        do{
            System.out.print(":) ");
            i++;
        }while(i<5);
        System.out.println("");
         System.out.println("");
//create between 1 and 100 smiley faces
        int val=((int)(Math.random()*100))+1;
        for(i=0;i<val;i++){
            System.out.print(":) ");
        }
        System.out.println("");
        System.out.println("");
//limit smileys for random to 30 per line
        int counter;
        for(i=0;i<val;i=i){
            for(counter=0;counter<30;counter++){
                System.out.print(":) ");
                i++;
                if(i>=val){
                    break;
                }
            }
            System.out.println("");
        }
        System.out.println("");
//create loop with each line containing one more smiley
        counter=1;
        for(i=0;i<val;i=i){
            for(int j=0;j<counter;j++){
                System.out.print(":) ");
                i++;
            }
            counter++;
            System.out.println("");
        }
        System.out.println("");
        
        
    }
}