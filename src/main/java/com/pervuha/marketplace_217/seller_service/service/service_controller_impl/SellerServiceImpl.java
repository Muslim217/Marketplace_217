package com.pervuha.marketplace_217.seller_service.service.service_controller_impl;

import com.pervuha.marketplace_217.seller_service.repo.SellerRepo;
import com.pervuha.marketplace_217.seller_service.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {

    SellerRepo repo;

    public SellerServiceImpl(@Autowired SellerRepo repo) {
        this.repo = repo;
    }

    @Override
    public void createSeller(String sellerJson) {

    }

    @Override
    public void updateSeller(String sellerJson) {

    }

    @Override
    public void getSeller(int id) {

    }

    @Override
    public void deleteSeller(int id) {

    }
}
