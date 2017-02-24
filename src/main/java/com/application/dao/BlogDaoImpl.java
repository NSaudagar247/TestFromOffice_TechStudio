package com.application.dao;

import java.util.ArrayList;
import java.util.List;
import com.application.model.Blog;

public class BlogDaoImpl implements BlogDao{

	@Override
	public List<Blog> getBlogList() {
		List<Blog> blogList = new ArrayList<Blog>();
		blogList.add(new Blog("Dummy Blog Title 1", "Dummy Blog Story 1"));
		blogList.add(new Blog("Dummy Blog Title 2", "Dummy Blog Story 2"));
		blogList.add(new Blog("Dummy Blog Title 3", "Dummy Blog Story 3"));
		blogList.add(new Blog("Dummy Blog Title 4", "Dummy Blog Story 4"));
		blogList.add(new Blog("Dummy Blog Title 5", "Dummy Blog Story 5"));
		return blogList;
	}

	@Override
	public Blog getBlog(Blog blog) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addBlog(Blog blog) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBlog(Blog blog) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBlog(Blog blog) {
		// TODO Auto-generated method stub
		return false;
	}

}
