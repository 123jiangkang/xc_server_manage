package com.xuecheng.fdfs.controller.feignInterface;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "xc-service-manage-cms")
public interface TestFeign {

    @GetMapping("/cms/test")
    public CmsPage test();
}
