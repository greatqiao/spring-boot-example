package com.qiaoqin.girlsingle.dao;

import com.qiaoqin.girlsingle.domain.Girl;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GirlMapper {

    Girl findById(Integer id);

    Girl findNameById(Integer id);

    List<Girl> findAll();
}
