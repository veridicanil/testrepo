package com.customer.info.dao.entity;

import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<CustomerModel,Long> {
}
