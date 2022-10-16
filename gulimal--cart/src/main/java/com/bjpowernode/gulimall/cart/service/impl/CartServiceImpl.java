package com.bjpowernode.gulimall.cart.service.impl;

import com.bjpowernode.gulimall.cart.service.CartService;
import com.bjpowernode.gulimall.cart.vo.CartItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    StringRedisTemplate stringRedisTemplate;


    @Override
    public CartItem addToCart(Long skuId, Integer num) {
        

        return null;
    }
}
