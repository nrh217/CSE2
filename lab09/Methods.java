//Nick Hochrein
//March 27
//Lab 09
//Factorials Java Program

//import scanner
import java.util.Scanner;

//define a class
public class Methods{
    
//add main method
    public static void main(String[] args){
        boolean answer=false;
        int num;
        for(int i=0; i<1; i=i){
            num=(int)(Math.random()*10);
            String word1=adjectives(num);
            num=(int)(Math.random()*10);
            String word2=adjectives(num);
            num=(int)(Math.random()*10);
            String word3=nouns(num);
            num=(int)(Math.random()*10);
            String word4=verbs(num);
            num=(int)(Math.random()*10);
            String word5=adjectives(num);
            num=(int)(Math.random()*10);
            String word6=nouns(num);
            System.out.println("The "+word1+" "+word2+" "+word3+" "+word4+" the "+word5+" "+word6+".");
            Scanner myScanner=new Scanner(System.in);
            System.out.println("Would you like another sentence?(1 for yes, 0 for no)");
            int repeat=myScanner.nextInt();
            if(repeat==1){
                i=0;
            }
            else{
                i++;
            }
        }
    }
    
    public static String adjectives(int x){
        String answer=" ";
        String y=Integer.toString(x);
        switch(y){
            case("0"):
                answer="quick";
                break;
            case("1"):
                answer="slow";
                break;
            case("2"):
                answer="blue";
                break;
            case("3"):
                answer="red";
                break;
            case("4"):
                answer="boring";
                break;
            case("5"):
                answer="playful";
                break;
            case("6"):
                answer="big";
                break;
            case("7"):
                answer="small";
                break;
            case("8"):
                answer="loud";
                break;
            case("9"):
                answer="quiet";
                break;
        }
        return answer;
    }
    
    public static String nouns(int x){
        String answer=" ";
        String y=Integer.toString(x);
        switch(y){
            case("0"):
                answer="fox";
                break;
            case("1"):
                answer="dog";
                break;
            case("2"):
                answer="bunny";
                break;
            case("3"):
                answer="human";
                break;
            case("4"):
                answer="cat";
                break;
            case("5"):
                answer="bear";
                break;
            case("6"):
                answer="penguin";
                break;
            case("7"):
                answer="chicken";
                break;
            case("8"):
                answer="turkey";
                break;
            case("9"):
                answer="hamster";
                break;
        }
        return answer;
    }
    
    public static String verbs(int x){
        String answer=" ";
        String y=Integer.toString(x);
        switch(y){
            case("0"):
                answer="passed";
                break;
            case("1"):
                answer="tackled";
                break;
            case("2"):
                answer="chased";
                break;
            case("3"):
                answer="followed";
                break;
            case("4"):
                answer="examined";
                break;
            case("5"):
                answer="watched";
                break;
            case("6"):
                answer="stopped";
                break;
            case("7"):
                answer="pushed";
                break;
            case("8"):
                answer="grabbed";
                break;
            case("9"):
                answer="held";
                break;
        }
        return answer;
    }
}