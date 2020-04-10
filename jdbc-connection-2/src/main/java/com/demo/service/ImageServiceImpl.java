package com.demo.service;

import java.util.List;

import com.demo.dao.ImageDao;
import com.demo.dao.ImageDaoImpl;
import com.demo.model.Image;

public class ImageServiceImpl implements ImageService{
	
	ImageDao imagedao = new ImageDaoImpl();

	public void addImage(Image image) {
		imagedao.addImage(image);
		
	}

	public List<Image> getAllImages() {
		// TODO Auto-generated method stub
		return imagedao.getAllImages();
	}
	
	

}
