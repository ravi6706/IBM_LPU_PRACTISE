package com.demo.dao;

import java.util.List;

import com.demo.model.Image;

public interface ImageDao {
	
	public void addImage(Image image);
	public List<Image> getAllImages();

}
