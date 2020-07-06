package com.bit.web.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.bit.proxies.Box;


/**
  * @FileName : Calculator.java
  * @Project : 게시판
  * @Date : 2020. 7. 3. 
  * @작성자 : hoossky2@gmail.com
  * @see :
  */
@Component
public class Calculator {
@Autowired Box<Integer> box;
	
	public int sum(int a, int b) {
		box.put("res", a + b);
		return box.get("res");
	}
	public int substract(int a, int b) {
		return a - b;
	}
	public int absoluteVal(int a) {
		return Math.abs(a);
	}
	
 
}
