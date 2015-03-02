//Nick Hochrein
//February 27
//Lab 06
//Smile Generator Java Program

//define a class
public class SmileGenerator{
    
//add main method
    public static void main(String[] args){
        
//create loop to print out smileys
       int counter=0;
       int nSmileys=(int)(Math.random()*100)+1;
       int counter2=1;
       int counter3=0;
       System.out.println(":):):):):)");
       while(counter<5){
            System.out.print(":)");
            counter+=1;
        }
        while(counter<nSmileys){
            System.out.print(":)");
            counter+=1;
            if(counter%30 == 0){
                System.out.println("");
                counter+=1;
            }
            while(counter==counter2){
                System.out.println("");
                counter2=counter2+2+counter3;
                counter3+=1;
            }
        }
        
        
        
        
        
        
        
    }
}