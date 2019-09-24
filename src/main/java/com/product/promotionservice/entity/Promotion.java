package com.product.promotionservice.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="PROMOTION")
public class Promotion {

    @Id
    @Column(name = "PROMOTION_ID")
    //@SequenceGenerator(name="accountSeq", sequenceName="ACCOUNT_SEQ")
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long promotionId;

    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Column(name = "PROMO_CODE")
    private String promoCode;

    @Column(name = "PROMO_DISCOUNT")
    private String promoDiscount;

    @Column(name = "PROMO_DESCRIPTION")
    private String promoDescription;

}
