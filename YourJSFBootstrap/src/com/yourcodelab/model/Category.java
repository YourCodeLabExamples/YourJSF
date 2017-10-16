package com.yourcodelab.model;

public class Category {
	private Integer idCategory;
	private String description;
	
	public Category(Integer idCategory, String description){
		this.idCategory = idCategory;
		this.description = description;
	}
	
	public Integer getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
