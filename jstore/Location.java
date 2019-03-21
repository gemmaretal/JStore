
/**
 * Location
 *
 * @author Gemma Retal Ananda
 * @version 1.3
 */
public class Location

{
    protected String province;
    protected static String city;
    protected String description;

    public Location(String province, String description, String city){
        this.province=province;
        this.city=city;
        this.description=description;
    }

    public String getProvince()
    {
        return province;
    }
    
    public static String getCity()
    {
        return city;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setProvince(String province)
    {
        this.province=province;
    }
    
    public void setCity(String city)
    {
        this.city=city;
    }
    
    public void setDescription(String description)
    {
        this.description=description;
    }
    
    public void printData()
    {
       System.out.println("==========LOCATION=======");
       System.out.println("Provinsi :" + province);
       System.out.println("Kota :" + city);
       System.out.println("Deksripsi :" + description);
    }
    
}