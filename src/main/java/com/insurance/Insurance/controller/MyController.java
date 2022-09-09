package com.insurance.Insurance.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.Insurance.entity.Cources;

@RestController
public class MyController 
{
	@GetMapping("/home")
	public String home()
	{
		return "This is home ";
	}
	
	//get the courses
	@GetMapping("/courses")
	public List<Cources> getCourses()
	{
		
	}
	

}
