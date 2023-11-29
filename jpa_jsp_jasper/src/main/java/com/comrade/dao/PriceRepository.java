package com.comrade.dao;

import com.comrade.model.joinformula.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

}
