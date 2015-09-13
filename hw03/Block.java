//Juwan Royal
//HW #3
//Block Java Program
//
//  first complie the program
//      javac Block.java
//  run the program
//      java Block//

//Creating scanner for inputing commands
import java.util.Scanner; 

//  define a class
public class Block{

    
//  add main method
    public static void main(String[ ] args) {
        
Scanner myScanner=new Scanner (System.in);  //constructing Scanner so it can take inputs    
System.out.print("Enter block's length: "); 
double length=myScanner.nextDouble(); //Enter block's length
System.out.print("Enter block's width: "); 
double width=myScanner.nextDouble(); //Enter block's width
System.out.print("Enter block's height: "); 
double height=myScanner.nextDouble(); //Enter block's height

double volume=length*width*height;
double surfaceArea=(length*width)+(length*height)+(width*height);
System.out.println("Block's volume is "+volume);
System.out.println("Block's surface area is "+ (surfaceArea*2)); //Surface area is actually 2(length*width)+2(length*height)+2(width*height)
}
}






