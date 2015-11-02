//Juwan Royal
//Homework #10
//Shuffling Java Program
//
//  first complie the program
//      javac Shuffling.java
//  run the program
//      java Shuffling//

//  define a class
public class Shuffling{
  
  public String printArray(String Card){
      for (int i=0; i<52; i++){
        String[] suitNames={"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];
        cards[i]=rankNames[i%13]+suitNames[i/13];
        System.out.print(cards[i]+" ");
}
  }
  
  public String randomizeHand(String CardHand){
      for (int i=0; i<5; i++){
        
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
  System.out.print(cards[i]+" ");
}
printArray(cards);
shuffle(cards);
printArray(cards);
hand = randomizeHand(cards);
printArray(hand);
  }
}




























