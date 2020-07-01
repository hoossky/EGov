package com.bit.web.domains;
/**
 * @FileName : Article.java
 * @Project : 게시판
 * @Date : 2020. 7. 1. 
 * @작성자 : bit
 * @설명 :  
 */
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;


@Lazy
@Data
@Component
public class Article {
	private int aseq, fseq;
	private String userid, comments, message, rating, borardType, title, content;
}
