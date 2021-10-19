package com.geekcolab.development.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/driver")
public class DriverController {

	@PreAuthorize("hasRole('DRIVER')")
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<?> sayHello() {

		return new ResponseEntity<>("Hi! DRIVER, you are authorized to view this response!", HttpStatus.OK);

	}

}
