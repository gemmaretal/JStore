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

    /**
     * Constructor for objects of class DatabaseCustomer
     */
    public DatabaseCustomer()
    {
        // initialise instance variables
    }

    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID(){
        return LAST_CUSTOMER_ID;
    }

    public static boolean addCustomer(Customer customer)
            throws CustomerAlreadyExistsException{
        for (Customer temp : CUSTOMER_DATABASE ) {
            if(((temp.getUsername() == customer.getUsername()) && (temp.getEmail() == customer.getEmail()))) {
                throw new CustomerAlreadyExistsException(customer);
//                return false;
            }
        }
        CUSTOMER_DATABASE.add(customer);
        LAST_CUSTOMER_ID = customer.getId();
        return true;
    }

    public static Customer getCustomer(int id){
        for (Customer customer : CUSTOMER_DATABASE){
            if (customer.getId() == id ){
                return customer;
            }
        }
        return null;
    }

    public static boolean removeCustomer(int id)
            throws CustomerNotFoundException{
        for (Customer customer : CUSTOMER_DATABASE){
            if (customer.getId() == id ){
                CUSTOMER_DATABASE.remove(customer);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
//        return false;
    }

}