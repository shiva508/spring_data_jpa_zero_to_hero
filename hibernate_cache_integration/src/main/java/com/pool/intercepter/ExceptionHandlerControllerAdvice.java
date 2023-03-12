package com.shiva.intercepter;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.shiva.exception.CustomException;
import com.shiva.exception.ServiceTypeNotFound;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<CustomException> productNotFoundException(HttpServletRequest request,Exception exe) {
		request.getRequestURI();
		CustomException res=new CustomException();
		res.setStatus(HttpStatus.NOT_FOUND.value());
		res.setMessage(exe.getMessage());
		res.setTimeStamp(new Date());
		return new ResponseEntity<CustomException>(res,HttpStatus.NOT_FOUND);
	}
}
