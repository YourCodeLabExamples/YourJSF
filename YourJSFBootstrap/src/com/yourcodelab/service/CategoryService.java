package com.yourcodelab.service;

import java.util.List;

import com.yourcodelab.dao.CategoryDAO;
import com.yourcodelab.model.Category;

public class CategoryService {
	private CategoryDAO dao;
	
	public CategoryService(){
		dao = new CategoryDAO();
	}
	
	public List<Category> listAll(){
		return dao.listAll();
	}
}
