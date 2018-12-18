package com.qiaoqin.girlsingle.service;

import com.alibaba.fastjson.JSON;
import com.qiaoqin.girlsingle.dao.GirlMapper;
import com.qiaoqin.girlsingle.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GirlService {

    //    @Autowired
//    private GirlRepository girlRepository;
//
//    @Transactional
//    public void insertTwo(){
//        Girl girlA = new Girl();
//        girlA.setAge(19);
//        girlA.setCupSize("B");
//        girlRepository.save(girlA);
//
//        Girl girlB = new Girl();
//        girlB.setAge(20);
//        girlB.setCupSize("C");
//        girlRepository.save(girlB);
//    }

    @Autowired
    private GirlMapper girlMapper;


    public Girl getGirl(Integer id){
        return girlMapper.findById(id);
    }

    public Girl getName(Integer id){
        return girlMapper.findNameById(id);
    }

    public String getGirls(){
        List<Girl> list = girlMapper.findAll();
        return JSON.toJSONString(list);
    }
}
