package avanu.hardware;


public class InvoiceTest {
public static void main(String[] args) {        
          
    Invoice invoice1 = new Invoice("1234","Spade",5,750);      
    System.out.printf( "Part number: %s\n", invoice1.getPartNumber());
    System.out.printf( "Part Description: %s\n", invoice1.getPartDescription());
    System.out.printf( "Quantity: %s\n", invoice1.getQuantity());
    System.out.printf( "Price: %s\n", invoice1.getPrice());
    
}
}