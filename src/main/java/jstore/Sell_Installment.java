package jstore;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Sell_Installment extends Invoice
{
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive;
    
    
    public Sell_Installment(ArrayList<Integer> item, int installmentPeriod, Customer customer)
    {
        super(item);
        this.installmentPeriod=installmentPeriod;
        this.customer=customer;
        setIsActive(true);
        int total =0;
        for (int id: item)
        {
            Item temp = DatabaseItem.getItemFromID(id);
            int priceTemp = 0;
            if(temp!= null){
                priceTemp = temp.getPrice();
            }
            total  += priceTemp;
        }
        this.setInstallmentPrice(total);
        super.setTotalPrice(total);
        //this.isActive = true;
    }
    
    public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }
    
    public int getInstallmentPrice()
    {
        return installmentPrice;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public void setInstallmentPrice(int total)
    {
       double result;
       result= (total/installmentPeriod * 1.02);
       this.installmentPrice=(int) result;
    }
    
    public void setTotalPrice()
    {
     }
        
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    
    
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat ("dd MMMMM yyyy");
       setTotalPrice(0);
       setInstallmentPrice(0);
      for (int temp1 : this.getItem())
       {
           System.out.println(DatabaseItem.getItemFromID(temp1).toString());
       }

	 return	"========INVOICE========" +
	 	"\nID: " +  getId() + 
		"\nBuy date: " + sdf.format(getDate()) +
		"\nTotal price: " + getTotalPrice() +
		"\nInstallment price: " + installmentPrice +
		"\nCustomer ID: " + customer.getId() +
		"\nCustomer Name: " + customer.getName() +
		"\nStatus: " + InvoiceStatus.Installment + 
		"\nInstallment period: " + installmentPeriod +
		"\nSell Success\n";
    }
}
