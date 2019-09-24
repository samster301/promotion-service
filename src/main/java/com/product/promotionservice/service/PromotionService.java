package com.product.promotionservice.service;

import com.product.promotionservice.entity.Promotion;

import java.util.List;

public interface PromotionService {
    Promotion getPromotion(Long productId);
    List<Promotion> getAllPromotions();
    Promotion addPromotion(Promotion promotion);
    void deletePromotion(Long productId);
}
