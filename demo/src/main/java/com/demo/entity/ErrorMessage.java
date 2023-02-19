package com.demo.entity;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
	
	private HttpStatus status;
	private String message;

}
