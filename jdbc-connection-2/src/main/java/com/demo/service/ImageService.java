package com.demo.service;

import java.util.List;

import com.demo.model.Image;

public interface ImageService {
	
	public void addImage(Image image);
	public List<Image> getAllImages();

}
