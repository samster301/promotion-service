package com.product.promotionservice;

public interface Lean {
    String printInformation();
    default String printDefaultInformation(){
        return "I am default";
    }
}
