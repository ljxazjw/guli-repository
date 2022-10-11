package com.bjpowernode.gulimall.product.feign;


import com.bjpowernode.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("gulimall-ware")
public interface WareFeignService {


    /**
     *
     *
     * R设计的时候可以加上泛型
     * 或者直接返回我们想要的结果
     * 直接封装解析的结果
     * @param skuIds
     * @return
     */

    @PostMapping("/ware/waresku/hasstock")
    R<l> getSkusHasStock(@RequestBody List<Long> skuIds);

}
