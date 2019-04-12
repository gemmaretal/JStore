
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author GemmaRetalAnanda
 * @version 1.6
 */

import java.util.*;
import java.util.ArrayList;
public class DatabaseInvoice
{
    private Invoice[] listinvoice;
    private Invoice invoice;
    //variabel yang dipakai
    private static ArrayList<Invoice> INVOICE_DATABASE;
    private static final int LAST_INVOICE_ID =0;
    
       
    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public static int getLastInvoiceID(){
         return LAST_INVOICE_ID;
    }

    public static boolean addInvoice(Invoice invoice){
       if (INVOICE_DATABASE.add(invoice)){
            return true;
        }
        else {
            return false;
        }
    } 
    
    public static Invoice getInvoice(int id)
    {
        Invoice value=null;
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getId()==id)
            {
                value=invoice;
            }
        }
        return value;
    }

    public static Invoice getActiveOrderCustomer(Customer customer)
    {
        Invoice value=null;
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if((invoice.getInvoiceStatus()==InvoiceStatus.Installment||invoice.getInvoiceStatus()==InvoiceStatus.Paid)&&invoice.getIsActive()==true)
            {
                value=invoice;
            }  
        }
        return value;
    }
    
  
    public static boolean removeInvoice(int id)
    {
        boolean value=false;
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getId()==id&&invoice.getIsActive()==true)
            {
                invoice.setIsActive(false);
                INVOICE_DATABASE.remove(id);
                value=true;
            }
        }
        return value;
    }
}