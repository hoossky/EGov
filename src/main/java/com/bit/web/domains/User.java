package com.bit.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class User {
	private String userid, password, name, ssn, address;
}
