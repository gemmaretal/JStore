package jstore.controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ItemController {

    @RequestMapping("/items")
    public ArrayList<Item> itemList() {
        ArrayList<Item> Items = DatabaseItem.getItemDatabase();
        return Items;
    }

    @RequestMapping("/items/{id_item}")
    public Item getItem(@PathVariable int id_item) {
        Item item = DatabaseItem.getItemFromID(id_item);
        return item;
    }


}