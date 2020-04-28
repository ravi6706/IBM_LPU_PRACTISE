package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Image;
import com.example.demo.service.ImageService;

@RestController
public class ImageController {
	
	private ImageService imageService;

	@Autowired
	public ImageController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	
	@RequestMapping(value = "/images")
	public Iterable<Image> findAllImages(){
		return imageService.findAllImages();
	}
	

}
