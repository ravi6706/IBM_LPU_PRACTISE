package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Image;

@Repository
public interface ImageDAO extends CrudRepository<Image, Integer>{

}
