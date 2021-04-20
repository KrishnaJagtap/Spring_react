package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("api/")
public class MyController {
	
	@Autowired
	private CourseService courseservice;
	
	
	@GetMapping("/home")
	public String home()
	{
		
		return "Welcome to the courses application ";
	}
	
	// get the courses
	@GetMapping("/courses")
	public List<Courses> getCourses()
	{
		return this.courseservice.getCourses();
	}
	
	@GetMapping("/courses/{courseid}")
	public Courses getId(@PathVariable String courseid)
	{
		return this.courseservice.getId(Long.parseLong(courseid));
		
	}
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course)
	{
		return this.courseservice.addCourse(course);
		
	}
	
	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses course)
	{
		return this.courseservice.updateCourse(course);
		
	}
	
	@DeleteMapping("/courses/{courseid}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseid)
	{
		
		try{
			
			this.courseservice.deleteCourse(Long.parseLong(courseid));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
	

}
