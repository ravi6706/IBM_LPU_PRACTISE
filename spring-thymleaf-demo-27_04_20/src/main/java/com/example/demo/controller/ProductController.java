package com.example.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Product;
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
    
    @RequestMapping("/product/{id}")
    public String getProduct(@PathVariable Integer id, Model model){

        model.addAttribute("product", productService.findById(id));

        return "product";
    }
    
    @RequestMapping("/product/new")
    public String newProduct(Model model){
        model.addAttribute("product", new Product());
        return "productform";
    }
    
    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String saveProduct(Product product){
        Product savedProduct = productService.saveProduct(product);
        return "redirect:/products/";
    }
    
    @RequestMapping("/product/new/{id}")
	public String getForm(Model model,@PathVariable int id) {
		Product product= productService.findById(id);
		model.addAttribute("product",product);
		return "productForm";
	}
    
    @RequestMapping(value = "/products", method = RequestMethod.PUT)
    public String updateProduct(Product product){
        Product savedProduct = productService.saveProduct(product);
        return "redirect:/products/";
    }
    
    
    
}
