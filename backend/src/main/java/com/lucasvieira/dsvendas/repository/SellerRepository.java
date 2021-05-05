package com.lucasvieira.dsvendas.repository;

import com.lucasvieira.dsvendas.domain.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {
}
