package com.food.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.OrderItem;
import com.food.repository.OrderItemRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;

    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    public List<OrderItem> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    public Optional<OrderItem> getOrderItemById(Long id) {
        return orderItemRepository.findById(id);
    }

    public OrderItem updateOrderItem(Long id, OrderItem orderItemDetails) {
        return orderItemRepository.findById(id)
                .map(orderItem -> {
                    orderItem.setPrice(orderItemDetails.getPrice());
                    orderItem.setMrp(orderItemDetails.getMrp());
                    orderItem.setDiscount(orderItemDetails.getDiscount());
                    orderItem.setQuantity(orderItemDetails.getQuantity());
                    orderItem.setTotalAmount(orderItemDetails.getTotalAmount());
                    orderItem.setActive(orderItemDetails.getActive());
                    // No need to explicitly set 'order' as it's managed by the other side of the relationship
                    return orderItemRepository.save(orderItem);
                }).orElseGet(() -> {
                    orderItemDetails.setOrderitemId(id);
                    return orderItemRepository.save(orderItemDetails);
                });
    }

    public void deleteOrderItem(Long id) {
        orderItemRepository.deleteById(id);
    }
}

