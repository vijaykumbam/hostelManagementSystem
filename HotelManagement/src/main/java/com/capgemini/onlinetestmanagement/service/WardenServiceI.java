package com.capgemini.onlinetestmanagement.service;

import java.util.List;

import com.capgemini.onlinetestmanagement.pojo.Warder;

public interface WardenServiceI {

	 //CRUD Operations
	 long addWarder(Warder warder);
	 void updateWarder(Warder warder);
	 void deleteWarder(Warder warder);
	 Warder findByName(String name);
	 Warder findByPk (long id);
	 
	 List<Warder> search();
	
	 
	 
	 //Pagination
	 List<Warder> search(Warder warder, long pageNo, int pageSize);
}
