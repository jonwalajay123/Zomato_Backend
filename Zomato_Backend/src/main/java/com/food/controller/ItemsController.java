package com.food.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.food.Items;
import com.food.services.ItemsService;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @PostMapping
    public Items createItem(@RequestBody Items item) {
        return itemsService.createItem(item);
    }

    @GetMapping
    public List<Items> getAllItems() {
        return itemsService.getAllItems();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Items> getItemById(@PathVariable Long id) {
        Items item = itemsService.getItemById(id);
        if (item != null) {
            return ResponseEntity.ok(item);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Items> updateItem(@PathVariable Long id, @RequestBody Items itemDetails) {
        Items updatedItem = itemsService.updateItem(id, itemDetails);
        if (updatedItem != null) {
            return ResponseEntity.ok(updatedItem);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        itemsService.deleteItem(id);
        return ResponseEntity.ok().build();
    }
}

