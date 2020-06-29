package com.bit.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Review {
	private String reviewId, reviewTitle, stars, reviewDate;
}
