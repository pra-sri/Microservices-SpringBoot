package com.CourseApplication.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CourseApplication.entity.Course;


@Repository
public interface CourseRepository extends CrudRepository<Course, BigInteger> {

}
