//Juwan Royal
//HW #8
//String Analysis Java Program
//
//  first complie the program
//      javac String Analysis.java
//  run the program
//      java String Analysis//

//create scanner for taking inputs
import java.util.Scanner;

//  define a class
public class StringAnalysis{

    
//method for using string and int    
public static boolean boolio(String Lan, int n){
    int StrLength=Lan.length();
    int i;
    boolean ib=true;
    System.out.println("This string is " + StrLength + " characters long, so...");
    for (i=0; i<n; i++){
        ib=Character.isLetter(Lan.charAt(i));
        System.out.println((Lan.charAt(i)) + " is " + ib);
        }
        return ib;
}

//method for using string
public static boolean boolio(String Lan){
    int StrLength=Lan.length();
    int i;
    boolean ib=true;
    for (i=0; i<StrLength; i++){
        ib=Character.isLetter(Lan.charAt(i));
        System.out.println((Lan.charAt(i)) + " is " + ib);
    }
        return ib;
}
//  add main method
    public static void main(String[ ] args) {
    Scanner MyScanner=new Scanner(System.in);
    System.out.print("Enter string to examine if characters are letters or not: ");
    String Word=MyScanner.nextLine();
    //this is to know how long the string is
    int StrLength=Word.length();
    //create another string for deciding some or all characters, then make strings for all and some
    System.out.print("Would you like to examine all characters or some? Enter some or all.");
    String Pick=MyScanner.nextLine();
    String Some="some";
    String All="all";
    //if statements to call methods
    if (Pick.equals(Some)){
        System.out.print("How many? ");
        int n=MyScanner.nextInt();
        boolio(Word, n);    
    }
    if (Pick.equals(All)){
        boolio(Word);
    }
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        