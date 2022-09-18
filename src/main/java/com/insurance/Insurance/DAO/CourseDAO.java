package com.insurance.Insurance.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.insurance.Insurance.entity.Courses;
@Repository
public interface CourseDAO extends JpaRepository<Courses, Long>
{
	@Query(value = "select * from Courses",nativeQuery = true)
	List<Courses> getSpecificCourses();
	
	

}
