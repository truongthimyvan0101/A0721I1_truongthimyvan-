package com.codegym.case_study_java_web.service;

import com.codegym.case_study_java_web.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    void saveCustomer(Customer customer);

    void deleteCustomer(Long id);

    Customer findCustomerById(Long id);


    Page<Customer> findAllByNameContaining(String name, Pageable pageable);

    void save(Customer customer);
}
