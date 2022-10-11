package com.bjpowernode.gulimall.search.service;


import com.bjpowernode.gulimall.search.vo.SearchParam;
import org.springframework.stereotype.Service;

import javax.naming.directory.SearchResult;

@Service
public interface MallSearchService {

    /**
     *
     *
     *
     * @param param 检索的所有参数
     * @return 返回检索的结果
     */
    SearchResult search(SearchParam param);
}
