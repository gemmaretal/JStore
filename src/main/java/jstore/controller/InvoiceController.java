package jstore.controller;
import jstore.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class InvoiceController{

    @RequestMapping("/invoicecustomer/{id_customer}")
    public ArrayList<Invoice> invoiceCust(@PathVariable int id_customer) {
        ArrayList<Invoice> invoice = null;
        try {
            invoice = DatabaseInvoice.getActiveOrder(DatabaseCustomer.getCustomer(id_customer));
            return invoice;
        } catch (CustomerDoesntHaveActiveException e) {
            System.out.println(e.getExMessage());
        }
        return null;
    }

    @RequestMapping("/invoice/{id_invoice}")
    public Invoice getInvoice(@PathVariable int id_invoice) {
        Invoice invoice= DatabaseInvoice.getInvoice(id_invoice);
        return invoice;
    }

    @RequestMapping(value = "/createinvoicepaid",method = RequestMethod.POST)
    public Invoice createInvoicePaid(@RequestParam (value = "listitem") ArrayList<Integer> listItem,
                                     @RequestParam (value = "id") int id_customer){
        try {
            boolean res = DatabaseInvoice.addInvoice(new Sell_Paid(listItem, DatabaseCustomer.getCustomer(id_customer)));
            if (res == true){
                return DatabaseInvoice.getInvoice(DatabaseInvoice.getLastInvoiceID());
            }
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        return null;
    }

    @RequestMapping(value = "/createinvoiceunpaid",method = RequestMethod.POST)
    public Invoice createInvoiceUnpaid(@RequestParam (value = "listitem") ArrayList<Integer> listItem,
                                       @RequestParam (value = "id") int id_customer){
        try {
            boolean res = DatabaseInvoice.addInvoice(new Sell_Unpaid(listItem, DatabaseCustomer.getCustomer(id_customer)));
            if (res == true){
                return DatabaseInvoice.getInvoice(DatabaseInvoice.getLastInvoiceID());
            }
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        return null;
    }

    @RequestMapping(value = "/createinvoiceinstallment",method = RequestMethod.POST)
    public Invoice createInvoiceInstallment(@RequestParam (value = "listitem") ArrayList<Integer> listItem,
                                            @RequestParam (value = "period") int installment_period,
                                            @RequestParam (value = "id") int id_customer){
        try {
            boolean res = DatabaseInvoice.addInvoice(new Sell_Installment(listItem, installment_period, DatabaseCustomer.getCustomer(id_customer)));
            if (res == true){
                return DatabaseInvoice.getInvoice(DatabaseInvoice.getLastInvoiceID());
            }
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        return null;
    }

    @RequestMapping(value = "/canceltranscation",method = RequestMethod.POST)
    public Invoice cancelTransaction(@RequestParam(value = "id") int id_invoice ){
        Invoice tempinv = DatabaseInvoice.getInvoice(id_invoice);
        boolean res = Transaction.cancelTransaction(tempinv);
        if (res == true){
            System.out.println("Invoice ini Telah Dibatalkan");
            return tempinv;
        }
        return null;
    }

    @RequestMapping(value = "/finistransaction", method = RequestMethod.POST)
    public Invoice finishTransaction(@RequestParam(value = "id") int id_invoice ){
        Invoice tempinv = DatabaseInvoice.getInvoice(id_invoice);
        boolean res = Transaction.finishTransaction(tempinv);
        if (res == true){
            System.out.println("Invoice ini Telah Diselesaikan");
            return tempinv;
        }
        return null;
    }



}