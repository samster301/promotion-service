package com.product.promotionservice.service;

import com.product.promotionservice.dao.PromotionRepository;
import com.product.promotionservice.entity.Promotion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionServiceImpl implements PromotionService{

    private PromotionRepository promotionRepository;
    PromotionServiceImpl(PromotionRepository promotionRepository){
        this.promotionRepository = promotionRepository;
    }

    @Override
    public List<Promotion> getAllPromotions() {
        return (List<Promotion>)promotionRepository.findAll();
    }

    @Override
    public Promotion getPromotion(Long productId) {
        return promotionRepository.findById(productId).orElse(new Promotion());
    }

    @Override
    public Promotion addPromotion(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    @Override
    public void deletePromotion(Long promotionId) {
        Promotion promotion = promotionRepository.findById(promotionId).orElse(new Promotion());
        promotionRepository.delete(promotion);
    }

}
