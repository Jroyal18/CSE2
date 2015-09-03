//Juwan Royal
//HW #2 
//Grocery List Java Program
//
//  first complie the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//

//  define a class
public class Arithmetic{
    
//  add main method
    public static void main(String[ ] args) {
        
//number of pairs of socks
int nSocks=3;
//cost per pair 
double sockCost$=2.58;
System.out.println("Socks");
System.out.println("3 Pairs");
System.out.println("$2.58/pair");

//number of drinking glasses
int nGlasses=6;
//cost per glass
double glassCost$=2.29;
System.out.println("Drinking Glasses");
System.out.println("6 Glasses");
System.out.println("$2.29/glass");

//number of boxes of envelopes
int nEnvelopes=1;
//cost per box
double envelopeCost$=3.25;
System.out.println("Envelope Box");
System.out.println("1 Box");
System.out.println("$3.25/box");

double taxPercent=0.06;

//find total cost of socks with & without tax, and the tax on the socks
double totalSocksNoTax=(nSocks*sockCost$);
int newSocksNoTax=(int)(totalSocksNoTax*100);
double realSocksNoTax=newSocksNoTax/100.0;
System.out.println("Total cost of 3 pairs of socks without tax is $" + realSocksNoTax);
double sockTax=(nSocks*sockCost$)*taxPercent;
int newSockTax=(int) (sockTax*100);
double realSockTax=newSockTax/100.0;
System.out.println("Sales tax on 3 pairs of socks is $" + realSockTax);
double totalSockCost$=(nSocks*sockCost$)+sockTax;
int newSockCost$=(int) (totalSockCost$*100);
double realSockCost$=newSockCost$/100.0;
System.out.println("Total cost of 3 pairs of socks is $" + realSockCost$);

//find total cost of glasses with & without tax, and the tax on the glasses
double totalGlassesNoTax=(nGlasses*glassCost$);
int newGlassesNoTax=(int)(totalGlassesNoTax*100);
double realGlassesNoTax=newGlassesNoTax/100.0;
System.out.println("Total cost of 6 drinking glasses without tax is $" + realGlassesNoTax);
double glassTax=(nGlasses*glassCost$)*taxPercent;
int newGlassTax=(int) (glassTax*100);
double realGlassTax=newGlassTax/100.0;
System.out.println("Sales tax on 6 drinking glasses is $" + realGlassTax);
double totalGlassCost$=(nGlasses*glassCost$)+glassTax;
int newGlassCost$=(int) (totalGlassCost$*100);
double realGlassCost$=newGlassCost$/100.0;
System.out.println("Total cost of 6 drinking glasses is $" + realGlassCost$);

//find total cost of envelope box with & without tax, and the tax on the box
double totalEnvelopeNoTax=(nEnvelopes*envelopeCost$);
int newEnvelopeNoTax=(int)(totalEnvelopeNoTax*100);
double realEnvelopeNoTax=newEnvelopeNoTax/100.0;
System.out.println("Total cost of a box of envelopes without tax is $" + realEnvelopeNoTax);
double envelopeTax=(nEnvelopes*envelopeCost$)*taxPercent;
int newEnvelopeTax=(int) (envelopeTax*100);
double realEnvelopeTax=newEnvelopeTax/100.0;
System.out.println("Sales tax on a box of envelopes is $" + realEnvelopeTax);
double totalEnvelopeCost$=(nEnvelopes*envelopeCost$)+envelopeTax;
int newEnvelopeCost$=(int) (totalEnvelopeCost$*100);
double realEnvelopeCost$=newEnvelopeCost$/100.0;
System.out.println("Total cost of a box of envelopes is $" +  realEnvelopeCost$);

//find total sales tax, total transaction without tax & with tax
double totalAllNoTax=(nSocks*sockCost$)+(nGlasses*glassCost$)+(nEnvelopes*envelopeCost$);
System.out.println("Total without tax is $" + totalAllNoTax);
double totalTax=realSockTax+realGlassTax+realEnvelopeTax;
System.out.println("Total sales tax is $" + totalTax);
double totalAllWithTax=realSockCost$+realGlassCost$+realEnvelopeCost$;
System.out.println("Total with tax is $" +  totalAllWithTax);
}
}







