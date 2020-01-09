package com.sun5.moon5.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun5.moon5.dao.MovieMapper;
import com.sun5.moon5.model.Movie;
import com.sun5.moon5.service.MovieService;


@Service("Movie")
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieMapper movieMapper; //困扰了一下午的问题出在这，调用的是dao,不是service接口
	
	@Override
	public int deleteByPrimaryKey(Integer num) {
		// TODO Auto-generated method stub
		return movieMapper.deleteByPrimaryKey(num);
	}
	
	@Override
	public int insert(Movie record) {
		// TODO Auto-generated method stub
		return movieMapper.insert(record);
	}
	
	@Override
	public int insertSelective(Movie record) {
		// TODO Auto-generated method stub
		return movieMapper.insertSelective(record);
	}
	
	@Override
	public Movie selectByPrimaryKey(Integer num) {
		// TODO Auto-generated method stub
		return movieMapper.selectByPrimaryKey(num);
	}
	
	@Override
	public int updateByPrimaryKeySelective(Movie record) {
		// TODO Auto-generated method stub
		return movieMapper.updateByPrimaryKey(record);
	}
	
	@Override
	public int updateByPrimaryKey(Movie record) {
		// TODO Auto-generated method stub
		return movieMapper.updateByPrimaryKeySelective(record);
	}


}
