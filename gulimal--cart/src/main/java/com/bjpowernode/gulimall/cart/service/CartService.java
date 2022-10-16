package com.bjpowernode.gulimall.cart.service;


import com.bjpowernode.gulimall.cart.vo.CartItem;

public interface CartService {
    CartItem addToCart(Long skuId, Integer num);
}
