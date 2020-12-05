package com.capgemini.onlinetestmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinetestmanagement.pojo.Warder;
import com.capgemini.onlinetestmanagement.service.WardenServiceI;


@RestController
@RequestMapping("/")
public class RestControllerHostel {
	
	@Autowired
	private WardenServiceI service;
	
	
	@GetMapping("/addWarden")
	public long addWarden(@RequestBody Warder warden) {
		
		return service.addWarder(warden);
	}

}
