package jstore;
/**
 * Write a description of class JStore here.
 *
 * @author GemmaRetalAnanda
 * @version 1.3
 */
import java.io.*;
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
        SpringApplication.run(JStore.class, args);

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

        try {
            DatabaseItem.addItem(new Item ("Water Jet", 11, ItemStatus.New, 500000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
            DatabaseItem.addItem(new Item ("Water Jet1", 11, ItemStatus.Second, 500000, DatabaseSupplier.getSupplier(2), ItemCategory.Electronics));
            DatabaseItem.addItem(new Item ("Water Jet2", 11, ItemStatus.Refurbished, 500000, DatabaseSupplier.getSupplier(3), ItemCategory.Electronics));
            DatabaseItem.addItem(new Item ("Water Jet3", 11, ItemStatus.Refurbished, 500000, DatabaseSupplier.getSupplier(4), ItemCategory.Furniture));

        } catch (ItemAlreadyExistsException err){
            System.out.println("===Item Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }



    }





}
