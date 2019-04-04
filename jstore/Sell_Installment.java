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
    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(int id, Item item, int totalItem, int installmentPeriod, Customer customer)
    {
        super(id, item, totalItem);
        this.installmentPeriod = installmentPeriod;
        this.customer = customer;
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
        installmentPrice = (totalPrice / installmentPeriod) * 102 / 100 ;
    }
    
    public void setTotalPrice(){
        totalPrice = installmentPrice * installmentPeriod;
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.INVOICE_STATUS=status;
    }
    
    public String toString(){
       return ""; 
    }
}