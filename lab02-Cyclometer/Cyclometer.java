//Juwan Royal
//Lab 2
//Cyclometer Java Program
//Create a program that
//  first complie the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

//  define a class
public class Cyclometer{
    
//  add main method
    public static void main(String[ ] args) {
        
        int secsTrip1=480; // length of time for 1st trip
        int secsTrip2=3220; // length of time for 2nd trip
        int countsTrip1=1561; // number of rotations for 1st trip
        int countsTrip2=9037; // number of rotations for 2nd trip
        
    double wheelDiameter=27.0;  // diameter of wheel
  	double PI=3.14159; // Part of circumference equation C=D*Pi, which is also part of distance equation D=C*number of rotations
  	double feetPerMile=5280;  // conversion factor
  	double inchesPerFoot=12;   // conversion factor
  	double secondsPerMinute=60;  // conversion factor
	double distanceTrip1; // Variable for storing 1st trip's distance
	double distanceTrip2; // Variable for storing 2nd trip's distance
	double totalDistance; // Variable for storing distance of combined trips
	
	System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");

    distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	double distanceTrip1mi=distanceTrip1/(inchesPerFoot*feetPerMile); // Gives distance in miles
	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // 2nd trip distance in miles
	totalDistance=distanceTrip1mi+distanceTrip2; // combined distance of bth trips
	
	//Print out the output data.
    System.out.println("Trip 1 was "+distanceTrip1mi+" miles");
	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	System.out.println("The total distance was "+totalDistance+" miles");
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	