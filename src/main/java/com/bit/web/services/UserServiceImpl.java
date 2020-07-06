package com.bit.web.services;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.web.domains.User;
import com.bit.web.mappers.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired UserMapper userMapper;
	@Autowired User user;

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update() {
		
		
	}
	@Override
	public void findOne() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void count() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public User findByUserIdAndPassword(User param) {

		return userMapper.selectByUseridAndPassword(param);
		
	}
	@Override
	public void findByEmailOrUserId(String email, String userId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByCreatedAtBetween(Date fromDate, Date toDate) {
		// TODO Auto-generated method stubs
		
	}
	@Override
	public void findByAgeGraterThanEqual(int age) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByNameLike(String name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByAccessCodeIsNull() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByGenerLike(String gender) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByEmailOrderByNameAsc(String email) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}