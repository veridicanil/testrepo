package com.customer.info.service;

import com.customer.info.modals.Customer;
import com.customer.info.dao.entity.CustomerModel;
import com.customer.info.dao.entity.CustomerRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class customerservice {

    @Autowired 
    CustomerRepository customerRepository;

    public Customer createCustomer(final Customer customer) {
        Customer customerData = new Customer();
        try {
            CustomerModel customerModel = new CustomerModel();
            BeanUtils.copyProperties(customer, customerModel);
            customerModel = customerRepository.save(customerModel);
            BeanUtils.copyProperties(customerModel, customerData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return customerData;
    }

    public Customer updateCustomer(final Customer customer) {
        Customer customerData = new Customer();
        try {
            CustomerModel customerModel = new CustomerModel();
            BeanUtils.copyProperties(customer, customerModel);
            customerModel = customerRepository.save(customerModel);
            BeanUtils.copyProperties(customerModel, customerData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return customerData;
    }

    public List<Customer> getCustomers() {
        List<CustomerModel> customers = new ArrayList<>();
        List<Customer> customerList = new ArrayList<>();
        try {
            customerRepository.findAll().forEach(customers::add);
            for (CustomerModel customerModel : customers) {
                Customer customer = new Customer();
                BeanUtils.copyProperties(customerModel, customer);
                customerList.add(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public Customer getCustomer(Long id) {

        Optional<CustomerModel> customer = customerRepository.findById(id);
        Customer customerData = new Customer();
        BeanUtils.copyProperties(customer.get(), customerData);
        return customerData;
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
