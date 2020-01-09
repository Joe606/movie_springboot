package com.sun5.moon5.service;

import com.sun5.moon5.model.Movie;

public interface MovieService {
	int deleteByPrimaryKey(Integer num); //service层的抽象方法最好不要与dao层方法名称相同，避免错误混淆

    int insert(Movie record);

    int insertSelective(Movie record);

    Movie selectByPrimaryKey(Integer num);

    int updateByPrimaryKeySelective(Movie record);

    int updateByPrimaryKey(Movie record);
}
