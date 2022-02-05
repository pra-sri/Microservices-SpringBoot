package com.CourseApplication.CourseApp;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.CourseApplication.entity.Course;
import com.CourseApplication.repository.CourseRepository;

@RestController
public class CourseController {
	
	@Autowired
	private CourseRepository courseRepo;
	
	@RequestMapping("/")
	public String getCourseAppHome() {
				return "Course App Home " ;
	}
	
	
	@RequestMapping("/courses")
	public List<Course> getCourses() {
				return (List<Course>) courseRepo.findAll();
	}
	
	@RequestMapping("/id/{id}")
	public Course getSpecificCourse(@PathVariable BigInteger id) {
		Optional<Course> optional = courseRepo.findById(id);
		Course course = optional.orElseThrow();
		return course;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/save")
	public void saveCourse(@RequestBody Course course) {
		courseRepo.save(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
	public void deleteCourse(@PathVariable BigInteger id) {
		courseRepo.deleteById(id);
	}

}
