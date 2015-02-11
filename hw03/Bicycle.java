//Nick Hochrein
//February 10
//HW 03
//Bicycle Java Program
//
//import scanner
import java.util.Scanner;

//define a class
public class Bicycle{
    
//add main method
    public static void main(String[] args) {
        
//inputs
    Scanner myScanner;
    myScanner=new Scanner (System.in);
    System.out.print("Enter the number of counts:"); //prompt user for input of number of counts
    int nCounts=myScanner.nextInt(); //accept user input
    System.out.print("Enter the number of seconds:"); //prompt user for input of seconds
    int nSeconds=myScanner.nextInt(); //accept user input
    
//intermediate variables and output data
    double wheelDiameter=27.0, //diameter of wheel
    PI=3.14159, //value of pi
    feetPerMile=5280, //ft per mi
    inchesPerFoot=12, //inches per foot
    secondsPerMinute=60, //seconds per minute
    minutesPerHour=60; //minutes per hour
    double distanceTrip, totalTime, averageSpeed;
    
//run calculations, store values
    distanceTrip=nCounts*wheelDiameter*PI; //calculate distance in inches
    distanceTrip/=inchesPerFoot*feetPerMile; //calculate distance in miles
    totalTime=(nSeconds/secondsPerMinute); //calculate total time
    averageSpeed=distanceTrip/(totalTime/minutesPerHour); //calculate average speed
    
    
//print statement
    System.out.print("The distance was ");
    System.out.printf("%.2f", distanceTrip);
    System.out.println(" miles and took "+totalTime+" minutes");
    System.out.print("The average mph was ");
    System.out.printf("%.2f %n", averageSpeed);
    
    } //end of main method
} //end of class