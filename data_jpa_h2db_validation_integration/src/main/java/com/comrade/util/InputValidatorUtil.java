package com.comrade.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import com.comrade.model.ValidationResponse;

@Component
public class InputValidatorUtil {

	public ResponseEntity<?> validationResponseExtractorResult(BindingResult result) {
		if(result.hasErrors()) {
			List<FieldError> errors=result.getFieldErrors();
			List<ValidationResponse>responses=new ArrayList<>();
			responses=errors.stream().map(error->new ValidationResponse(error.getField(), error.getDefaultMessage())).collect(Collectors.toList());
			return new ResponseEntity<>(responses, HttpStatus.BAD_REQUEST);
		}
		return null;
	}

}
