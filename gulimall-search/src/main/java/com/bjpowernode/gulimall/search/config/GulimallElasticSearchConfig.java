package com.bjpowernode.gulimall.search.config;


import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 *
 * 1、导入依赖
 * 2、编写配置，在容器中注入RestHighLevelClient
 *
 *
 */
@Configuration
public class GulimallElasticSearchConfig {


    @Bean
    public RestHighLevelClient esRestClient(){
//        RestHighLevelClient client = new RestHighLevelClient(
//                RestClient.builder(
//                        new HttpHost("192.168.56.10",9200,"http")));
        RestClientBuilder builder = null;
        builder = RestClient.builder(new HttpHost("192.168.56.10",9222,"http"));
        RestHighLevelClient client = new RestHighLevelClient(builder);

        return client;

    }

}
