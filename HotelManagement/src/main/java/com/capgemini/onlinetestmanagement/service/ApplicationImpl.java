package com.capgemini.onlinetestmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagement.pojo.Application;

@Service
public class ApplicationImpl implements ApplicationServiceI{

	@Override
	public long add(Application application) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(Application application) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Application application) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Application findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Application findByPk(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Application> search(Application application) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Application> search(Application application, long pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
