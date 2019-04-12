
/**
 * Enumeration class ItemStatus 
 *
 * @author GemmaRetalAnanda
 * @version 1.3
 */
public enum ItemStatus
{
    New("New"),
    Second("Second"),
    Refurbished("Refurbished"),
    Sold("Sold");
    
    private String is;
    
    ItemStatus (String s){
        is = s;
    }
    
    public String toString(){
        return is;
    }
}