package com.skypro.springcontroller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.skypro.springcontroller.service.CartService;

import java.util.List;

@RestController
@RequestMapping("/order")

public class OrderController {

    private final CartService cartService;

    public OrderController(CartService cartService) {
        this.cartService = cartService;
    }
@GetMapping("/add")
    public void add(@RequestParam("id")List<Integer>ids){
        this.cartService.addToCart(ids);
}

@GetMapping("/get")
    public List<Integer>get(){
        return this.cartService.getCart();
}









}
