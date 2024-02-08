package com.food.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.Order;
import com.food.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public Order updateOrder(Long id, Order orderDetails) {
        return orderRepository.findById(id)
                .map(order -> {
                    order.setOrderStatus(orderDetails.getOrderStatus());
                    order.setOrderAmount(orderDetails.getOrderAmount());
                    order.setOrderDiscount(orderDetails.getOrderDiscount());
                    order.setTax(orderDetails.getTax());
                    order.setDistance(orderDetails.getDistance());
                    order.setActive(orderDetails.getActive());
                    order.setGenerate(orderDetails.getGenerate());
                    order.setUpdatedAt(orderDetails.getUpdatedAt());
                    order.getOrderitem().clear();
                    order.getOrderitem().addAll(orderDetails.getOrderitem());
                    order.getOrderitem().forEach(item -> item.setOrder(order));
                    return orderRepository.save(order);
                }).orElseGet(() -> orderRepository.save(orderDetails));
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}

