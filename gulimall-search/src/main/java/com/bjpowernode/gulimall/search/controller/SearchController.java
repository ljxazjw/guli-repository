package com.bjpowernode.gulimall.search.controller;


import com.bjpowernode.gulimall.search.service.MallSearchService;
import com.bjpowernode.gulimall.search.vo.SearchParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.naming.directory.SearchResult;

@Controller
public class SearchController {

    @Autowired
    MallSearchService mallSearchService;


    @GetMapping("/list.html")
    public String listPage(SearchParam param,Model model){
        SearchResult result = mallSearchService.search(param);
        model.addAttribute("result",result);

        return "list";

    }
    
    

}
