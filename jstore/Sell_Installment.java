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
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
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
    
    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }   
    
    public boolean getIsActive(){
        return this.isActive;
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
    
    public void setIntallmentPrice(int totalPrice)
    {
        installmentPrice=(totalPrice/installmentPeriod)*102/100;
    }
    
    public void setTotalPrice()
    {
        setTotalPrice(installmentPrice*installmentPeriod);
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.INVOICE_STATUS=status;
    }
    
    
    public String toString()
    {
       
        SimpleDateFormat sdf = new SimpleDateFormat ("dd MMM yyyy");
        for (int bar : this.getItem()){
            DatabaseItem.getItemFromID(bar).toString();            
        }
        
        return "====Sell Installment=== \nID= "+this.getId()+
        "\nBuy Date: "+sdf.format(this.getDate().getTime())+
        "\nPrice Total: "+this.getTotalPrice()+
        "\nInstallment price: "+this.getInstallmentPrice()+
        "\nCustomer ID= "+ this.getCustomer().getId() +
        "\nCustomer Name= "+ this.getCustomer().getName() +
        "\nStatus: " + InvoiceStatus.Installment +
        "\nSell Success\n";        
    }
}
