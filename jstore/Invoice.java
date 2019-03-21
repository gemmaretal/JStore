
/**
 * Invoice here.
 *
 * @author Gemma Retal Ananda
 * @version 1.3
 */
public abstract class Invoice
{
    private int id;
    private Item item;
    private String date;
    protected int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    private InvoiceType type;


     public Invoice(int id, Item item, String date, int totalPrice,int totalItem){    
        this.id=id;
        this.item=item;
        this.date=date;
        this.totalPrice=totalPrice;
        this.status=status;
        this.totalItem=totalItem;
    }

    public int getid()
    {
        return id;
    }
    
    public Item getitem()
    {
        return item;
    }
    
    public String getdate()
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
    
    public InvoiceStatus getStatus()
    {
        return status;
    }
    
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
    
    public void setdate(String date)
    {
        this.date=date;
    }
    
    public void settotalPrice(int totalPrice)
    {
        this.totalPrice=totalPrice;
    }
    
 
    public void setStatus(InvoiceStatus status)
    {
        this.status=status;
    }
    
    public abstract void printData();
    
}

