//Juwan Royal
//HW #8
//Area Java Program
//
//  first complie the program
//      javac Area.java
//  run the program
//      java Area//

//create scanner for inputs
import java.util.Scanner;
//  define a class
public class Area{

//method for rectangle area
public static double Rect(double s1, double s2){
        double RectArea=s1*s2;
        return RectArea;
    }
//circle area method   
public static double Circ(double s1, double s2){
        double CircArea=(s1*s1)*s2;
        return CircArea;
}
//triangle area method
public static double Tri(double s1, double s2){
        double TriArea=s1*(s2/2);
        return TriArea;
}
//  add main method
public static void main(String[ ] args) {
//construct scanner for taking inputs
    Scanner MyScanner = new Scanner(System.in);
//create strings for shape entry, plus one string for actually inputting a string
    String Rectangle="rectangle";
    String Circle="circle";
    String Triangle="triangle";
    System.out.print("Enter shape: ");
    String Geo=MyScanner.nextLine();
//if string isn't rectangle, circle, or triangle, make user repeat until so
    while (!((Geo.equals(Rectangle))||(Geo.equals(Circle))||(Geo.equals(Triangle)))){
        System.out.println("Error. Please enter rectangle, triangle, or circle.");
        Geo=MyScanner.nextLine();
    } 
//now create if statements for each shape method that will call the method and use user inputs in place of parameters
    if (Geo.equals(Rectangle)){
        System.out.println("Enter length: ");
        double n1=MyScanner.nextDouble();
        System.out.println("Enter width: ");
        double n2=MyScanner.nextDouble();        
        Rect(n1, n2);
        System.out.println("Area of the rectangle is "+ Rect(n1, n2));
    }
    else if (Geo.equals(Circle)){
        System.out.println("Enter radius: ");
        double n1=MyScanner.nextDouble();
        System.out.println("Enter first three digits of pi: ");
        double n2=MyScanner.nextDouble();
        Circ(n1, n2);
        System.out.println("Area of the circle is "+ Circ(n1, n2));
    }
    else if (Geo.equals(Triangle)){
        System.out.println("Enter height: ");
        double n1=MyScanner.nextDouble();
        System.out.println("Enter base: ");
        double n2=MyScanner.nextDouble();
        Tri(n1, n2);
        System.out.println("Area of the triangle is "+ Tri(n1, n2));
    }
    }
    }
    

        
        
        
        
        
        
        
        
        
        
        
        
        