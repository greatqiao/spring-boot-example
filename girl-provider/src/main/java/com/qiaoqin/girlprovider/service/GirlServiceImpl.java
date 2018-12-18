package com.qiaoqin.girlprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.qiaoqin.girlapi.domain.Girl;
import com.qiaoqin.girlapi.service.GirlService;
import com.qiaoqin.girlprovider.dao.GirlMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0")
public class GirlServiceImpl implements GirlService {

    @Autowired
    private GirlMapper girlMapper;

    @Override
    public String getGirls() {
        List<Girl> list = girlMapper.findAll();
        return JSON.toJSONString(list);
    }
}
