package Laptop;


/**
 * Write a description of class Asus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Asus extends Laptop implements Zenbook
{
    // instance variables - replace the example below with your own
    public int harga;

    /**
     * Constructor for objects of class Asus
     */
    public Asus()
    {
        // initialise instance variables
    }

    public void harga()
    {
        System.out.println("25000");
    }
    
    public void spec()
    {
        System.out.println("mediocore");
    }
    
    public void manufactured()
    {
        System.out.println("manufactured by Asus");
    }
}
