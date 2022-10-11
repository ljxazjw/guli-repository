package com.bjpowernode.gulimall.search.service.impl;

import com.bjpowernode.gulimall.search.config.GulimallElasticSearchConfig;
import com.bjpowernode.gulimall.search.service.MallSearchService;
import com.bjpowernode.gulimall.search.vo.SearchParam;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;

import javax.naming.directory.SearchResult;

public class MallSearchServiceImpl implements MallSearchService {

    @Autowired
    private RestHighLevelClient client;
    @Override
    public SearchResult search(SearchParam param) {
        SearchRequest searchRequest = new SearchRequest();

        return null;
    }
}
