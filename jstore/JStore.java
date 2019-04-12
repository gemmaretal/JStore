 
/**
 * Write a description of class JStore here.
 *
 * @author GemmaRetalAnanda
 * @version 1.3
 */
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
        Supplier supplier1=new Supplier("gemma","gemmaretal@gmail.com","085891985866",location1);
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
    }
    

}
