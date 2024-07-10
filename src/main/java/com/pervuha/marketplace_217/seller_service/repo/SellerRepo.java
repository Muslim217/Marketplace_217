package com.pervuha.marketplace_217.seller_service.repo;

import com.pervuha.marketplace_217.seller_service.entity.Seller;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface SellerRepo extends JpaRepository<Seller, Id> {
}
