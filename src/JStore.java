     
/**
 * Write a description of class JStore here.
 *
 * @author GemmaRetalAnanda
 * @version 1.3
 */
import java.io.*;
import java.util.*;
public class JStore
{

    public JStore()
    {
    }

    public static void main(String[] args)
    {
        // create location and supplier
        Location location1=new Location("Banten","KutaBaru","Rumah");
        try {
            DatabaseSupplier.addSupplier(new Supplier("gemma1","gemmaretal1@gmail.com","085891985896",location1));
            DatabaseSupplier.addSupplier(new Supplier("gemma2","gemmaretal2@gmail.com","085891985856",location1));
            DatabaseSupplier.addSupplier(new Supplier("gemma3","gemmaretal3@gmail.com","085891985876",location1));
        } catch (SupplierAlreadyExistsException err){
            System.out.println("==Supplier Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }

//DEMO
        try {
            DatabaseCustomer.addCustomer(new Customer("gemma","gemmananda@ui.ac.id","gemma.retal","serahlo",1, 1998, 12, 06));
            DatabaseCustomer.addCustomer(new Customer("gemma1","gemmananda1@ui.ac.id","gemma1.retal","serahlo1",1, 1998, 12, 06));
            DatabaseCustomer.addCustomer(new Customer("gemma2","gemmananda2@ui.ac.id","gemma2.retal","serahlo2",1, 1998, 12, 06));

        }catch (CustomerAlreadyExistsException err){
            System.out.println("===Customer Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }

        try {
            DatabaseItem.addItem(new Item ("Water Jet", 11, ItemStatus.New, 500000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));

            DatabaseItem.addItem(new Item ("Water Jet1", 11, ItemStatus.Second, 500000, DatabaseSupplier.getSupplier(2), ItemCategory.Electronics));

            DatabaseItem.addItem(new Item ("Water Jet2", 11, ItemStatus.Refurbished, 500000, DatabaseSupplier.getSupplier(3), ItemCategory.Electronics));

        } catch (ItemAlreadyExistsException err){
            System.out.println("===Item Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }

//item
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(1);
        Transaction.sellItemPaid(itemID, DatabaseCustomer.getCustomer(1));
        Transaction.sellItemPaid(itemID, DatabaseCustomer.getCustomer(1));

        itemID.clear();
        itemID.add(2);
        Transaction.sellItemUnpaid(itemID, DatabaseCustomer.getCustomer(2));
        Transaction.sellItemUnpaid(itemID, DatabaseCustomer.getCustomer(2));

//REMOVE
        try {
            DatabaseItem.removeItem(4);
        } catch (ItemNotFoundException e) {
            System.out.println("===Item Not Found===");
            System.out.println(e.getExMessage());
            System.out.println();
        }

        try{
            DatabaseInvoice.removeInvoice(4);
        } catch (InvoiceNotFoundException e) {
            System.out.println("===Invoice Not Found===");
            System.out.println(e.getExMessage());
            System.out.println();
        }

        try{
            DatabaseCustomer.removeCustomer(4);
        } catch (CustomerNotFoundException e) {
            System.out.println("===Customer Not Found===");
            System.out.println(e.getExMessage());
            System.out.println();
        }

        try {
            DatabaseSupplier.removeSupplier(4);
        }catch (SupplierNotFoundException e) {
            System.out.println("===Supllier Not Found===");
            System.out.println(e.getExMessage());
            System.out.println();
        }

        try {
            DatabaseInvoice.getActiveOrder(DatabaseCustomer.getCustomer(3));
        } catch (CustomerDoesntHaveActiveException e) {
            System.out.println("===Don't Have Active===");
            System.out.println(e.getExMessage());
            System.out.println();
        }
        ArrayList<Invoice> tempInv = DatabaseInvoice.getInvoiceDatabase();
        ArrayList<Supplier> tempSup = DatabaseSupplier.getSupplierDatabase();
        ArrayList<Customer> tempCust = DatabaseCustomer.getCustomerDatabase();
        ArrayList<Item> tempItem = DatabaseItem.getItemDatabase();

        System.out.println(tempSup);
        System.out.println(tempCust);
        System.out.println(tempItem);
        System.out.println(tempInv);

        /*Location location2=new Location("Jakarta","Kapuk","Entah");


        System.out.println();
        System.out.println("DatabaseSupplier");
        for (Supplier supplier : DatabaseSupplier.getSupplierDatabase()){
            System.out.println(supplier);
        } 
        

        
        System.out.println();
        System.out.println("DatabaseItem");
        for (Item item : DatabaseItem.getItemDatabase()){
            System.out.println(item);
        }             
        
        

        
        System.out.println();
        System.out.println("DatabaseCustomer");
        for (Customer customer : DatabaseCustomer.getCustomerDatabase()){
            System.out.println(customer);
        }          
        
        
        ArrayList<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        ArrayList<Integer> items2 = new ArrayList<Integer>();
        items2.add(2);
        items2.add(3);
        ArrayList<Integer> items3 = new ArrayList<Integer>();
        items3.add(3);      
        items3.add(1);  
        
        DatabaseInvoice.addInvoice(new Sell_Paid (items, DatabaseCustomer.getCustomer(1) ));
        DatabaseInvoice.addInvoice(new Sell_Installment(items2, 90,DatabaseCustomer.getCustomer(2)));
        DatabaseInvoice.addInvoice(new Sell_Unpaid(items3, DatabaseCustomer.getCustomer(3)));
        System.out.println();
        System.out.println("DatabaseInvoice");
        
        for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase()){
            System.out.println(invoice);
        }   
        
        
        //Transaction.finishTransaction(DatabaseInvoice.getInvoice(2));
        Transaction.finishTransaction(DatabaseInvoice.getInvoice(3));
        
        
        //System.out.println
           Transaction.cancelTransaction(DatabaseInvoice.getInvoice(2)
            );
            
            for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase()){
            System.out.println(invoice);
        }   
          
        
            
        /* 
        * 
        * 
        * 
        * 
        
        * 
        
        * Transaction.finishTransaction(DatabaseInvoice.getInvoice(2));
        Transaction.finishTransaction(DatabaseInvoice.getInvoice(3));
        
        System.out.println(
            Transaction.cancelTransaction(DatabaseInvoice.getInvoice(2))
            );
        * Supplier supplier1=new Supplier("gemma","gemmaretal@gmail.com","085891985866",location1);
        Supplier supplier2=new Supplier("ananda","ananda@gmail.com","08512345678",location1);
        Supplier supplier3=new Supplier("helda","heldaretal@gmail.com","085111985866",location1);
        Supplier supplier4=new Supplier("kirino","kirisaki@gmail.com","085891985666",location1);
        
        //create item
        Item barang1 = new Item("Water JetPam", 10, ItemStatus.New, 500000, supplier1, ItemCategory.Electronics);
        Item barang2 = new Item("AC", 10, ItemStatus.New, 500000, supplier1, ItemCategory.Electronics);
        Item barang3 = new Item("Humidifier", 10, ItemStatus.New, 500000, supplier1, ItemCategory.Electronics);
        Item barang4 = new Item("Sofa", 10, ItemStatus.New, 500000, supplier2, ItemCategory.Furniture);

        Customer customer1 = new Customer("gemma","gemmaretal@ui.ac.id","gemma.retal","sayatidaktahu",1, 1998, 12, 06);
       
        System.out.println(location1.toString());
        //Supplier
        DatabaseSupplier.addSupplier(supplier1);
        DatabaseSupplier.addSupplier(supplier2);
        DatabaseSupplier.addSupplier(supplier3);
        ArrayList<Supplier> tempSup = DatabaseSupplier.getSupplierDatabase();
        for(Supplier temp: tempSup){
            System.out.println(temp.toString());
        }
        //Item
        DatabaseItem.addItem(barang1);
        DatabaseItem.addItem(barang2);
        DatabaseItem.addItem(barang3);
        DatabaseItem.addItem(barang4);
        ArrayList<Item> tempItem = DatabaseItem.getItemDatabase();
        for(Item temp: tempItem){
            System.out.println(temp.toString());
        }
        //Customer
        DatabaseCustomer.addCustomer(customer1);
        Customer customer2 = new Customer("gemma","gemmananda@ui.ac.id","gemma.retal","serahlo",1, 1998, 12, 06);
        DatabaseCustomer.addCustomer(customer2);
        Customer customer3 = new Customer("gemma","gemmaretal@gmail.com","gemma.retal","yaudah",1, 1998, 12, 06);
        DatabaseCustomer.addCustomer(customer3);
        ArrayList<Customer> tempCust = DatabaseCustomer.getCustomerDatabase();
        for(Customer temp: tempCust){
            System.out.println(temp.toString());
        }

        Transaction.orderNewItem(barang1);
        Transaction.sellItemPaid(barang1, customer1);
        Transaction.sellItemUnpaid(barang1, customer1);
        Transaction.sellItemInstallment(barang1, customer1, 15);
        */

    }
    

}
