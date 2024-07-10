package com.pervuha.marketplace_217.seller_service.service;

public interface SellerService {
    void createSeller(String sellerJson);

    void updateSeller(String sellerJson);

    void getSeller(int id);

    void deleteSeller(int id);
}
