package com.example.demo.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.InstructorDetail;
import com.example.demo.service.InstructorDetailService;

@RestController
@RequestMapping("/api")
public class InstructorDetailController {
	
	private InstructorDetailService instructorDetailService;

	public InstructorDetailController(InstructorDetailService instructorDetailService) {
		super();
		this.instructorDetailService = instructorDetailService;
	}
	
	@PostMapping("/instructordetail")
	public InstructorDetail createInstructorDetail(@RequestBody InstructorDetail instructorDetail) {
		instructorDetailService.createInstructorDetail(instructorDetail);
		return instructorDetail;
	}

}
