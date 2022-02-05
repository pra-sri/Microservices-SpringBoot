package com.CourseCatalogue;

import java.math.BigInteger;


public class User {
	

	private BigInteger userId;

	private BigInteger courseId;
	
	private String userName ;
	
	
	
	

	public User() {
		super();
	}

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public BigInteger getCourseId() {
		return courseId;
	}

	public void setCourseId(BigInteger courseId) {
		this.courseId = courseId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
