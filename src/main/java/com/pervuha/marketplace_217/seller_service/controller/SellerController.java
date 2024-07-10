package com.pervuha.marketplace_217.seller_service.controller;

import org.springframework.stereotype.Component;


public interface SellerController {

    void createSeller(String sellerJson);

    void updateSeller(String sellerJson);

    void getSeller(int id);

    void deleteSeller(int id);
}
