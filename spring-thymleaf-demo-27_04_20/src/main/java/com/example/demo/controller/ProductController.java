package com.example.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ProductService;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
    
    @RequestMapping("/")
	public String hello(Model model) {
		model.addAttribute("theTime", new Date());
		return "Index";
	}

    @RequestMapping("/products")
    public String listProducts(Model model){

        model.addAttribute("products", productService.getProducts());

        return "products";
    }
}
