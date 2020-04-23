package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.InstructorDetailDAO;
import com.example.demo.entity.InstructorDetail;

@Service
@EnableTransactionManagement
public class InstructorDetailServiceImpl implements InstructorDetailService {
	
	private InstructorDetailDAO instructorDetailDAO;
	
	@Autowired
	public InstructorDetailServiceImpl(InstructorDetailDAO instructorDetailDAO) {
		super();
		this.instructorDetailDAO = instructorDetailDAO;
	}



	@Override
	@Transactional
	public InstructorDetail createInstructorDetail(InstructorDetail instructorDetail) {
		// TODO Auto-generated method stub
		return instructorDetailDAO.createInstructorDetail(instructorDetail);
	}

}
