package com.bit.web.mappers;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.bit.web.domains.User;

@Repository
public interface UserMapper {
	public void insertOneIntoUsers(User user);
	public User selectOneFromUsers(User user);
	@Insert("insert into users(userid, password)"
			+ "values #{userid}, #{password}")
	public void insertUser(User user);
	
}
