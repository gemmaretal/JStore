import java.util.ArrayList;
/**
 * DatabaseCostumer here.
 *
 * @author Gemma Retal Ananda
 * @version 1.6
 */

public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    
    public DatabaseCustomer()
    {    
    }
    
    public static int getLastCustomerID(){
       return LAST_CUSTOMER_ID;
    }
    
    public static ArrayList<Customer> getCustomerDatabase(){
       return CUSTOMER_DATABASE;
    }
    
    public static Customer getCustomer(int id)
    {
        Customer value=null;
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId()==id)
            {
                value=customerDB;
            }
        }
        return value;
    }
    
     /**
     * method ini digunakan untuk menambah costumer kedalam database
     *
     * @return boolean true
     */
    public static boolean addCustomer(Customer customer)
    {
        boolean value=false;
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customer.getName()!=customerDB.getName()&&customer.getEmail()!=customerDB.getEmail())
            {
            CUSTOMER_DATABASE.add(customer);
            LAST_CUSTOMER_ID=customer.getId();
            value=true;
            }
        }
        return value;
    }
    
    /**
     * method ini digunakan untuk menghapus costumer kedalam database
     *
     * @return boolean true
     */
    public static boolean removeCustomer(int id)
    {
        boolean value=false;
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId()==id)
            {
                CUSTOMER_DATABASE.remove(id);
                value=true;
            }
        }
        return value;
   }    
}