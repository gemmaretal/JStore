
/**
 * Class DatabaseSupplier
 * Berisi mengenai database Supplier
 * @author Gemma Retal Ananda
 * @version (29/02/2019)
 */

import java.util.*;
public class DatabaseSupplier
{
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID = 0;

    /**
     * Constructor untuk objek dari class DatabaseSupplier
     */
    public DatabaseSupplier()
    {   
    }
    
    public static ArrayList<Supplier> getSupplierDatabase()
    {
        return SUPPLIER_DATABASE;
    }
    
    /**
     * Metode ini untuk menambah supplier kedalam database supplier
     *
     * @param  supplier parameter untuk menambah data objek supplier
     * @return true berhasil menambah
     */
    public static Boolean addSupplier(Supplier supplier){
        for (Supplier temp : SUPPLIER_DATABASE ) {
            if(((temp.getName() == supplier.getName()) && (temp.getEmail() == supplier.getEmail()) &&
             (temp.getPhoneNumber() == supplier.getPhoneNumber()))){
                return false;
            }
        }
        SUPPLIER_DATABASE.add(supplier);
        return true;
    }
    
    /**
     * Metode ini untuk menghapus supplier dari database supplier
     * @return 
     */
    public static boolean removeSupplier(int id){
        for(Supplier supplier : SUPPLIER_DATABASE){
            if(supplier.getId() == id){
                SUPPLIER_DATABASE.remove(supplier);
            }
        }
        return false;        
    }
    
    public Supplier getSupplier(int id)
    {
        for (Supplier supplier : SUPPLIER_DATABASE){
            if (supplier.getId() == id ) {
                return supplier;
            }
        }
        return null;
    }
    
    public static int getListSupplier()
    {
         return LAST_SUPPLIER_ID;
    }
    
}