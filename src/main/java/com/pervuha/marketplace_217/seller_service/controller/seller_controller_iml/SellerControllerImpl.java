package com.pervuha.marketplace_217.seller_service.controller.seller_controller_iml;

import com.pervuha.marketplace_217.seller_service.controller.SellerController;
import com.pervuha.marketplace_217.seller_service.service.SellerService;
import com.pervuha.marketplace_217.seller_service.service.service_controller_impl.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SellerControllerImpl implements SellerController {

    private SellerService sellerService;

    public SellerControllerImpl(@Autowired SellerService sellerService) {
        this.sellerService = sellerService;
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
