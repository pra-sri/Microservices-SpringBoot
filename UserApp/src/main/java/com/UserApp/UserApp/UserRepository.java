package com.UserApp.UserApp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, BigInteger> {
	
	public List<User> findByUserId(BigInteger id);
	public List<User> findByCourseId(BigInteger id);

}
