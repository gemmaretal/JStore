package jstore;

public enum InvoiceType
{
    Buy("Buy"), Sell("Sell");
    private String value;
    
    private InvoiceType(String value)
    {
        this.value=value;
    }
    
    public String toString()
    {
        return value;
    }
    

}
