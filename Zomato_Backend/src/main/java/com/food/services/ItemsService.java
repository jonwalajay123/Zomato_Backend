package com.food.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.Items;
import com.food.repository.ItemsRepository;

import java.util.List;

@Service
public class ItemsService {
    @Autowired
    private ItemsRepository itemsRepository;

    public Items createItem(Items item) {
        return itemsRepository.save(item);
    }

    public List<Items> getAllItems() {
        return itemsRepository.findAll();
    }

    public Items getItemById(Long id) {
        return itemsRepository.findById(id).orElse(null);
    }

    public Items updateItem(Long id, Items itemDetails) {
        return itemsRepository.findById(id)
            .map(item -> {
                item.setItemstName(itemDetails.getItemstName());
                item.setItemsMrp(itemDetails.getItemsMrp());
                item.setDiscount(itemDetails.getDiscount());
                item.setPrice(itemDetails.getPrice());
                item.setActive(itemDetails.getActive());
                item.setStatus(itemDetails.getStatus());
                item.setCuision(itemDetails.getCuision());
                item.setDescription(itemDetails.getDescription());
                item.setRestaurant(itemDetails.getRestaurant());
                return itemsRepository.save(item);
            }).orElse(null);
    }

    public void deleteItem(Long id) {
        itemsRepository.deleteById(id);
    }
}

