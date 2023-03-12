package com.pool.dao;

import com.pool.model.joinformula.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

}
