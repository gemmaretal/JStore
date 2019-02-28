
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
    
    public boolean addItem(Item item){
    	return true;
    }
    
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