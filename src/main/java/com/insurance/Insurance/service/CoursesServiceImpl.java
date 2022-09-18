package com.insurance.Insurance.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.Insurance.DAO.CourseDAO;
import com.insurance.Insurance.entity.Courses;

@Service
public class CoursesServiceImpl implements CourseService 
{
		
	@Autowired
	private CourseDAO courseDao;
	
	public CoursesServiceImpl() 
	{
		
		
	}

	@Override
	public List<Courses> getCourses() 
	{
		return courseDao.findAll();
	}
	

	@Override
	public Courses getCourse(long courseId) 
	{
		return courseDao.getOne(courseId);
	}

	@Override
	public Courses addCourses(Courses course) 
	{
		courseDao.save(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) 
	{
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourses(long parseLong) 
	{
		Courses entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);		
	}

	

	

}
