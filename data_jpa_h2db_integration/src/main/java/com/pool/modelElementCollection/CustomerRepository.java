package com.comrade.modelElementCollection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> ,CustomCustomerRepository{

}
