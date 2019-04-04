
/**
 * Enumeration class ItemStatus 
 *
 * @author GemmaRetalAnanda
 * @version 1.3
 */
public enum ItemStatus
{
    New("New"), Second("Second"), Refurbished("Refurbished"), Sold("Sold");
    private String value;
       
    public String toString()
    {
        return value;
    }
    
    private ItemStatus(String value)
    {
        this.value=value;
    }
}