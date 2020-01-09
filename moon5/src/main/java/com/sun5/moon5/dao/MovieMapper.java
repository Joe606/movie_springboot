package com.sun5.moon5.dao;

import org.apache.ibatis.annotations.Mapper;

import com.sun5.moon5.model.Movie;
@Mapper
public interface MovieMapper {
    int deleteByPrimaryKey(Integer num);

    int insert(Movie record);

    int insertSelective(Movie record);

    Movie selectByPrimaryKey(Integer num);

    int updateByPrimaryKeySelective(Movie record);

    int updateByPrimaryKey(Movie record);
}