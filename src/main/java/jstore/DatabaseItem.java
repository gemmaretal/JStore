package jstore;
/**
 * DatabaseItem here.
 *
 * @author Gemma Retal Ananda
 * @version 1.6
 */
import java.util.*;
import java.util.ArrayList;

public class DatabaseItem
{
    // deklarasi tipe data variabel instance
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<Item>();
    private static int LAST_ITEM_ID = 0;
    /**
     * Constructor untuk objek dari class databaseItem
     */
    public DatabaseItem(){}

    // public static Item getItem()
    // {
    //     return itemDB;
    // }

    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }

    public static int getLastItemId(){
        return LAST_ITEM_ID;
    }

    /**
     * Metode untuk menambah item kedalam database item
     *
     * @param  item parameter dari objek item yang ada
     * @return true berhasil menambah
     */
    public static boolean addItem(Item item)
            throws ItemAlreadyExistsException{
        for (Item temp : ITEM_DATABASE ) {
            if(((temp.getName() == item.getName()) && (temp.getCategory() == item.getCategory()) &&
                    (temp.getSupplier() == item.getSupplier()))){
                throw new ItemAlreadyExistsException(item);
//                    return false;
            }
        }
        ITEM_DATABASE.add(item);
        LAST_ITEM_ID = item.getId();
        return true;
    }

    public static Item getItemFromID(int id){
        for (Item item : ITEM_DATABASE){
            if (item.getId() == id ){
                return item;
            }
        }
        return null;
    }

    public static ArrayList<Item> getItemFromSupplier(Supplier supplier){
        ArrayList<Item> bar = new ArrayList<Item>();
        for (Item item : ITEM_DATABASE){
            if (item.getSupplier() == supplier ){
                bar.add(item);
            }
        }
        if (bar != null){
            return bar;
        }
        return null;
    }

    public static ArrayList<Item> getItemFromCategory(ItemCategory category){
        ArrayList<Item> bar = new ArrayList<Item>();
        for (Item item : ITEM_DATABASE){
            if (item.getCategory() == category ){
                bar.add(item);
            }
        }
        if (bar != null){
            return bar;
        }
        return null;
    }

    public static ArrayList<Item> getItemFromStatus(ItemStatus status){
        ArrayList<Item> bar = new ArrayList<Item>();
        for (Item item : ITEM_DATABASE){
            if (item.getStatus() == status ){
                bar.add(item);
            }
        }
        if (bar != null){
            return bar;
        }
        return null;
    }

    /**
     * Metode untuk membuang item dari database item
     *
     * @param  id parameter dari objek item yang ada
     * @return true berhasil membuang
     */
    public static boolean removeItem(int id)
            throws ItemNotFoundException{
        for(Item item : ITEM_DATABASE){
            if(item.getId() == id){
                ITEM_DATABASE.remove(item);
                return true;
            }
        }
        throw new ItemNotFoundException(id);
//            return false;
    }

}
