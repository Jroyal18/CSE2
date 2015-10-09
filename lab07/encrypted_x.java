//Juwan Royal
//Lab #7
//Encrypted_x Java Program
//
//  first complie the program
//      javac Encrypted_x.java
//  run the program
//      java Encrypted_x//

import java.util.Scanner;

//  define a class
public class encrypted_x{

    
//  add main method
    public static void main(String[ ] args) {
//construct scanner       
Scanner MyScanner = new Scanner(System.in);
//ask for user input
System.out.print("Enter integer between 0-100: ");
int input = MyScanner.nextInt();
//while loop to force user to enter integer between 0-100
while (input < 0 || input > 100){
    System.out.print("Error. Please enter integer greater than 0 and less than 100.");
    input = MyScanner.nextInt();
}
//for loops help determine square's shape, if loops determine whether to print star or space
for (int i=1; i<input; i++){
    for (int j=1; j<input; j++){
         if (i==input-j){
            System.out.print(" ");
         } 
         else if (i==j){
            System.out.print(" ");
         }
         else{
            System.out.print("*");
         }
        
    }
    //Each time outer loop runs, start on new line
        System.out.println();
}
}
}








































