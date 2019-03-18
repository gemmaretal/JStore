package Band;


/**
 * Enumeration class StatusAnggota - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum StatusAnggota
{
    Active("Active"), InActive("InActive"), Out("Out");
    
    public String toString()
    {
        return description;
    }
    
    private String description;
    
    StatusAnggota(String description)
    {
        this.description=description;
    } 
}

