package com.cskaoyan.malldemo.mapper;

import com.cskaoyan.malldemo.bean.Footprin;
import com.cskaoyan.malldemo.bean.FootprinExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FootprinMapper {
    long countByExample(FootprinExample example);

    int deleteByExample(FootprinExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Footprin record);

    int insertSelective(Footprin record);

    List<Footprin> selectByExample(FootprinExample example);

    Footprin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Footprin record, @Param("example") FootprinExample example);

    int updateByExample(@Param("record") Footprin record, @Param("example") FootprinExample example);

    int updateByPrimaryKeySelective(Footprin record);

    int updateByPrimaryKey(Footprin record);
}
