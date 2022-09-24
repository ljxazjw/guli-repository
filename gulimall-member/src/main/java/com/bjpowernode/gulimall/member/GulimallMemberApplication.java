package com.bjpowernode.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 远程调用别的服务
 *1、引入openfeign
 *2、编写一个借口，告诉springcloud需要调用远程服务
 *3、声明借口中的方法需要调用哪一个服务的哪一个请求
 *4、开启远程调用的功能
 *
 *
 */
@EnableFeignClients(basePackages = "com.bjpowernode.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
