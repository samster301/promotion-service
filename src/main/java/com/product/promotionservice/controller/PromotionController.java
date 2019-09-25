package com.product.promotionservice.controller;

import com.product.promotionservice.entity.Promotion;
import com.product.promotionservice.service.PromotionService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class PromotionController {

    private PromotionService promotionService;
    public PromotionController(PromotionService promotionService){
        this.promotionService = promotionService;
    }

    @GetMapping(value= "/products/promotions/swagger-ui")
    public ModelAndView redirectToSwagger(){
        return new ModelAndView("redirect:/swagger-ui.html");
    }

    @ApiOperation(value = "find all promotions", response = List.class)
    @GetMapping(path = "/products/promotions", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Promotion> getAllPromotions(){
        return promotionService.getAllPromotions();
    }

    @ApiOperation(value = "find promotion for a product ID", response = Promotion.class)
    @GetMapping(path = "/products/{productId}/promotions", produces = MediaType.APPLICATION_JSON_VALUE)
    public Promotion getPromotions(@PathVariable("productId") String productId){
        return promotionService.getPromotion(Long.valueOf(productId));
    }

    @ApiOperation(value = "Add a new promotion", response = Promotion.class)
    @PostMapping(path = "/products/promotions", produces = MediaType.APPLICATION_JSON_VALUE)
    public Promotion addPromotions(Promotion promotion){
        return promotionService.addPromotion(promotion);
    }

    @ApiOperation(value = "Delete an existing promotion", response = Boolean.class)
    @DeleteMapping(path = "/products/{productId}/promotions", produces = MediaType.APPLICATION_JSON_VALUE)
    public Promotion deletePromotions(@PathVariable("productId") String productId){
        promotionService.deletePromotion(Long.valueOf(productId));
        return promotionService.getPromotion(Long.valueOf(productId));

    }

    @ApiOperation(value = "find host information", response = String.class)
    @GetMapping(path = "/products/promotions/host", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHostInformation(HttpServletRequest httpRequest){
        return httpRequest.getRequestURL().toString();
    }

}
