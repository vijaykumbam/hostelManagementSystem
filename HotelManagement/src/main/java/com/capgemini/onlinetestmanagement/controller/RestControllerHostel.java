package com.capgemini.onlinetestmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinetestmanagement.pojo.Allotment;
import com.capgemini.onlinetestmanagement.pojo.Application;
import com.capgemini.onlinetestmanagement.pojo.Fee;
import com.capgemini.onlinetestmanagement.pojo.Hostel;
import com.capgemini.onlinetestmanagement.pojo.Room;
import com.capgemini.onlinetestmanagement.pojo.UserEntity;
import com.capgemini.onlinetestmanagement.pojo.Warder;
import com.capgemini.onlinetestmanagement.service.AllotmentServiceI;
import com.capgemini.onlinetestmanagement.service.ApplicationServiceI;
import com.capgemini.onlinetestmanagement.service.FeeServiceI;
import com.capgemini.onlinetestmanagement.service.HostelServiceI;
import com.capgemini.onlinetestmanagement.service.RoomServiceI;
import com.capgemini.onlinetestmanagement.service.UserServiceI;
import com.capgemini.onlinetestmanagement.service.WardenServiceI;


@RestController
@RequestMapping("/")
public class RestControllerHostel {
	
	@Autowired
	private WardenServiceI service;
	@Autowired
	private AllotmentServiceI allotmentService;
	@Autowired
	private ApplicationServiceI applicationService;
	@Autowired
	private FeeServiceI feeService;
	@Autowired
	private HostelServiceI hostelService;
	@Autowired
	private RoomServiceI roomService;
	@Autowired
	private UserServiceI userService;
	
	
	// Adding Section.....
	@GetMapping("/addWarden")
	public long addWarden(@RequestBody Warder warden) {
		return service.addWarder(warden);
	}
	@GetMapping("/addUser")
	public long addUser(@RequestBody UserEntity user) {
		return userService.addUser(user);
	}
	@GetMapping("/addRoom")
	public long addRoom(@RequestBody Room room) {
		return roomService.addRoom(room);
	}
	@GetMapping("/addHostel")
	public long addHostel(@RequestBody Hostel hostel) {
		return hostelService.addHotel(hostel);
	}
	@GetMapping("/addFee")
	public long addFee(@RequestBody Fee fee) {
		return feeService.add(fee);
	}
	@GetMapping("/addApplication")
	public long addApplication(@RequestBody Application application) {
		return applicationService.add(application);
	}
	@GetMapping("/addAllotment")
	public long addAllotment(@RequestBody Allotment allotment) {
		return allotmentService.add(allotment);
	}
	
	//Update it need Dummy data.
	
	//Delete Section......
	
	

}
