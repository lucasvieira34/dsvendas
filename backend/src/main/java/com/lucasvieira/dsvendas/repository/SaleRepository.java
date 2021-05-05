package com.lucasvieira.dsvendas.repository;

import com.lucasvieira.dsvendas.domain.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
}
