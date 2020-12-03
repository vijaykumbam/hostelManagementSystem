package com.capgemini.onlinetestmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagement.pojo.Room;

@Service
public class RoomImpl implements RoomServiceI{

	@Override
	public long addRoom(Room room) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateRoom(Room room) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRoom(Room room) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Room findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room findByPk(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Room> search(Room room) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Room> search(Room room, long pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
