package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Image;

public class ImageDaoImpl implements ImageDao {
	
	Image image = new Image();
	
	private List<Image> list = new ArrayList<Image>();

	public void addImage(Image image) {
		// TODO Auto-generated method stub
		list.add(image);

	}

	public List<Image> getAllImages() {
		// TODO Auto-generated method stub
		return list;
	}

}
