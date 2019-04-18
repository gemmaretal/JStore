
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

     public static boolean addItem(Item item)
    {
        for (Item temp : ITEM_DATABASE ) {
            if((temp.getName() == item.getName()) && (temp.getStatus() == item.getStatus()) &&
             (temp.getSupplier() == item.getSupplier()) && (temp.getCategory()== item.getCategory()) ){
                return false;
            }
        }
        LAST_ITEM_ID = item.getId();
        ITEM_DATABASE.add(item);
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
     * @param  //item parameter dari objek item yang ada
     * @return true berhasil membuang
     */
    public static boolean removeItem(int id)
    {
        for(Item item : ITEM_DATABASE){
            if(item.getId() == id){
                ITEM_DATABASE.remove(item);
                return true;
            }
        }
        return false;
    }

}
