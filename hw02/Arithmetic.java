//Nick Hochrein
//February 3
//HW02
//Arithmetic Java Program
//
//define a class
public class Arithmetic{
    
//add main method
    public static void main(String[] args) {
        
//input variables
    int nSocks=3; //number of pairs of socks
    double sockCost$=2.58; //cost of pair of socks
    int nGlasses=6; //number of glasses
    double glassCost$=2.29; //cost of glass
    int nEnvelopes=1; //number of boxes of envelopes
    double envelopeCost$=3.25; //cost of box of envelopes
    double taxPercent=0.06; //rate of taxes
    double totalSockCost$; //cost of all socks
    double totalGlassCost$; //cost of all glasses
    double totalEnvelopeCost$; //cost of all envelopes
    double sockSalesTax$; //total sales tax of socks
    double glassSalesTax$; //total sales tax of glasses
    double envelopeSalesTax$; //total sales tax of envelopes
    double totalCostNoTaxes$; //cost without taxes
    double totalCost$; //total cost with taxes
    
//print out items and cost
        System.out.println(nSocks+" socks for "+sockCost$);
        System.out.println(nGlasses+" glasses for "+glassCost$);
        System.out.println(nEnvelopes+" envelope for "+envelopeCost$);

//calculate total costs of items and sales tax
            totalSockCost$=nSocks*sockCost$; //calculate cost of socks
            totalGlassCost$=nGlasses*glassCost$; //calculate cost of glasses
            totalEnvelopeCost$=nEnvelopes*envelopeCost$; //calculate cost of envelopes
            sockSalesTax$=totalSockCost$*taxPercent; //calculate sock sales tax
            glassSalesTax$=totalGlassCost$*taxPercent; //calculate glass sales tax
            envelopeSalesTax$=totalEnvelopeCost$*taxPercent; //calculate envelope sales tax

//print out cost of items and sales tax
            System.out.println("The socks cost "+totalSockCost$+" with a sales tax of "+sockSalesTax$);
            System.out.println("The glasses cost "+totalGlassCost$+" with a sales tax of "+glassSalesTax$);
            System.out.println("The envelopes cost "+totalEnvelopeCost$+" with a sales tax of "+envelopeSalesTax$);
            
//calculate and print out total cost of purchases before tax
            totalCostNoTaxes$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$; 
            System.out.println("The total cost before taxes is "+totalCostNoTaxes$);
            
//calculate and print out total cost with taxes
            totalCost$=totalCostNoTaxes$+sockSalesTax$+glassSalesTax$+envelopeSalesTax$;
            System.out.print("The total cost is ");
            System.out.printf( "%.2f %n", totalCost$);
    
    } //end of main method
} //end of class