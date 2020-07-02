package com.bit.web.tests;

import static org.junit.Assert.*;

import org.junit.Test;

/**
  * @FileName : HelloTest.java
  * @Project : 게시판
  * @Date : 2020. 7. 2. 
  * @작성자 : bit
  * @설명 :
  */
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/*-content.xml")

public class HelloTest {
	
	@Autowired
    @Qualifier("helloPrinter")
    Hello hello;

	@Test
	public void testSayHello() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrint() {
		fail("Not yet implemented");
	}

}
