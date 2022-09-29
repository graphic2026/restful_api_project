package com.springrest.springrest.controller;

import java.util.List;

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

import com.springrest.springrest.entities.course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	
	@GetMapping("/home")
 public String home() {
	 return "this is the home page, i m here again";
 }
	
	//get the courses
	@GetMapping("/courses")
	public List<course> getCourses(){
		 return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseID}")
	public course getCourse(@PathVariable String courseID) {
		return this.courseService.getCourse(Long.parseLong(courseID));
	} 
	//course add
	@PostMapping("/courses")
	public course addCourse(@RequestBody course curse) {
		return this.courseService.addCourse(curse) ;
	}
	
	//update course using PUT request
	@PutMapping("/courses/{courseID}")
	public course updateCourse(@RequestBody course curse) {
		return this.courseService.updateCourse(curse);
	}
	
	//delete the course
	@DeleteMapping("/courses/{courseID}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseID){
		try {
			this.courseService.deleteCourse(Long.parseLong(courseID));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
}
