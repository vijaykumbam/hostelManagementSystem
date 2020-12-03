package com.capgemini.onlinetestmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagement.pojo.Warder;

@Service
public class WardenImpl implements WardenServiceI{

	@Override
	public long addUser(Warder warder) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateUser(Warder warder) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(Warder warder) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Warder findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Warder findByPk(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Warder> search(Warder warder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Warder> search(Warder warder, long pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
