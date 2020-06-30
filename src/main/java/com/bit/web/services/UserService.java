package com.bit.web.services;

import org.springframework.stereotype.Component;

import com.bit.web.domains.User;

@Component
public interface UserService {
	public User findUserForAccess(User user);
}
