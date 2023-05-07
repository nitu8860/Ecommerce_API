package com.example.Ecommerce_API.controller;

import com.example.Ecommerce_API.model.Address;
import com.example.Ecommerce_API.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("/{id}")
    public Address getAddress(@PathVariable Integer id) {
        return addressRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressRepository.save(address);
    }
}
