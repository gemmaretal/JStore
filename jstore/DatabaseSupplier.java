
/**
 * Class DatabaseSupplier
 * Berisi mengenai database Supplier
 * @author Gemma Retal Ananda
 * @version (29/02/2019)
 */
public class DatabaseSupplier
{
    private String[] listSupplier;
    private Supplier supplier;

    public boolean addSupplier(Supplier supplier)
    {
        return true;
    }
    
    public void removeSupplier(Supplier supplier)
    {
        return;
    }
    
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    public String[] getListSupplier()
    {
        return listSupplier;
    }
    
}