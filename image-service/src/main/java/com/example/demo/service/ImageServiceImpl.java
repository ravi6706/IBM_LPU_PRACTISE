package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.ImageDAO;
import com.example.demo.entity.Image;

@Service
@EnableTransactionManagement
public class ImageServiceImpl implements ImageService {
	
	private ImageDAO imageDAO;
	
	@Autowired
	public ImageServiceImpl(ImageDAO imageDAO) {
		super();
		this.imageDAO = imageDAO;
	}



	@Override
	@Transactional
	public Iterable<Image> findAllImages() {
		// TODO Auto-generated method stub
		return imageDAO.findAll();
	}

}
