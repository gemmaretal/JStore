 
/**
 * Write a description of class JStore here.
 *
 * @author GemmaRetalAnanda
 * @version 1.3
 */
public class JStore
{

    public JStore()
    {

    }

    public static void main(String[] args)
    {
        Location location1=new Location("Banten","KutaBaru","Rumah");
        Supplier supplier1=new Supplier(1,"gemma","gemmaretal@gmail.com","085891985866",location1);
        Item elek1=new Item(1,"Kipas",9,23000,ItemCategory.Electronics,ItemStatus.New, supplier1);
        DatabaseItem.addItem(elek1);
        
        DatabaseItem.addItem(elek1);
        Transaction.orderNewItem(DatabaseItem.getItem());
        Transaction.orderSecondItem(DatabaseItem.getItem());
        Transaction.orderRefurbishedItem(DatabaseItem.getItem());
        Transaction.sellItemPaid(DatabaseItem.getItem());
        Transaction.sellItemUnpaid(DatabaseItem.getItem());
        Transaction.sellItemInstallment(DatabaseItem.getItem());
        
    }
}
    
   
