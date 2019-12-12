package com.microservice.stock.company.dao;

import com.microservice.stock.company.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {

    @Query(value = "SELECT c FROM CompanyEntity c WHERE c.companyName LIKE CONCAT('%',:companyName,'%') ")
    List<CompanyEntity> findCompanyNameLike(String companyName);
}
