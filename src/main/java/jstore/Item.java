package jstore;

public class Item
{
    private int id;
    private String name;
    // private int stock;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;
    
    public Item(String name, int price, ItemCategory category, ItemStatus status, Supplier supplier)
    {
        this.id = DatabaseItem.getLastItemID()+1;
        this.name=name;
        this.status=status;
        this.price=price;
        this.supplier=supplier;
        this.category=category;
    }

    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }

    public int getPrice()
    {
        return price;
    }
    
    public ItemCategory getCategory()
    {
        return category;
    }
    
    public ItemStatus getStatus()
    {
        return status;
    }
    
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    public void setId(int id)
    {
        this.id=id;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }

    public void setPrice(int price)
    {
        this.price=price;
    }
    
    public void setCategory(ItemCategory category)
    {
        this.category=category;
    }
    
    public void setStatus(ItemStatus status)
    {
        this.status=status;
    }
    
    public void setSupplier(Supplier supplier)
    {
        this.supplier = supplier;
    }
    
    public String toString(){
        return	"Item: {" +
				"ID: " + id +
				", Name: " + name +
				", Category: " + category +
				", Status: " + status +
				", Supplier: " + supplier.getName()+ "}\n";
    }
}
