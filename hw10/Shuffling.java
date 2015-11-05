//Juwan Royal
//Homework #10
//Shuffling Java Program
//
//  first complie the program
//      javac Shuffling.java
//  run the program
//      java Shuffling//

import java.util.Scanner;
//  define a class
public class Shuffling{
  
  //print deck method
  public static void printArray(String[] list){
      for (int i=0; i<list.length; i++){
        System.out.print(list[i]+" ");
}
  }
  
  //shuffle deck method
  public static void shuffle(String[] list){
        Scanner scan=new Scanner(System.in);
        System.out.print("\n"+"Shuffle how many times? Pick a number greater than 50. ");
        int swap=scan.nextInt();
        while (swap<50){
          System.out.print("Error. Choose a number greater than 50. ");
          swap=scan.nextInt();
        }
        System.out.println("Shuffled Deck:");
        for (int n=0; n<swap; n++){
            String h=list[0];
            int j=(int)(Math.random()*51)+1;
            list[0]=list[j];
            list[j]=h;
          
  }
      }
      //random hand method
  public static String[] randomizeHand(String[] list){
        System.out.println("\n"+"This is your hand:");
        String a=list[(int)(Math.random()*51)];
        String b=list[(int)(Math.random()*51)];
        String c=list[(int)(Math.random()*51)];
        String d=list[(int)(Math.random()*51)];
        String e=list[(int)(Math.random()*51)];
        String[] CardHand={a+" ",b+" ",c+" ",d+" ",e};
        return CardHand;
}
//  add main method
    public static void main(String[ ] args) {

    Scanner scan = new Scanner(System.in);
    
	//suits club, heart, spade or diamond
	
String[] suitNames={"C","H","S","D"};   
String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
String[] cards = new String[52];
String[] hand = new String[5];
for (int i=0; i<52; i++){
  cards[i]=rankNames[i%13]+suitNames[i/13];
}
//print cards in deck, cards in shuffled deck, and random hand

printArray(cards);
shuffle(cards);
printArray(cards);
hand = randomizeHand(cards);
printArray(hand);
  }
}




























