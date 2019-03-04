
/**
 * DatabaseItem here.
 *
 * @author Gemma Retal Ananda
 * @version (29/02/2019)
 */
public class DatabaseItem
{
    private String listItem[];
    private Item item;

    public DatabaseItem(){
    }
    //untuk menambahkan item ke class Item
    public boolean addItem(Item item){
    	return true;
    }
    //untuk menghapus item dari class Item
    public boolean removeItem(Item item){
    	return true;
    }
    
    public Item getItem(){
    	return item;
    }

    public String[] getItemDatabase(){
    	return listItem;
    }
}
