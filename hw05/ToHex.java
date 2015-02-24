//Nick Hochrein
//February 24
//HW 05
//To Hex Java Program

//import scanner
import java.util.Scanner;
//define a class
public class ToHex{
    
//add main method
    public static void main(String[] args){
        
//accept inputs and check range
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Please enter three numbers representing RGB values:");
        int decimal1 = myScanner.nextInt();
        int decimal2 = myScanner.nextInt();
        int decimal3 = myScanner.nextInt();
        if (decimal1<256 && decimal1>-1 && decimal2<256 && decimal2>-1 && decimal3<256 && decimal3>-1){
            decimal1 = decimal1;
        }
        else{
            System.out.println("Integers are not within range");
            return;
        }
        
//Convert values to hexadecimal using switch statements and equations        
        String number1, number2, number3, number4, number5, number6;
        String remainder1=Integer.toString(decimal1%16);
        String remainder2=Integer.toString((decimal1-(decimal1%16))/16);
        switch(remainder1){
            case("10"):
                number2= "A";
                break;
            case("11"):
                number2= "B";
                break;
            case("12"):
                number2= "C";
                break;
            case("13"):
                number2= "D";
                break;
            case("14"):
                number2= "E";
                break;
            case("15"):
                number2= "F";
                break;
            default:
                number2=remainder1;
                break;
        }//close switch
        switch(remainder2){
            case("10"):
                number1= "A";
                break;
            case("11"):
                number1= "B";
                break;
            case("12"):
                number1= "C";
                break;
            case("13"):
                number1= "D";
                break;
            case("14"):
                number1= "E";
                break;
            case("15"):
                number1= "F";
                break;
            default:
                number1=remainder2;
                break;
        }//close switch
        String remainder3=Integer.toString(decimal2%16);
        String remainder4=Integer.toString((decimal2-(decimal2%16))/16);
        switch(remainder3){
            case("10"):
                number4= "A";
                break;
            case("11"):
                number4= "B";
                break;
            case("12"):
                number4= "C";
                break;
            case("13"):
                number4= "D";
                break;
            case("14"):
                number4= "E";
                break;
            case("15"):
                number4= "F";
                break;
            default:
                number4=remainder3;
                break;
        }//close switch
        switch(remainder4){
            case("10"):
                number3= "A";
                break;
            case("11"):
                number3= "B";
                break;
            case("12"):
                number3= "C";
                break;
            case("13"):
                number3= "D";
                break;
            case("14"):
                number3= "E";
                break;
            case("15"):
                number3= "F";
                break;
            default:
                number3=remainder4;
                break;
        }//close switch
        String remainder5=Integer.toString(decimal3%16);
        String remainder6=Integer.toString((decimal3-(decimal3%16))/16);
        switch(remainder5){
            case("10"):
                number6= "A";
                break;
            case("11"):
                number6= "B";
                break;
            case("12"):
                number6= "C";
                break;
            case("13"):
                number6= "D";
                break;
            case("14"):
                number6= "E";
                break;
            case("15"):
                number6= "F";
                break;
            default:
                number6=remainder5;
                break;
        }//close switch
        switch(remainder6){
            case("10"):
                number5= "A";
                break;
            case("11"):
                number5= "B";
                break;
            case("12"):
                number5= "C";
                break;
            case("13"):
                number5= "D";
                break;
            case("14"):
                number5= "E";
                break;
            case("15"):
                number5= "F";
                break;
            default:
                number5=remainder6;
                break;
        }//close switch
       
//print out answer
        System.out.println("The decimal numbers R:"+decimal1+", G:"+decimal2+", B:"+decimal3+", is represented in hexadecimal as: "+number1+number2+number3+number4+number5+number6+".");
        
    }//close main method
}//close class