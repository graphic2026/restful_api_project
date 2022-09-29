package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.course;

@Service
public class CourseServiceImpl implements CourseService{
    
	@Autowired
	private CourseDao coursedao;
	
	
//	List<course> list;
	
	public CourseServiceImpl() {

		
	}
	
	
	@Override
	public List<course> getCourses() {
	
		// TODO Auto-generated method stub
		return coursedao.findAll();
	}
	
	
	
	@Override
	public course getCourse(long courseID) {
		// TODO Auto-generated method stub
//		course c=null;
//		for(course curse:list) {
//			if(curse.getiD()==courseID) {
//				c=curse;
//				break;
//			}
//		}
		return coursedao.getOne(courseID);
	}
	
	
	@Override
	public course addCourse(course curse) {
		// TODO Auto-generated method stub
//		list.add(curse);
		coursedao.save(curse);
		return curse;
	}
	
	@Override
	public course updateCourse(course curse) {
		coursedao.save(curse);
		return curse;
	}
	
	@Override
	public void deleteCourse(long parseLong) {
		course entity=coursedao.getOne(parseLong);
		coursedao.delete(entity);
	}

}
