package jstore;
import java.util.*;
/**
 * Invoice here.
 *
 * @author Gemma Retal Ananda
 * @version 1.6
 */

public abstract class Invoice
{
    // deklarasi tipe data variabel instance
    private int id;
    private ArrayList<Integer> item = new ArrayList<Integer>();
    private Calendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;
    
    private InvoiceStatus status;
    private InvoiceType type;
    
    /**
     * Constructor untuk objek class invoice
     * @param id parameter pertama untuk inisiasi id invoice 
     * @param item parameter pertama untuk inisiasi objek item pada invoice 
     * @param date parameter pertama untuk inisiasi tanggal invoice 
     * @param totalPrice parameter pertama untuk inisiasi total harga invoice 
     */
    public Invoice(ArrayList<Integer> item)
    {
        // initialise instance variables
        this.id = DatabaseInvoice.getLastInvoiceID() + 1;
        this.item = item;
        this.date = Calendar.getInstance();  
    }

    /**
     * Metode accessor id
     *
     * @param  tidak ada
     * @return id mengembalikan nilai id invoice
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Metode accessor objek item
     *
     * @param  tidak ada
     * @return item mengembalikan objek item pada invoice
     */
    public ArrayList<Integer> getItem()
    {
        return item;
    }
    
    /**
     * Metode accessor date
     *
     * @param  tidak ada
     * @return tanggal mengembalikan tanggal pembuatan invoice
     */
    public Calendar getDate()
    {
        return date;
    }
    
    /**
     * Metode accessor totalPrice
     *
     * @param  tidak ada
     * @return totalPrice mengembalikan nilai total harga invoice
     */
    public int getTotalPrice()
    {
    	return totalPrice;
    }
    
    public boolean getIsActive(){
        return isActive;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public abstract InvoiceStatus getInvoiceStatus();
    
    public abstract InvoiceType getInvoiceType();
    
    /**
     * Metode mutator id
     *
     * @param  id parameter untuk mengganti nilai id objek invoice
     * @return tidak ada
     */
    public void setId (int id)
    {
        this.id = id;
    }
    
    /**
     * Metode mutator item
     *
     * @param  item parameter untuk mengganti objek item pada objek invoice
     * @return tidak ada
     */
    public void setItem (ArrayList<Integer> item)
    {
        this.item = item;
    }
    
    public void setCustomer (Customer customer){
        this.customer = customer;
    }
    
    public void setIsActive(boolean isActive){
        this.isActive = isActive; 
    }
    
    /**
     * Metode mutator date
     *
     * @param  date parameter untuk mengganti tanggal objek invoice
     * @return tidak ada
     */
    public void setDate (Calendar date)
    {
        this.date = date;
    }
    
    /**
     * Metode mutator totalPrice
     *
     * @param  totalPrice parameter untuk mengganti total harga objek invoice
     * @return tidak ada
     */
    public void setTotalPrice (int totalPrice)
    {
        for (int temp : item) {
            this.totalPrice = this.totalPrice + DatabaseItem.getItemFromID(temp).getPrice();            
        }
    }
       
//    public abstract void setInvoiceStatus (InvoiceStatus status);
    public void setInvoiceStatus (InvoiceStatus status){
        this.status = status;
    }
    
    public abstract String toString();
}
