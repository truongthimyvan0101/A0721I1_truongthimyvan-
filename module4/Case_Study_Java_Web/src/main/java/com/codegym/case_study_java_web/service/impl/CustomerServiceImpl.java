package com.codegym.case_study_java_web.service.impl;

import com.codegym.case_study_java_web.Repository.CustomerRepository;
import com.codegym.case_study_java_web.model.Customer;
import com.codegym.case_study_java_web.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
   private CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable)
    {
        return customerRepository.findAll(pageable);
    }

    @Override
    public void saveCustomer(Customer customer) {
customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id) {

    }

    @Override
    public Customer findCustomerById(Long id) {
        return null;
    }

    @Override
    public Page<Customer> findAllByNameContaining(String name, Pageable pageable) {
        return customerRepository.findAllByNameContaining(name, pageable);
    }

    @Override
    public void save(Customer customer) {

    }
}