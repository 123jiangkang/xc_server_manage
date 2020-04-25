package com.xuecheng.fdfs.test;

import com.netflix.discovery.converters.Auto;
import com.xuecheng.framework.domain.cms.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FdfsApplicationTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void first(){

        String serviceId = "xc‐service‐manage‐cms";
        ResponseEntity<CmsPage> forEntity = restTemplate.getForEntity("http://" + "xc‐service‐manage‐cms/cms/test", CmsPage.class);

        System.out.println(forEntity);

    }
}
