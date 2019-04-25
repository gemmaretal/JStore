package jstore;
/**
 * Supplier
 *
 * @author Gemma Retal Ananda
 * @version 1.6
 */
public class Supplier{

    private int id;
    private String name;
    private String email;
    private String phoneNumber; 
    private Location location;

    public Supplier(String name, String email, String phoneNumber, Location location)
    {
        
        setId(DatabaseSupplier.getLastSupplierId()+1);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public Location getLocation(){
        return location;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public void setName(String name){
        this.name=name;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public void setLocation(Location location){
        this.location=location;
    }

    public String toString(){
        return "========SUPPLIER=========\nId: "+id+"\nnama: "+name+"\nemail: "+email+"\nnomor telepon: "+phoneNumber+"\nlokasi: "+location.getCity()+", "+location.getProvince();
    }
    
}
