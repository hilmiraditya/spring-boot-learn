package com.belajar.springboot.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer create(Customer customer){
        return this.customerRepository.save(customer);
    }

    public List<Customer> findByName(String name){
        return this.customerRepository.findByName(name);
    }
}
