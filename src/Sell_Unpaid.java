/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.text.*;

public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private boolean isActive;
    
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer = customer;
        this.dueDate = Calendar.getInstance();
        this.dueDate.add(Calendar.DATE,+1);
        this.isActive = true;
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
    
    public void setCustomer(Customer customer){

    }
    public void setDueDate(Calendar dueDate){

    }

    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat ("dd MMM yyyy");
        setTotalPrice(0);
        for (int bar : this.getItem()){
            System.out.println(DatabaseItem.getItemFromID(bar).toString()); 
             }
        
        return "====Sell Unpaid=== \nID= "+this.getId()+
        // "\nItem= "+this.getItem().getId()+
//        "\nAmount "+this.getTotalItem()+
        "\nBuy Date: "+sdf.format(this.getDate().getTime())+
        // "\nPrice= "+this.getItem().getPrice()+
        "\nPrice Total: "+this.getTotalPrice()+
        // "\nSupplier Id: "+this.getItem().getSupplier().getId()+
        // "\nSupplier Name= "+ this.getItem().getSupplier().getName() +
        "\nCustomer ID= "+ this.getCustomer().getId() +
        "\nCustomer Name= "+ this.getCustomer().getName() +
        "\nStatus: " + InvoiceStatus.Unpaid +
        "\nDue date: " + sdf.format(this.getDueDate().getTime())+
        "\nIf payment is not received by dueDate, transaction will be cancelled\n";        
    }
}
