package com.qiaoqin.girlprovider.dao;

import com.qiaoqin.girlapi.domain.Girl;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GirlMapper {

    Girl findById(Integer id);

    Girl findNameById(Integer id);

    List<Girl> findAll();

}
