
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Paid;
    private Customer customer;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Paid(int id, Item item, int totalItem, Customer customer)
    {
        super(id,item,totalItem);
        this.customer=customer;
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.INVOICE_STATUS=status;
    }
    
    public String toString()
    {
        return "";
    }
 
}