package avanu.hardware;

public class Invoice {  
private String partNumber;
private String partDescription;
private int quantity;
private double priceperitem;
private double amount;  
private int price;
public Invoice(String number, String partDescription, int quantity, double price)
{       
        this.partNumber = number;
        this.partDescription = partDescription; 
        this.quantity = quantity;
       
        if (quantity > 0)
        quantity = quantity;
        if (quantity < 0)
        quantity = 0; 
        
        if(price > 0.0)
        priceperitem = price;
        if(price < 0.0)
        priceperitem = 0.0;
        
        
        
}       
public void setPartNumber(String number)
{           
        partNumber = number;            
}       
public String getPartNumber()
{           
        return partNumber;
}   
public void setPartDescription (String description)
{           
        partDescription = description;
}       
    public String getPartDescription(){         
        return partDescription;         
    }   
    public void setQuantity(int quanity){         
    
        quantity = quantity;
    }       
    public int getQuantity(){           
        return quantity;
    }   
    public void setPrice (double price){            
        
            priceperitem = price;           
        
    }       
    public double getPrice(){           
        return priceperitem;
    }   
    public double getInvoiceAmount(){           
         amount = getQuantity() * getPrice();           
         return amount;
    }       
}