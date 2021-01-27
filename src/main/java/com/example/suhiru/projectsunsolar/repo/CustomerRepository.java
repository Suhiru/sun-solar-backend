package com.example.suhiru.projectsunsolar.repo;


import com.example.suhiru.projectsunsolar.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}

//interface that communicates with the customer details table