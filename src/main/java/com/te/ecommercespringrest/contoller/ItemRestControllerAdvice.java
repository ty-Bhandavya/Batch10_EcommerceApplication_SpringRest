package com.te.ecommercespringrest.contoller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.ecommercespringrest.bean.ItemResponse;
import com.te.ecommercespringrest.custmexp.ItemException;

@RestControllerAdvice
public class ItemRestControllerAdvice {

	@ExceptionHandler(ItemException.class)
	public ItemResponse handleEmployeeExp(ItemException exception) {
		ItemResponse response = new ItemResponse();
		response.setStatusCode(500);
		response.setMsg(exception.getMessage());
		return response;
	}
}
