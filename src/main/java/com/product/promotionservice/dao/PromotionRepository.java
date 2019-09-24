package com.product.promotionservice.dao;

import com.product.promotionservice.entity.Promotion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PromotionRepository extends CrudRepository<Promotion, Long> {
}
