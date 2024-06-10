package com.customer.Customaer_Details.repository;

import com.customer.Customaer_Details.customerEntity.Customer;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Page<Customer> findAll(Pageable pageable);
    List<Customer> findByFirstNameContainingOrCityContainingOrEmailContainingOrPhoneContaining(String firstName, String city, String email, String phone);
}

