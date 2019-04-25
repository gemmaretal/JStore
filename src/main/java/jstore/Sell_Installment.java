package jstore;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive;
    
    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(ArrayList<Integer> item,int installmentPeriod, Customer customer)
    {
        super(item);        
       this.installmentPeriod = installmentPeriod;
       this.customer = customer;
       this.isActive = true;
    }

    public int getInstallmentPeriod(){
        return installmentPeriod;
    }
    
    public int getInstallmentPrice(){
        return installmentPrice;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    public void setInstallmentPrice(){
        this.installmentPrice = (getTotalPrice() / installmentPeriod) * 102 / 100 ;
    }
    
    //public void setTotalPrice(){
        // totalPrice=installmentPrice * installmentPeriod;
    //}
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat ("dd MMM yyyy");
        setTotalPrice(0);
        setInstallmentPrice();

        for (int bar : this.getItem()){
            System.out.println(DatabaseItem.getItemFromID(bar).toString()); 
        }
        
        return "====Sell Installment=== \nID= "+this.getId()+
        // "\nItem= "+this.getItem().getId()+
//        "\nAmount "+this.getTotalItem()+
        "\nBuy Date: "+sdf.format(this.getDate().getTime())+
        // "\nPrice= "+this.getItem().getPrice()+
        "\nPrice Total: "+this.getTotalPrice()+
        "\nInstallment price: "+this.getInstallmentPrice()+
        // "\nSupplier Id: "+this.getItem().getSupplier().getId()+
        // "\nSupplier Name= "+ this.getItem().getSupplier().getName() +
        "\nCustomer ID= "+ this.getCustomer().getId() +
        "\nCustomer Name= "+ this.getCustomer().getName() +
        "\nStatus: " + InvoiceStatus.Installment +
        "\nSell Success\n";        
    }
}
