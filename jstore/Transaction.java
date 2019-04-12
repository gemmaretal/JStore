
/**
 * Transaction class is used to list all of the transaction
 *
 * @author GemmaRetalAnanda
 * @version  1.6
* */

import java.util.*;
import java.text.*;
public class Transaction
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Transaction
     */
    public Transaction()
    {
    }
    
    public static void orderNewItem (Item item)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void orderSecondItem (Item item)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        item.setStatus(ItemStatus.Second);
        itemID.add(item.getId());
        Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void orderRefurbishedItem (Item item)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        item.setStatus(ItemStatus.Refurbished);
        itemID.add(item.getId());
        Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void sellItemPaid (Item item, Customer customer)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Paid(itemID,customer);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void sellItemUnpaid (Item item, Customer customer)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Unpaid(itemID,customer);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void sellItemInstallment (Item item, Customer customer, int installmentPeriod)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Installment(itemID,installmentPeriod,customer);
        DatabaseInvoice.addInvoice(invoice);
    }

    public static boolean finishTranscation (Invoice invoice){
        Invoice bon = DatabaseInvoice.getInvoice(invoice.getId());
        if (bon != null){
            invoice.setIsActive(false);
            System.out.println("Invoice isActive: " + invoice.getIsActive());
            return true;            
        }
        else{
            return false;
        }
    }

    public static boolean cancelTransaction (Invoice invoice){
        Invoice bon = DatabaseInvoice.getInvoice(invoice.getId());
        if (bon != null){
            DatabaseInvoice.removeInvoice(bon.getId());
            return true;            
        }
        else{
            return false;
        }
    }
}
