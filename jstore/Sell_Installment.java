/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;

    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment (int id, Item item, String date, int totalItem, int totalPrice, int installmentPeriod)
    {
        super(id, item, date, totalItem, totalPrice);
        this.installmentPeriod=installmentPeriod;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }
    
    public int getInstallmentPrice()
    {
        return installmentPrice;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }

    public void setInstallmentPrice(int totalPrice){
        installmentPrice=(totalPrice*(102/100))/installmentPeriod;

    }

    public void setTotalPrice()
    {
        totalPrice=installmentPrice*installmentPeriod;
    }

    public void printData()
    {
         System.out.println("==========INVOICE=======");
        System.out.println("ID :" + getid());
        System.out.println("Date :" + getdate());
        System.out.println("Item yang terdapat :" + getitem().getName());
        System.out.println("Total harga :" + gettotalPrice());
        System.out.println("Status :" + INVOICE_STATUS);
        System.out.println("Installment Price :" + installmentPrice);
    }
}