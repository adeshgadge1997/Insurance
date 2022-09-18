package com.insurance.Insurance.controller;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.insurance.Insurance.DAO.CourseDAO;
import com.insurance.Insurance.entity.Courses;
import com.insurance.Insurance.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseDAO courseDao;
	
	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "This is home ";
	}

	// get the courses
	@GetMapping("/coursesss")
	public List<Courses> getCourses() {
		return this.courseService.getCourses();
	}
	
	@GetMapping("/getSpecificCourses")
	public List<Courses> getSpecificCourses() {
		List<Courses> list = courseDao.getSpecificCourses();
		return list.stream().distinct().collect(Collectors.toList());
	}
	
		
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}

	@PostMapping("/coursesz")
	public Courses addCourses(@RequestBody Courses course) {
		return this.courseService.addCourses(course);
	}

	// Update courses using PUT request
	@PutMapping("courses")
	public Courses updateCourse(@RequestBody Courses course) {
		return this.courseService.updateCourse(course);
	}

	// Delete the course
	@DeleteMapping("/course/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
		try {
			this.courseService.deleteCourses(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
