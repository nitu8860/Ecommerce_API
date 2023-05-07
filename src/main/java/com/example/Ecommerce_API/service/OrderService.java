package com.example.Ecommerce_API.service;

import com.example.Ecommerce_API.model.Address;
import com.example.Ecommerce_API.model.Order;
import com.example.Ecommerce_API.model.Product;
import com.example.Ecommerce_API.model.User;
import com.example.Ecommerce_API.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Autowired
    private AddressService addressService;

    public Order createOrder(Order order) {
        User user = userService.getUser(order.getUser().getId());
        Product product = productService.getProduct(order.getProduct().getId());
        Address address = addressService.getAddress(order.getAddress().getId());

        if (user == null || product == null || address == null) {
            throw new RuntimeException("Invalid user, product, or address ID.");
        }

        order.setProduct(product);
        order.setUser(user);
        order.setAddress(address);

        return orderRepository.save(order);
    }

    public Order getOrder(Integer id) {
        return orderRepository.findById(id).orElse(null);
    }
}