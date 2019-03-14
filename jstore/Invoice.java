
/**
 * Invoice here.
 *
 * @author Gemma Retal Ananda
 * @version 1.3
 */
public class Invoice
{
    private int id;
    private Item item;
    private String date;
    private int totalPrice;
    private int totalItem;
    private InvoiceStatus status;


     public Invoice(int id, Item item, String date, int totalPrice, InvoiceStatus status){    
        this.id=id;
        this.item=item;
        this.date=date;
        this.totalPrice=totalPrice;
        this.status=status;
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
    
    public InvoiceStatus getstatus()
    {
        return status;
    }
   
    
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
    
    public void printData()
    {
       System.out.println("==========INVOICE=======");
       System.out.println("ID :" + id);
       System.out.println("Date :" + date );
       System.out.println("Item :" + item );
       System.out.println("Total Item :" + totalItem );
       System.out.println("Total harga :" + totalPrice);
       System.out.println("Status :" + status );
    }
}

