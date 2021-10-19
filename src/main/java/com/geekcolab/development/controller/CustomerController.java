package com.geekcolab.development.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

	@PreAuthorize("hasRole('CUSTOMER')")
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<?> sayHello() {

		return new ResponseEntity<>("Hi! CUSTOMER, you are authorized to view this response!", HttpStatus.OK);

	}

}
