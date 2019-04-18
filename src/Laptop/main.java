package Laptop;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    // instance variables - replace the example below with your own
    
    public main()
    {
        // initialise instance variables
     
    }

    
     public static void main(String[]args)
    {
        Laptop laptop = new Laptop();
        Laptop laptop1 = new Asus();
        Asus asus = new Asus();
        
        System.out.println(laptop.harga);
        System.out.println(laptop1.harga);
        System.out.println(asus.harga);
        
        
        
    }
}
