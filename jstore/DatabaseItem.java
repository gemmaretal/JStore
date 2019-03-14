
/**
 * DatabaseItem here.
 *
 * @author Gemma Retal Ananda
 * @version 1.3
 */
public class DatabaseItem{
    private String listItem[];
    public static Item itemDB;

     /**
     * Constructor for objects of class DatabaseItem
     */
    public DatabaseItem(){
    }
     /**
     * method ini digunakan untuk menambah item kedalam database
     *
     * @return boolean true
     */
    
    public static boolean addItem(Item item)
    {
        itemDB = item;
        return true;
    }
       /**
     * method ini digunakan untuk menghapus item kedalam database
     *
     * @return boolean true
     */
    
    public boolean removeItem(Item item){
     return true;
    }
     /**
     * Method yang digunakan untuk mereturn nilai item
     * 
     * @return objek item
     */
    
    public Item getItem(){
     return itemDB;
    }
    /**
     * Method yang digunakan untuk mereturn nilai dari database item
     * 
     * @return list item
     */
    public String[] getItemDatabase(){
     return listItem;
    }
}