package com.application.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.application.model.Blog;
import com.application.service.BlogService;
import com.application.service.BlogServiceImpl;

@Controller
@RequestMapping("/blog")
public class BlogController {  

	BlogService blogService = null;
	public BlogController() {
		blogService = new BlogServiceImpl(); 
	}
	
	@RequestMapping(value = "/getAllBlogs", headers = "Accept=*/*",  method = RequestMethod.GET)
	public @ResponseBody List<Blog> getBlogList() {
		List<Blog> blogList = blogService.getBlogList(); 
		return blogList;
	}
	
	@RequestMapping(value = "/addBlog", headers = "Accept=*/*",  method = RequestMethod.POST)
	public @ResponseBody List<Blog> addBlog() {
		List<Blog> blogList = null;
		Blog blog = new Blog("Dummy Blog Title Added", "Dummy Blog Story Added");
		boolean flag = blogService.addBlog(blog);
		
		if(flag)
			blogList = blogService.getBlogList(); 
		return blogList;
		
	}
	
	
//	@RequestMapping(value = "/getAllBlogs", method = RequestMethod.GET)
//	public ModelAndView sayHello() {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("message", "Hello, world!");
//		mav.setViewName("index");
//		return mav;
//	}
	
	
}