package com.qiaoqin.girlsingle.controller;


import com.qiaoqin.girlsingle.domain.Girl;
import com.qiaoqin.girlsingle.properties.GirlProperties;
import com.qiaoqin.girlsingle.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {


//    @Autowired
//    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    @Autowired
    private GirlProperties girlProperties;

    @PostMapping(value = "/Girls")
    public String getGirls(){
        return girlService.getGirls();
    }


    @GetMapping(value = "/Girls/{id}")
    public Girl getGirlById(@PathVariable(value = "id") Integer id){
//        return girlRepository.findOne(id);
        System.out.println(girlProperties.getCupSize());
        return girlService.getGirl(id);

    }













    ////        return girlRepository.save(girl);
    //        return null;
    //        girl.setCupSize(girl.getCupSize());
    //        girl.setAge(girl.getAge());
    //        }
    //            return null;
    //            System.out.println(bindingResult.getFieldError().getDefaultMessage());
    //        if(bindingResult.hasErrors()){
//    public Girl createGirls(@Valid Girl girl, BindingResult bindingResult){

//    }

    @DeleteMapping(value = "/Girls/{id}")
    public void deleteGirl(@PathVariable(value = "id") Integer id){

//        girlRepository.delete(id);
    }

    @PutMapping(value = "/Girls/{id}")
    public Girl updateGirl(@PathVariable(value = "id") Integer id,
                           @RequestParam(value = "age") Integer age,
                           @RequestParam(value = "cupSize") String cupSize){
        Girl girl =  new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return null;
//        return girlRepository.save(girl);

    }

    @GetMapping(value = "/Girls/age/{age}")
    public List<Girl> getGirlByAge(@PathVariable(value = "age") Integer age){
        return null;
//        return girlRepository.findByAge(age);
    }

    @PostMapping(value = "/Girls/two")
    public void insertTwoGirl(){
//        girlService.insertTwo();
    }

    @GetMapping(value = "/name/{id}")
    public Girl getName(@PathVariable(value = "id") Integer id){
        return girlService.getName(id);
    }
}
