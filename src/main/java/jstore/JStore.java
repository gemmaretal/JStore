package jstore;
import javax.xml.crypto.Data;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class JStore
{
    public JStore()
    {
        
    }

    public static void main(String[] args)
    {
        Location location1 = new Location("Region3","Hoen", "Hoen");
        Location location2 = new Location("Region2","Johto", "Johto");


        try {
            DatabaseSupplier.addSupplier(new Supplier("Steven Stone","stevenstone@gmail.com", "0800000004", location2));
        } catch (SupplierAlreadyExistsException e) {
            e.getExMessage();
        }
        try {
            DatabaseSupplier.addSupplier(new Supplier("May Valentine","mayvalentine@gmail.com", "0800000003", location1));
        } catch (SupplierAlreadyExistsException e) {
        }


        try {
            DatabaseItem.addItem(new Item("Poke Ball", 4500000, ItemCategory.Electronics, ItemStatus.New,  DatabaseSupplier.getSupplier(1)));
        } catch (ItemAlreadyExistsException e) {
            e.getExMessage();
        }
        try {
            DatabaseItem.addItem(new Item("Nitento Switch", 70000000, ItemCategory.Electronics, ItemStatus.New , DatabaseSupplier.getSupplier(1)));
        } catch (ItemAlreadyExistsException e) {
            e.getExMessage();
        }
        try {
            DatabaseItem.addItem(new Item("Great Ball", 8000000, ItemCategory.Electronics, ItemStatus.Second, DatabaseSupplier.getSupplier(1)));
        } catch (ItemAlreadyExistsException e) {
            e.getExMessage();
        }
        try {
            DatabaseItem.addItem(new Item("Full Restore", 2540000, ItemCategory.Electronics, ItemStatus.Refurbished, DatabaseSupplier.getSupplier(2)));
        } catch (ItemAlreadyExistsException e) {
            e.getExMessage();
        }
        try {
            DatabaseItem.addItem(new Item("Aurora Ticket", 7850000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(2)));
        } catch (ItemAlreadyExistsException e) {
            e.getExMessage();
        }


        SpringApplication.run(JStore.class, args);
    }
}