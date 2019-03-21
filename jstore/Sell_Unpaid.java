
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Unpaid;
    private String dueDate;
    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(int id, Item item, String date, int totalPrice, int totalItem, String dueDate)
    {
        super(id,item,date,totalPrice,totalItem);
        this.dueDate=dueDate;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public String getdueDate()
    {
        return dueDate;
    }
    
    public void printData()
    {
        System.out.println("==========INVOICE=======");
        System.out.println("ID :" + getid());
        System.out.println("Date :" + getdate());
        System.out.println("Item yang terdapat :" + getitem().getName());
        System.out.println("Total harga :" + gettotalPrice());
        System.out.println("Status :" + getStatus());
        
    }
 
}