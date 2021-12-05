package com.example.restaurant.InventoryController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RestaurantInventory {
	

		@RequestMapping(value = "/index" , method = RequestMethod.GET)
		
	    public String index()
	           {
	       return "/index";
	           }
		@ExceptionHandler(RuntimeException.class)
		public final ResponseEntity<Exception> handleAllExceptions(RuntimeException ex) {
		    return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		}
}

