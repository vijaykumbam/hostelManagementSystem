package com.capgemini.onlinetestmanagement.service;

import java.util.List;

import com.capgemini.onlinetestmanagement.pojo.Allotment;

public interface AllotmentServiceI {

	 //CRUD Operations
	 long add(Allotment allotment);
	 void update(Allotment allotment);
	 void delete(Allotment allotment);
	 Allotment findByName(String name);
	 Allotment findByPk (long id);
	 
	 List<Allotment> search(Allotment allotment);
	
	 
	 
	 //Pagination
	 List<Allotment> search(Allotment allotment, long pageNo, int pageSize);
}
