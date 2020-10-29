package com.belajar.springboot.customer;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customers")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public CustomerDTOResponse create(@RequestBody CustomerDTORequest customerDTORequest){
        Customer customer = this.customerService.create(Customer.parse(customerDTORequest));
        return CustomerDTOResponse.parse(customer);   
    }

    @GetMapping("/customers")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<CustomerDTOResponse> findByName(@RequestParam String name){
        List <Customer> customers = this.customerService.findByName(name);
        return customers.stream().map(customer -> CustomerDTOResponse.parse(customer)).collect(Collectors.toList());
    }
}
