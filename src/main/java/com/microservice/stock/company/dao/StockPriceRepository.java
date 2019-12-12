package com.microservice.stock.company.dao;

import com.microservice.stock.company.entity.StockPriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Long> {

    List<StockPriceEntity> findByCompanyCode(String companyCode);
}
