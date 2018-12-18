package com.qiaoqin.girlcomsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qiaoqin.girlapi.domain.Girl;
import com.qiaoqin.girlapi.service.GirlService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlController {

    @Reference(version = "1.0.0")
    private GirlService girlService;

    @PostMapping(value = "/Girls")
    public String getGirls(){
        return girlService.getGirls();
    }


    @GetMapping(value = "/Girls/{id}")
    public Girl getGirlById(@PathVariable(value = "id") Integer id){
//        return girlService.getGirl(id);
        return null;

    }

}
