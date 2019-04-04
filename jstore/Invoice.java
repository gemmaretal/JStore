
/**
 * Invoice here.
 *
 * @author Gemma Retal Ananda
 * @version 1.5
 */

import java.util.*;
public abstract class Invoice
{
    private int id;
    private Item item;
    private Calendar  date=Calendar.getInstance();
    protected int totalPrice;
    private int totalItem;
    //private InvoiceStatus status;
    //private InvoiceType type;


     public Invoice(int id, Item item, int totalItem)
    {
        this.id=id;
        this.item=item;
        this.totalItem=totalItem;
        settotalPrice(totalItem*item.getPrice());
    }

    public int getid()
    {
        return id;
    }
    
    public Item getitem()
    {
        return item;
    }
    
    public Calendar getdate()
    {
        return date;
    }
    
    public int gettotalPrice()
    {
        return totalPrice;
    }
    
    public int gettotalItem()
    {
        return totalItem;
    }
    
    /*public InvoiceStatus getStatus()
    {
        return status;
    }*/
    
    public abstract InvoiceStatus getInvoiceStatus();
    
    public abstract InvoiceType getInvoiceType();    
    
    
    
    public void setId(int id)
    {
        this.id=id;
    }
    
    public void setidItem(int idItem)
    {
        this.item=item;
    }
    
    public void setdate(Calendar date)
    {
        this.date=date;
    }
    
    public void settotalPrice(int totalPrice)
    {
        this.totalPrice=totalPrice;
    }
    
    
 
    public abstract void setInvoiceStatus(InvoiceStatus status);
    
    public abstract String toString();
    
}

