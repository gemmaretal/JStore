
/**
 * Write a description of class Transaction here.
 *
 * @author GemmaRetalAnanda
 * @version  1.3
* */
public class Transaction
{
    
    /**
     * Constructor for objects of class Transaction
     */
    public Transaction()
    {
        
    }

    public static void orderNewItem(Item item)
    {
        Invoice invoice = new Buy_Paid(1, item, "21/03/2019", 1, item.getPrice());
        if (invoice instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }else
        {
            System.out.println("Salah, Invoice Type adalah Sell_Paid");
        }
        System.out.println("=====Order New Item=====");
        invoice.printData();
        item.printData();
    }
    
    public static void orderSecondItem(Item item)
    {
        Invoice invoice = new Buy_Paid(1, item, "21/03/2019", 1, item.getPrice());
        if (invoice instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }else
        {
            System.out.println("Salah, Invoice Type adalah Sell_Paid");
        }
        System.out.println("=====Order Second Item=====");
        invoice.printData();
        item.printData();
    }
    
    public static void orderRefurbishedItem(Item item)
    {
        Invoice invoice = new Buy_Paid(1, item, "21/03/2019", 1, item.getPrice());
        if (invoice instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }else
        {
            System.out.println("Salah, Invoice Type adalah Sell_Paid");
        }
        System.out.println("=====Order Refurbished Item=====");
        invoice.printData();
        item.printData();
    }
    
    public static void sellItemPaid(Item item)
    {
        Invoice invoice = new Sell_Paid(1,item, "21/03/2019", 1,item.getPrice());
        System.out.println("=====Sell Item Paid=====");
        invoice.printData();
        item.printData();
    }
    
    public static void sellItemUnpaid(Item item)
    {
        Invoice invoice = new Sell_Unpaid(1,item,"21/02/2019",1,item.getPrice(),"23/02/2019");
        System.out.println("=====Sell Item Unpaid=====");
        invoice.printData();
        item.printData();
    }
    
    public static void sellItemInstallment(Item item)
    {
        Invoice invoice = new Sell_Installment(1,item, "21/02/2019", item.getPrice(),14, 4);
        System.out.println("=====Sell Item Installment=====");
        invoice.printData();
        item.printData();
    }
}