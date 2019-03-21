
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE=InvoiceType.Buy;
    private static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Paid;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(int id, Item item, String date, int totalPrice, int totalItem)
    {
        super(id,item,date,totalPrice,totalItem);
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
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