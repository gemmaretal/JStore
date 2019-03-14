
/**
 * Write a description of class Transaction here.
 *
 * @author GemmaRetalAnanda
 * @version  1.3
* */
public class Transaction
{
    public static void orderNewItem(Supplier supplier){
        ItemCategory category = ItemCategory.Electronics;
        ItemStatus status = ItemStatus.New;
        Item barang = new Item(5, "PS9", 9, 15000, category, status, supplier);
        DatabaseItem.addItem(barang);
        InvoiceStatus status1 = InvoiceStatus.Paid;
        Invoice pesan = new Invoice(9, barang, "14 Maret 2019", barang.getPrice(), status1);
        barang.setStatus(status);
        pesan.setStatus(status1);
        pesan.printData();
        barang.printData();
    }

    public static void orderSecondItem (Supplier supplier){
        ItemCategory category = ItemCategory.Electronics;
        ItemStatus status = ItemStatus.Second;
        Item barang = new Item(6, "SamsungS10", 10, 99000, category, status, supplier);
        DatabaseItem.addItem(barang);
        InvoiceStatus status1 = InvoiceStatus.Paid;
        Invoice pesan1 = new Invoice(10, barang, "14 Maret 2019", barang.getPrice(), status1);
        barang.setStatus(status);
        pesan1.setStatus(status1);
        pesan1.printData();
        barang.printData();
    }
    
    public static void orderRefurbishedItem(Supplier supplier){
        ItemCategory category = ItemCategory.Electronics;
        ItemStatus status = ItemStatus.Refurbished;
        Item barang = new Item(7, "IphoneXS", 5, 90000, category, status, supplier);
        DatabaseItem.addItem(barang);
        InvoiceStatus status1 = InvoiceStatus.Paid;
        Invoice pesan2 = new Invoice(11, barang, "14 Maret 2019", barang.getPrice(), status1);
        barang.setStatus(status);
        pesan2.setStatus(status1);
        pesan2.printData();
        barang.printData();
    }
    
    public static void sellItemPaid(Item item){
        InvoiceStatus statusInvoice2 = InvoiceStatus.Paid;
        ItemStatus statusItem2 = ItemStatus.Sold;
        Invoice pesan2 = new Invoice(2, item, "14 Maret 2019", item.getPrice(), statusInvoice2);
        pesan2.setStatus(statusInvoice2);
        item.setStatus(statusItem2);
        pesan2.printData();
        item.printData();
    }
    public static void sellItemUnpaid(Item item){
        InvoiceStatus statusInvoice3 = InvoiceStatus.Unpaid;
        ItemStatus statusItem3 = ItemStatus.Sold;
        Invoice pesan3 = new Invoice(3, item, "14 Maret 2019", item.getPrice(), statusInvoice3);
        pesan3.setStatus(statusInvoice3);
        item.setStatus(statusItem3);
        pesan3.printData();
        item.printData();
    }
    public static void sellItemInstallment(Item item){
        InvoiceStatus statusInvoice4 = InvoiceStatus.Installment;
        ItemStatus statusItem4 = ItemStatus.Sold;
        Invoice pesan4 = new Invoice(4, item, "14 Maret 2019", item.getPrice(), statusInvoice4);
        pesan4.setStatus(statusInvoice4);
        item.setStatus(statusItem4);
        pesan4.printData();
        item.printData();
    }
}