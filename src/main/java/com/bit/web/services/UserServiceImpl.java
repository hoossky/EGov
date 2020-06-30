package com.bit.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.web.domains.User;
import com.bit.web.mappers.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	@Autowired UserMapper userMapper;

	@Override
	public User findUserForAccess(User user) {
		return userMapper.selectOneFromUsers(user);
	}
	

}
