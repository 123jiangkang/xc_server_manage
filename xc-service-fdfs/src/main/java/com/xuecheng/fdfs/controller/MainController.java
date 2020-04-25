package com.xuecheng.fdfs.controller;

import com.xuecheng.fdfs.controller.feignInterface.TestFeign;
import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/fdfs")
public class MainController {

    @Autowired
    private TestFeign testFeign;

    @RequestMapping("/main")
    @ResponseBody
    public void main(){
        CmsPage test = testFeign.test();
        System.out.println(test);
    }
}
