package com.bit.web.mappers;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit.web.domains.User;

@Repository
public interface UserMapper {
	public void insertUser(User user);
	public User selectByUseridAndPassword(User user);
	public List<User> selectAll(User user);
	public int existId(String userid);
	public int countUsers();
	public void createDB(HashMap<String, String> paramMap);
	public void createUser(HashMap<String, String> paramMap);
	public void dropUser(HashMap<String, String> paramMap);
	public void truncateUser(HashMap<String, String> paramMap);
	
}
