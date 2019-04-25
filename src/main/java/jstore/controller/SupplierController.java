package jstore.controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class SupplierController{

    @RequestMapping("/suppliers")
    public ArrayList<Supplier> supplierList() {
        ArrayList<Supplier> suppliers = DatabaseSupplier.getSupplierDatabase();
        return suppliers;
    }

    @RequestMapping("/suppliers/{id_supplier}")
    public Supplier supplier(@PathVariable int id_supplier) {
        Supplier supplier= DatabaseSupplier.getSupplier(id_supplier);
        return supplier;
    }


}