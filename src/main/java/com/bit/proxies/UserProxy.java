package com.bit.proxies;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bit.tx.TxMapper;

@Component("manager")
public class UserProxy extends Proxy{
	@Autowired TxMapper txMapper;
	
	public String makeBirthday() {
		// 가우스 정규 분포
		// 1970 ~ 2010
		String birthday = "";
		return birthday;
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
}
