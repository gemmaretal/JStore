
/**
 * Invoice here.
 *
 * @author Gemma Retal Ananda
 * @version (29/02/2019)
 */
public class Invoice
{
    protected int id;
    protected Item item;
    protected String date;
    protected int totalPrice;


     public Invoice(int id, Item item, String date, int totalPrice){    
        this.id=id;
        this.item=item;
        this.date=date;
        this.totalPrice=totalPrice;
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
    
    public void printData()
    {
       System.out.println(totalPrice);
    }
}

