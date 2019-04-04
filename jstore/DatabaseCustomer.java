
/**
 * DatabaseCostumer here.
 *
 * @author Gemma Retal Ananda
 * @version 1.5
 */
public class DatabaseCustomer
{
    // variabel yang digunakan dalam class
    private Invoice[] listCustomer; // inisialisasi variabel
    public static Customer customer;
    
    /**
     * Method of class DatabaseCustomer
     * @return true
     */
    public static boolean addCutomer(Customer customer)
    {
        // return dari accessor 
        return true;
    }

    public static boolean removeCustomer(Customer customer)
    {
        // return dari accessor 
        return true;
    }
    
    
    /**
     * Method of class DatabaseInvoice
     * @return supplier
     */
    public Customer getCustomer()
    {
        // return dari accessor 
        return customer;
    }
    
    /**
     * Method of class DatabaseCustomer
     * @return listCustomer
     */
    public Invoice[] getListCustomer(){
        // return dari accessor 
        return listCustomer;
    }
}