package jstore;

public enum ItemCategory
{
    Electronics("Electronics"), Furniture("Furniture"), Stationery("Stationery");
    private String value;
    
    public String toString()
    {
        return value;
    }
    
    private ItemCategory(String value)
    {
        this.value=value;
    }
}
