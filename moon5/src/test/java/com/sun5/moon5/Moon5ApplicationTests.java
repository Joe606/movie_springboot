package com.sun5.moon5;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sun5.moon5.model.Movie;
import com.sun5.moon5.service.MovieService;



@RunWith(SpringRunner.class)
@SpringBootTest
class Moon5ApplicationTests {
	@Autowired
	public MovieService movieTest;
	
	@Test
	void testRead() {
		for(int i=1;i<11;i++) {
			Movie mov = movieTest.selectByPrimaryKey(i);
			System.out.println(mov.getNum() + "电影名称是：" + mov.getTitle());
		}
		return;
	}

}
