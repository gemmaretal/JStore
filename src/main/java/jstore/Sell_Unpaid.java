package jstore;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Sell_Unpaid extends Invoice
{
    private static final InvoiceType INVOICE_TYPE= InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS= InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private boolean isActive;
    
 
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
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
            total  +=priceTemp;
        }
        super.setTotalPrice(total);
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public Calendar getDueDate(){
        return dueDate;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    
    public void setDueDate(Calendar dueDate)
    {
        this.dueDate=dueDate;
    }
    
    
    public String toString()
    {
       setTotalPrice(0);
       for (int temp1 : this.getItem())
       {
           System.out.println(DatabaseItem.getItemFromID(temp1).toString());
       }

       SimpleDateFormat sdf = new SimpleDateFormat ("dd MMMMM yyyy");

	 return "========INVOICE========" +
		"\nID: " +  getId() + 
		"\nBuy date: " + sdf.format(getDate()) +
		"\nTotal price: " + getTotalPrice() +
		"\nCustomer ID: " + customer.getId() +
		"\nCustomer Name: " + customer.getName() +
		"\nStatus: " + InvoiceStatus.Unpaid + 
		"\nSell Success\n";
	}
}