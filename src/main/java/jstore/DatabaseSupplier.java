package jstore;
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

    /**
     * Metode accessor dari list supplier
     * @return listsupplier mengembalikan array supplier
     */
    public static ArrayList<Supplier> getSupplierDatabase()
    {
        return SUPPLIER_DATABASE;
    }

    public static int getLastSupplierId(){
        return LAST_SUPPLIER_ID;
    }

    public static Supplier getSupplier(int id){
        for (Supplier supplier : SUPPLIER_DATABASE){
            if (supplier.getId() == id ){
                return supplier;
            }
        }
        return null;
    }

    /**
     * Metode ini untuk menambah supplier kedalam database supplier
     *
     * @param  supplier parameter untuk menambah data objek supplier
     * @return    true berhasil menambah
     */
    public static Boolean addSupplier(Supplier supplier)
            throws SupplierAlreadyExistsException{
        for (Supplier temp : SUPPLIER_DATABASE ) {
            if(((temp.getEmail() == supplier.getEmail()) && (temp.getPhoneNumber() == supplier.getPhoneNumber()))){
                throw new SupplierAlreadyExistsException(supplier);
//                return false;
            }
        }
        SUPPLIER_DATABASE.add(supplier);
        LAST_SUPPLIER_ID = supplier.getId();
        return true;
    }
    /**
     * Metode ini untuk menghapus supplier dari database supplier
     * @return tidak ada
     */
    public static boolean removeSupplier(int id)
            throws SupplierNotFoundException{
        for(Supplier supplier : SUPPLIER_DATABASE){
            if(supplier.getId() == id){
                SUPPLIER_DATABASE.remove(supplier);
            }
        }
        throw new SupplierNotFoundException(id);
//        return false;
    }

}
