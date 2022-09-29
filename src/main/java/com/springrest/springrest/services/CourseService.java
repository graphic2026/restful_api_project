package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.course;

public interface CourseService {
	
	public List<course> getCourses();
	 
	public course getCourse(long courseID);
	
	public course addCourse(course curse);
	
	public course updateCourse(course curse);
	
	public void deleteCourse(long parseLong);

}
