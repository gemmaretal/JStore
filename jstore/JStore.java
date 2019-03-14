
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
        location1.printData();
        supplier1.printData();
        
        Transaction.orderNewItem(supplier1);
        Transaction.orderSecondItem(supplier1);
        Transaction.orderRefurbishedItem(supplier1);
        Transaction.sellItemPaid(DatabaseItem.itemDB);
        Transaction.sellItemUnpaid(DatabaseItem.itemDB);
        Transaction.sellItemInstallment(DatabaseItem.itemDB);
        
    }
    
   
}