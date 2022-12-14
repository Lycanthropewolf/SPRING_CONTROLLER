package com.skypro.springcontroller.service;

import org.springframework.stereotype.Service;
import com.skypro.springcontroller.reppository.CartBasket;

import java.util.List;

@Service
public class CartService  {
    private final CartBasket basket;

    public CartService (  CartBasket cartRepository) {
        this.basket = cartRepository;
    }

    public void addToCart( List<Integer>ids){
        this.basket.addToCart(ids);
    }

    public List<Integer> getCart(){
        return this.basket.getCart();
    }








}
