//Juwan Royal
//Lab #6
//Getting Loopy Java Program
//
//  first complie the program
//      javac GettingLoopy.java
//  run the program
//      java GettingLoopy//

//  define a class
public class GettingLoopy{

    
//  add main method
    public static void main(String[ ] args) {
        
int x=1;
    while (x>0 && x<8){
        if (x==7){
        System.out.print("7"+"7"+"7"+"7"+"7");
        }
    System.out.print(x);
    x++;
    }
int y=10;
int z=100;
    while (y<=z){
        for (int n=2; n<y; n++){
            if (!(y % n==0)){
            System.out.print("While Loop :"+ y+"\t");
        }
        }
        y++;
    }
    for (y=10; y<z; y++){
        for (int n=2; n<y; n++){
            if (!(y % n==0)){
                System.out.print("For Loop :"+y+"\t");
            }
        }
        
    }
    }
    }
