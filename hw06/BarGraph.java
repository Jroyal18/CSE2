//Juwan Royal
//HW #6
//Welcome Class Java Program
//
//  first complie the program
//      javac BarGraph.java
//  run the program
//      java BarGraph//

//create scanner for inputs
import java.util.Scanner;

//  define a class
public class BarGraph{

    
//  add main method
    public static void main(String[ ] args) {
        
//constructing scanner
Scanner myScanner=new Scanner(System.in);

//input expenses for each day
System.out.print("Enter Monday's expenses: "); 
double Monday=myScanner.nextDouble();

System.out.print("Enter Tuesday's expenses: "); 
double Tuesday=myScanner.nextDouble();

System.out.print("Enter Wednesday's expenses: "); 
double Wednesday=myScanner.nextDouble();

System.out.print("Enter Thursday's expenses: "); 
double Thursday=myScanner.nextDouble();

System.out.print("Enter Friday's expenses: "); 
double Friday=myScanner.nextDouble();

System.out.print("Enter Saturday's expenses: "); 
double Saturday=myScanner.nextDouble();

System.out.print("Enter Sunday's expenses: "); 
double Sunday=myScanner.nextDouble();

//turn inputs into integers for bar graph stars
int MondayInt=(int) Monday;    
int TuesdayInt=(int) Tuesday;
int WednesdayInt=(int) Wednesday;
int ThursdayInt=(int) Thursday;
int FridayInt=(int) Friday;  
int SaturdayInt=(int) Saturday;
int SundayInt=(int) Sunday;

//create 0 int for help in making bar graphs
int n=0;

//for statements for printing out graphs
for (n=0; n < Monday; n++){
    System.out.print("*");}
System.out.print("  -Monday\n");
for (n=0; n < Tuesday; n++){
    System.out.print("*");}
System.out.print("  -Tuesday\n");
for (n=0; n < Wednesday; n++){
    System.out.print("*");}
System.out.print("  -Wednesday\n");
for (n=0; n < Thursday; n++){
    System.out.print("*");}
System.out.print("  -Thursday\n");
for (n=0; n < Friday; n++){
    System.out.print("*");}
System.out.print("  -Friday\n");
for (n=0; n < Saturday; n++){
    System.out.print("*");}
System.out.print("  -Saturday\n");
for (n=0; n < Sunday; n++){
    System.out.print("*");}
System.out.print("  -Sunday\n");

//calculate and print average
double Average=(Monday+Tuesday+Wednesday+Thursday+Friday+Saturday+Sunday)/7;
System.out.println("Your average daily expenses are "+ Average);

}
 
}










