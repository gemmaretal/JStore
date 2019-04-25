
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
package jstore;
import jstore.InvoiceType;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;

public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private boolean isActive;
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(ArrayList<Integer> item)
    {
        super(item);
        this.isActive = false;
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    /*
    public void setInvoiceStatus (InvoiceStatus status){
        INVOICE_STATUS = status;
    }
    */
    public String toString(){
        setTotalPrice(0);
        SimpleDateFormat sdf = new SimpleDateFormat ("dd MMM yyyy");
        return "===BuyPaid====\n ID= "+this.getId()+
        "\nBuy Date: "+sdf.format(this.getDate().getTime())+
        "\nPrice Total: "+this.getTotalPrice()+
        "\nStatus: " + InvoiceStatus.Paid +
        "\nSell Success\n";
    }
}
