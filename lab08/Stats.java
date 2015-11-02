//Juwan Royal
//Lab #8
//Stats Java Program
//
//  first complie the program
//      javac Stats.java
//  run the program
//      java Stats//

import java.util.Scanner;

//  define a class
public class Stats{

//  add main method
    public static void main(String[ ] args) {

    //construct scanner       
Scanner MyScanner = new Scanner(System.in);
    System.out.println("Enter first number: ");
    double N1=MyScanner.nextDouble();
    System.out.println("Enter second number: ");
    double N2=MyScanner.nextDouble();
    while (N2<=N1){
        System.out.println("Error. Second number must be greater than first.");
        N2=MyScanner.nextDouble();
    }
    System.out.println("Enter third number: ");
    double N3=MyScanner.nextDouble();
    while (N3<=N2){
        System.out.println("Error. Third number must be greater than second.");
        N3=MyScanner.nextDouble();
    }
    System.out.println("Enter fourth number: ");
    double N4=MyScanner.nextDouble();
    while (N4<=N3){
        System.out.println("Error. Fourth number must be greater than third.");
        N4=MyScanner.nextDouble();
    }
    System.out.println("Enter fifth number: ");
    double N5=MyScanner.nextDouble();
    while (N5<=N4){
        System.out.println("Error. Fifth number must be greater than fourth.");
        N5=MyScanner.nextDouble();
        }
        print(N1, N2, N3, N4, N5);
    }
    public static double mean(double N1, double N2, double N3, double N4, double N5){

    double N_Mean=(N1+N2+N3+N4+N5)/5;
    return N_Mean;
}
    public static double median(double N1, double N2, double N3, double N4, double N5){
    double N_Median=N3;
    return N_Median;
}
    public static void print(double N1, double N2, double N3, double N4, double N5){
        System.out.println("The mean of these five numbers is "+ mean(N1, N2, N3, N4, N5));
        System.out.println("The median of these five numbers is "+ median(N1, N2, N3, N4, N5));
    }
}
/*   
    while(!(N1<N2<N3<N4<N5)){
        System.out.println("Error. Please start again, entering numbers from smallest to largest.");
        System.out.println("Enter first number: ");
        double N1=MyScanner.nextDouble();
        System.out.println("Enter second number: ");
        double N2=MyScanner.nextDouble();
        System.out.println("Enter third number: ");
        double N3=MyScanner.nextDouble();
        System.out.println("Enter fourth number: ");
        double N4=MyScanner.nextDouble();
        System.out.println("Enter fifth number: ");
        double N5=MyScanner.nextDouble();        
}*/


