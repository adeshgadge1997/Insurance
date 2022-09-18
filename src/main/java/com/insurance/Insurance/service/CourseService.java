package com.insurance.Insurance.service;

import java.util.ArrayList;
import java.util.List;

import com.insurance.Insurance.entity.Courses;

public interface CourseService 
{
	public List<Courses> getCourses();
	public Courses getCourse(long courseId);
	public Courses addCourses(Courses course);
	public Courses updateCourse(Courses course);
	public void deleteCourses(long parseLong);
	


}
