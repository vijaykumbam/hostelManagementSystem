package com.capgemini.onlinetestmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagement.pojo.Hostel;

@Service
public class HostelImpl implements HostelServiceI{

	@Override
	public long addHotel(Hostel hostel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateHotel(Hostel hostel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteHotel(Hostel hostel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Hostel findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hostel findByPk(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hostel> search(Hostel hostel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hostel> search(Hostel hostel, long pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
