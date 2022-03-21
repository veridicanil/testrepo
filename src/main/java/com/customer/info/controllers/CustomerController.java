package com.customer.info.controllers;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import com.customer.info.modals.Customer;
import com.customer.info.service.customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/customers")

public class CustomerController {

    @Autowired
    private customerservice customerService;

    @GetMapping("/get-customers")
    public ResponseEntity<List<Customer>> getCustomers() {
        List<Customer> customers = customerService.getCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping("/get-customer/{customerid}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Long customerid) {
        Customer customer = customerService.getCustomer(customerid);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @PostMapping("/create-customer")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {

        // add current date
        Instant instant = Instant.now();
        Timestamp timestamp = Timestamp.from(instant);
        customer.createddateutc = timestamp;
        customer.isactive = true;

        final Customer customerData = customerService.createCustomer(customer);
        return new ResponseEntity<>(customerData, HttpStatus.CREATED);
    }

    @PostMapping("/update-customer")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {

        // add current date
        Instant instant = Instant.now();
        Timestamp timestamp = Timestamp.from(instant);
        customer.modifieddateutc = timestamp;
        customer.isactive = true;

        final Customer customerData = customerService.createCustomer(customer);
        return new ResponseEntity<>(customerData, HttpStatus.CREATED);
    }
}






















