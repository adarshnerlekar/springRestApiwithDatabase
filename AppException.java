package com.example.RestApiwithDatabase.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppException {
	@ExceptionHandler
	public ResponseEntity<ErrorResponce> handleException(Exception e)
	{
		 ErrorResponce responce = new  ErrorResponce();
		 responce.setMsg(e.getMessage());
		 responce.setTimedate(LocalDateTime.now());
		 return new ResponseEntity<ErrorResponce>(responce, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
