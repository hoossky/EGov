package com.bit.proxies;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bit.web.domains.User;
import com.bit.web.enums.Sql;
import com.bit.web.mappers.TxMapper;
import com.bit.web.mappers.UserMapper;

@Component("manager")
public class UserProxy extends Proxy{
	@Autowired UserMapper usermapper;
	@Autowired TxMapper txMapper;
	@Autowired Box<String> box;
	
	public String makeBirthday() {
		// 가우스 정규 분포
		// 1970 ~ 2010
		List<String> birthdayText = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
		Collections.shuffle(birthdayText);		
		return birthdayText.get(0)+birthdayText.get(1)+birthdayText.get(2)+birthdayText.get(3)+birthdayText.get(4)+birthdayText.get(5);
		
	}
	public String makeGender() {
		List<String> genderText = Arrays.asList("M","F");
		Collections.shuffle(genderText);		
		return genderText.get(0);
	}
	public String makeUserid() {
		List<String> useridText = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
		Collections.shuffle(useridText);
		return useridText.get(0)+useridText.get(1)+useridText.get(2)+useridText.get(3)+useridText.get(4)+useridText.get(5);
	}
	public String makeName() {
		List<String> nameText = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
		Collections.shuffle(nameText);		
		return nameText.get(0)+nameText.get(1)+nameText.get(2)+nameText.get(3);
	}
	public String makeTelephone() {
		List<String> telephoneText = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
		Collections.shuffle(telephoneText);		
		return "010"+telephoneText.get(0)+telephoneText.get(1)+telephoneText.get(2)+telephoneText.get(3)+telephoneText.get(4)+telephoneText.get(5)+telephoneText.get(6)+telephoneText.get(7);
	}
	public User makeUser() {
		return new User(makeUserid(), makeName(), "1",
				makeBirthday(), makeGender(), makeTelephone(), "2020", "");
				
	}
	@Transactional
	public void insertUsers(int count) {
		for(int i = 0; i < count; i++) {
			txMapper.insertUser(makeUser());
		}
	}
	public void truncateUsers() {
		box.clear();
		box.put("TRUNCATE_USERS", Sql.TRUNCATE_USERS.toString());
		userMapper.truncateUser(box.get());
	}
}
