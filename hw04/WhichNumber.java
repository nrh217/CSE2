//Nick Hochrein
//February 17
//HW 04
//Which Number Java Program
//
//import scanner
import java.util.Scanner;

//define a class
public class WhichNumber{
    
//add main method
    public static void main(String[] args) {
        
//scanner
    Scanner myScanner;
    myScanner=new Scanner (System.in);

//prompt user to think of number
    System.out.println("Think of a number between 1 and 10");
    String yes = "y";
    String no= "n";
    
    char answer1; //declare character
    char answer2; //declare character
    char answer3; //declare character
    char answer4; //declare character
    char answer5; //declare character
    char answer6; //declare character
    char answer7; //declare character
    char answer8; //declare character
    char answer9; //declare character
    System.out.println("Is the number even?"); //ask if number is even
        answer1=myScanner.next().charAt(0); //accept user input
        
        if(answer1 == 'y' || answer1=='Y'){ //if answer is yes
           System.out.println("Is it divisible by 3?"); //ask if it is divisible by 3
                answer2=myScanner.next().charAt(0); //accept user input
                
                if(answer2 == 'y' || answer2=='Y'){ //if answer is yes
                    System.out.println("The number is 6."); //answer is 6
                    return; //terminate program
                } //close if
                else if(answer2 == 'n' || answer2=='N'){ //if answer is no
                    System.out.println("Is the number divisible by 4?"); //is it divisible by 4
                        answer3=myScanner.next().charAt(0); //accept user input
                        
                        if(answer3 == 'y' || answer3=='Y'){ //if answer is yes
                            System.out.println("Is the number divided by 4 greater than 1?"); //is it great than 1 when divided by 4
                                answer4=myScanner.next().charAt(0); //accept user input
                                
                                if(answer4 == 'y' || answer4=='Y'){ //if answer is yes
                                    System.out.println("The number is 8."); //answer is 8
                                    return; //terminate program
                                } //close if
                                else if(answer4 == 'n' || answer4=='N'){ //if answer is no
                                    System.out.println("The number is 4."); //answer is 4
                                    return; //terminate program
                                } //close else if
                        } //close if
                        else if(answer3 == 'n' || answer3=='N'){ //if answer is no
                            System.out.println("Is it divisible by 5?"); //is it divisible by 5
                                answer5=myScanner.next().charAt(0); //accept user input
                                
                                if(answer5 == 'y' || answer5=='Y'){ //if answer is yes
                                    System.out.println("The number is 10."); //answer is 10
                                    return; //terminate program
                                } //close if
                                else if(answer5 == 'n' || answer5=='N'){ //if answer is no
                                    System.out.println("The number is 2."); //answer is 2
                                    return; //terminate program
                                } //close else if
                        } //close else if
                } //close else if
        } //close if
//same actions occur in lower half
        else if(answer1 == 'n' || answer1=='N'){
            System.out.println("Is it divisible by 3?");
                answer6=myScanner.next().charAt(0);
                
                if(answer6 == 'y' || answer6 =='Y'){
                    System.out.println("When divided by 3 is the result greater than 1?");
                        answer7=myScanner.next().charAt(0);
                        
                        if(answer7 == 'y' || answer7 =='Y'){
                            System.out.println("The number is 9.");
                            return;
                        }
                        else if(answer7 == 'n' || answer7 =='N'){
                            System.out.println("The number is 3.");
                            return;
                        }
                }
                else if(answer6 == 'n' || answer6 =='N'){
                    System.out.println("Is it greater than 6?");
                        answer8=myScanner.next().charAt(0);
                        
                        if(answer8 == 'y' || answer8 =='Y'){
                            System.out.println("The number is 7.");
                            return;
                        }
                        else if(answer8 == 'n' || answer8 =='N'){
                            System.out.println("Is it less than 3?");
                                answer9=myScanner.next().charAt(0);
                                
                                if(answer9 == 'y' || answer9 =='Y'){
                                    System.out.println("The number is 1.");
                                    return;
                                }
                                else if(answer9 == 'n' || answer9 =='N'){
                                    System.out.println("The number is 5.");
                                    return;
                                }
                        }
                }
        }
        
        
        
        
        
        
    } //close main method
} //close class