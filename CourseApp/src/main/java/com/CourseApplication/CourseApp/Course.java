package com.CourseApplication.CourseApp;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private BigInteger courseId;
	private String courseName;
	private String author;
	
	
	
	public Course() {
	}



	public BigInteger getCourseId() {
		return courseId;
	}



	public void setCourseId(BigInteger courseId) {
		this.courseId = courseId;
	}



	public String getCourseName() {
		return courseName;
	}



	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}
	
	
		
	

}
