package com.sun5.moon5.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sun5.moon5.model.Movie;
import com.sun5.moon5.service.MovieService;

@Controller
@RequestMapping("/movie")
public class MovieController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@Autowired
	private MovieService movie; // controller层调用的是service层，不是dao层

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	@ResponseBody
	public List<String> read() {
		List<String> list = new ArrayList<String>();
		for (int i = 1; i < 10; i++) {
			Movie m = movie.selectByPrimaryKey(i);
			String title = m.getCover();
			list.add(title);
			System.out.println(title);
		}
		return list;

	}

	@GetMapping("/test")
	public String test() {
		String str = "i am coming";
		return "test";
	}

	@RequestMapping("/jsp")
	public String testjsp(Model model) {
		int numb = 888888;
		model.addAttribute("good", numb);
		return "test"; // 渲染到test.jsp
	}

	@RequestMapping("/showpic")
	public ModelAndView showpic() throws Throwable {
		
		//三秒更新一次数据查询，送至前端
		Random rand = new Random();
		while (true) {
			Thread.sleep(1000*3);    
			int number = rand.nextInt(1699) +1;
				
			Movie mo = movie.selectByPrimaryKey(number);
			List<String> list = new ArrayList<String>();
			String pic = mo.getCover();
			String title = mo.getTitle();
			String director = mo.getDirectors();
			String casts = mo.getCasts();
			String rate = mo.getRate();
			
			String pi = pic.replaceAll("'", "");  //数据清洗，剔除首尾多余的单引号
			String ti = title.replaceAll("'", "");
			String di = director.replaceAll("'", "");
			 di = di.replace("(", "");
			 di = di.replace(")", "");
			String ca = casts.replaceAll("'", "");
			 ca = ca.replace("(", "");
			 ca = ca.replace(")", "");
			String ra = rate.replaceAll("'", "");
			list.add(pi);
			list.add(ti);
			list.add(di);
			list.add(ca);
			list.add(ra);
		
			ModelAndView modelandview = new ModelAndView();
			modelandview.addObject("mode", list);
			modelandview.setViewName("showPic");
			return modelandview;//渲染到showPic.jsp
		
		   
		}
	
	
	}
	
	
	
	
}
