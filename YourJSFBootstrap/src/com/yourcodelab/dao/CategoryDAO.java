package com.yourcodelab.dao;

import java.util.ArrayList;
import java.util.List;

import com.yourcodelab.model.Category;

public class CategoryDAO {
	public List<Category> listAll(){
		List<Category> list = new ArrayList<Category>();
		list.add(new Category(1, "Gold"));
		list.add(new Category(2, "Diamond"));
		list.add(new Category(3, "Silver"));
		
		return list;
	}
}
