//Nick Hochrein
//March 3
//HW 06
//Make Symbols Java Program

//define a class
public class MakeSymbols{
    
//add main method
    public static void main(String[] args){
        
//generate random number and print out characters
        int number=(int)(Math.random()*101); //create random number
        System.out.println("Random number generated: "+number); //print out number
        do{ //do while to print out patterns for random number
            if(number%2==0 && number != 0){ //check if number is even
                System.out.print("**");
            }
            else if(number==1){
                System.out.print("&");
            }
            else if(number==0){
                System.out.print("");
            }
            else{
                System.out.print("&&");
            }
            number-=2;
        }while(number>0); //check to see if number passes test after do statement
        
        
        
        
    }//close main method
}//close class