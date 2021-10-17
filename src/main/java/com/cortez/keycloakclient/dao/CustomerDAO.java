package com.cortez.keycloakclient.dao;

import com.cortez.keycloakclient.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
