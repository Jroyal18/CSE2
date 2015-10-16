//Juwan Royal
//HW #7
//Twisty! Java Program
//
//  first complie the program
//      javac Twisty!.java
//  run the program
//      java Twisty!//

import java.util.Scanner;

//  define a class
public class Twisty{
    
    //  add main method
    public static void main(String[ ] args) {
    
//construct scanner       
Scanner MyScanner = new Scanner(System.in);
//ask for user input
System.out.print("Enter length between 0-80: ");
int inputL = MyScanner.nextInt();
//while loop to force user to enter integer between 0-80
while (inputL < 0 || inputL > 80){
    System.out.print("Error. Please enter length greater than 0 and less than 80.");
    inputL = MyScanner.nextInt();
}
System.out.print("Enter width that is less than length: ");
int inputW = MyScanner.nextInt();

while (inputW > inputL){
    System.out.print("Error. Width must be smaller than length.");
    inputW = MyScanner.nextInt();
}
//integer for determining number of times patterned is printed
int patcounter=inputL/inputW;
//nested for loops to generate first part ofpattern based on number of lines and characters on each line
for (int lesspat=1; lesspat <= patcounter; lesspat++){
    for (int i=1; i<=inputW; i++){
        for (int j=1; j<inputL; j++){
        
        if (i==j){
            System.out.print("#");
        }
        else if (i==inputW-(j-1)){
            System.out.print("/");
        }
        else{
            System.out.print(" ");
        }
        }
        //Each time outer loop runs, start on new line
        System.out.println();
        }
//loop for second part of pattern; width is constant so second for loop is same
for (int k=inputW; k>0; k--){
    for (int m=1; m<inputL; m++){
        if (k==m){
            System.out.print("#");
        }
        else if (k==inputW-(m-1)){
            System.out.print("\\");
        }
        else{
            System.out.print(" ");
        }
        }
        System.out.println();
}
}
}
}




