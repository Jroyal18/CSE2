//Juwan Royal
//HW #3
//Timer Java Program
//
//  first complie the program
//      javac Timer.java
//  run the program
//      java Timer//

//Creating scanner for inputing commands
import java.util.Scanner; 

//  define a class
public class Timer{

    
//  add main method
    public static void main(String[ ] args) {

Scanner myScanner=new Scanner (System.in);  //constructing Scanner so it can take inputs    
System.out.print("Enter the current time: "); 
int time=myScanner.nextInt(); //Input current time in military time 
System.out.print("Enter dinner time: "); 
int dinTime= myScanner.nextInt(); //Input dinner time in military time

int hours;
int minutes; 
hours=(int) (dinTime-time)/100; //So you have number of hours left as an integer
minutes=(int) ((dinTime-time)%100);

System.out.print("You have " + hours + " hour(s) and " + minutes + " minute(s) until dinner time"); 
}
}









