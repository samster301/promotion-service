package com.product.promotionservice;

import java.util.Arrays;
import java.util.List;

public class LearnJava{

    public static void main(String[] args){
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        values.forEach(System.out::println);
    }

    Lean lean = new Lean(){
        public String printInformation(){
            return "string";
        }
    };
}
