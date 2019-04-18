
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.text.*;
public class Sell_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive;
    
    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
        super(item);        
        this.customer = customer;
        this.isActive = false;
    }

    public Customer getCustomer(){
        return customer;
    }

    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat ("dd MMM yyyy");
        setTotalPrice(0);
        for (int bar : this.getItem()){
            System.out.println(DatabaseItem.getItemFromID(bar).toString());            
        }

        return "====Sell Paid=== \nID= "+this.getId()+
        "\nBuy Date: "+sdf.format(this.getDate().getTime())+
        "\nPrice Total: "+this.getTotalPrice()+
        "\nCustomer ID= "+ this.getCustomer().getId() +
        "\nCustomer Name= "+ this.getCustomer().getName() +
        "\nStatus: " + InvoiceStatus.Paid +
        "\nSell Success\n";    
    }
}
