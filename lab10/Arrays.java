//Juwan Royal
//Lab #10
//Arrays Java Program
//
//  first complie the program
//      javac Arrays.java
//  run the program
//      java Arrays//

//create scanner for taking input
import java.util.Scanner;

//  define a class
public class Arrays{

    
//  add main method
    public static void main(String[ ] args) {
        
    Scanner MyScanner=new Scanner (System.in);
    
    int num_students=(int)(Math.random()*5)+5;
    int grades=(int)(num_students);
    int [] midterm=new int[num_students];
    for (int i=0; i<num_students; i++){
        String [] students=new String[num_students];
        System.out.println("Enter student's name: ");
        String Student=MyScanner.nextLine();
        students[i]=Student;        
        midterm[i]=(int)(Math.random()*100);
        System.out.println(students[i]+": "+midterm[i]);       
    }
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    