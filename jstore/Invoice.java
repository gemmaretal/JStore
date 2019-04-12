import java.util.*;
/**
 * Invoice here.
 *
 * @author Gemma Retal Ananda
 * @version 1.6
 */


public abstract class Invoice
{
    private int id;
    private ArrayList<Integer> item = new ArrayList<Integer>();
    private Calendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;
    private InvoiceStatus status;
    private InvoiceType type;


    public Invoice(ArrayList<Integer> item)
    {
        // initialise instance variables
        this.id = DatabaseCustomer.getLastCustomerID() + 1;
        this.item = item;
        this.date = Calendar.getInstance();  
    }

    public int getId()
    {
        return id;
    }
    
    public ArrayList<Integer> getItem()
    {
        return item;
    }
    
    public Calendar getDate()
    {
        return date;
    }
    
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    public boolean getIsActive(){
        return isActive;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public abstract InvoiceStatus getInvoiceStatus();
    
    public abstract InvoiceType getInvoiceType();
    
    public void setId (int id)
    {
        this.id = id;
    }
    
    public void setItem (ArrayList<Integer> item)
    {
        this.item = item;
    }
    
    public void setCustomer (Customer customer){
        this.customer = customer;
    }
    
    public void setIsActive(boolean isActive){
        this.isActive = isActive; 
    }
    
    public void setDate (Calendar date)
    {
        this.date = date;
    }
    
    public void setTotalPrice (int totalPrice)
    {
        for (int temp : item) {
            this.totalPrice = this.totalPrice + DatabaseItem.getItemFromID(temp).getPrice();            
        }
    }
       
    //  public abstract void setInvoiceStatus (InvoiceStatus status);
    public void setInvoiceStatus (InvoiceStatus status){
        this.status = status;
    }
    
    public abstract String toString();
}
