package jstore;
/**
 * Item.
 *
 * @author Gemma Retal Ananda
 * @version (29/02/2019)
 */
public class Item{

    private  int id;
    private String name;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;

    public Item(String name, int stock, ItemStatus status, int price, Supplier supplier, ItemCategory category)
    {
        this.id = DatabaseItem.getLastItemId()+1;
        this.name = name;
        this.status = status;
        this.price = price;
        this.category = category;
        this.supplier = supplier;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    

    public int getPrice(){
        return price;
    }
    
    public ItemCategory getCategory(){
        return category;
    }
    

    public Supplier getSupplier(){
        return supplier;
    }
    
    public ItemStatus getStatus(){
        return status;
    }
    
    
    public void setId(int id){
        this.id=id;
    }
    
    public void setName(String name){
        this.name=name;
    }
    

    public void setPrice(int price){
        this.price=price;
    }

    public void setCategory(ItemCategory category){
        this.category=category;
    }

    public void setSupplier(Supplier supplier){
        this.supplier=supplier;
    }

    public void setStatus(ItemStatus status){
        this.status=status;
    }
    
    public String toString(){
     String data;
       data = "======ITEM=======";
       data += "\nId :"+id;
        data +="\n Name: "+name;
        data +="\nCategory: "+category;
        data +="\nStatus: "+status;
        data +="\nSupplier: "+ getSupplier().getName();
    return data;
    }
}
