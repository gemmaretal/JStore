package jstore;

public enum InvoiceStatus
{
    Paid("Paid"), Unpaid("Unpaid"), Installment("Installment");
    private String value;
    
    public String toString()
    {
        return value;
    }
    
    private InvoiceStatus(String value)
    {
        this.value=value;
    }
}
