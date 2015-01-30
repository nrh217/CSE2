//Nick Hochrein
//January 30
//Lab01
//Cyclometer Java Program
//Records time and rotations of bicycle tire
//
//define a class
public class Cyclometer{
    
//add main method
    public static void main(String[] args) {
        
//input variables
    int secsTrip1=480; //seconds of Trip 1
    int secsTrip2=3220; //seconds of Trip 2
    int countsTrip1=1561; //rotations of tire Trip 1
    int countsTrip2=9037; //rotations of tire Trip 2

//intermediate variables and output data
    double wheelDiameter=27.0,  //diameter of wheel
  	PI=3.14159, //value of pi
  	feetPerMile=5280,  //ft per mi
  	inchesPerFoot=12,   //in per ft
  	secondsPerMinute=60;  //secs per min
    double distanceTrip1, distanceTrip2,totalDistance;  //

//print the statement
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");

//run calculatiions, store values
        distanceTrip1=countsTrip1*wheelDiameter*PI; //calculate distance in inches
        distanceTrip1/=inchesPerFoot*feetPerMile; //calculate distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //calculate distance for trip 2 in miles
        totalDistance=distanceTrip1+distanceTrip2; //initialize total distance
        
//print out results
            System.out.println("Trip 1 was "+distanceTrip1+" miles");
            System.out.println("Trip 2 was "+distanceTrip2+" miles");
            System.out.println("The total distance was "+totalDistance+" miles");

    } //end of main method
} //end of class