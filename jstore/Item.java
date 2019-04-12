
/**
 * Item.
 *
 * @author Gemma Retal Ananda
 * @version (29/02/2019)
 */
public class Item{

    private int id;
    private String name;
    private int stock;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;

    public Item(String name, int stock, ItemStatus status, int price, Supplier supplier, ItemCategory category)
    {
        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.name = name;
        this.stock = stock;
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
    
    public int getStock(){
        return stock;
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
    
    public void setStock(int stock){
        this.stock=stock;
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
        return "======ITEM=======\nId: "+id+"\nName: "+name+"\nStock: "+stock+"\nCategory: "+category+"\nStatus: "+status+"\nSupplier: "+supplier.getName();
    }
}
