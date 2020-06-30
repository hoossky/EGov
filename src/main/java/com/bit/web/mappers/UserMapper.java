package com.bit.web.mappers;

import org.springframework.stereotype.Repository;

import com.bit.web.domains.User;

@Repository
public interface UserMapper {
	public void insertOneIntoUsers(User user);
	public User selectOneFromUsers(User user);
	
}
