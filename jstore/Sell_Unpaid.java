
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;

    public Sell_Unpaid(int id, Item item, int totalItem, Customer customer)
    {
        super(id, item, totalItem);
        this.customer = customer;
        this.dueDate = Calendar.getInstance();
        this.dueDate.add(Calendar.DATE,+1);
    }

    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    public Calendar getDueDate(){
        return dueDate;
    }
    
    public void setCustomer(Customer customer){
        this.customer=customer;
    }
    public void setDueDate(Calendar dueDate){
        this.dueDate=dueDate;
    }
      
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.INVOICE_STATUS=status;
    }
    
    public String toString(){
        return "";
    }
}