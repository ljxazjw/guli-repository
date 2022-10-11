package com.bjpowernode.gulimall.product;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 导入mybatisplus的配置
 *
 * 1、配置数据源
 * 导入驱动，在公共模块common
 * 在application.yml中配置数据源
 *
 * 2、配置mybatisplus相关的信息
 * 使用@mapperscan
 *
 *
 *
 *
 *
 *
 */
@EnableFeignClients(basePackages = "com.bjpowernode.gulimall.product.feign")
@EnableDiscoveryClient
@MapperScan("com.bjpowernode.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
