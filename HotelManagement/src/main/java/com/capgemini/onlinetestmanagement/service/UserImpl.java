package com.capgemini.onlinetestmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagement.dao.UserI;
import com.capgemini.onlinetestmanagement.pojo.UserEntity;

@Service
public class UserImpl implements UserServiceI{

	@Autowired
	private UserI userl;

	@Override
	public long addUser(UserEntity user) {
		userl.save(user);
		return 0;
	}

	@Override
	public void updateUser(UserEntity user) {
		
		
	}

	@Override
	public void deleteUser(UserEntity user) {
		
		
	}

	@Override
	public UserEntity findByLogin(String login) {
		
		return null;
	}

	@Override
	public List<UserEntity> search(UserEntity user) {
		
		return null;
	}

	@Override
	public boolean changePassword(long id, String oldPassword, String newPassword) {
		
		return false;
	}

	@Override
	public boolean forgetPassword(String login) {
		
		return false;
	}

	@Override
	public long registerUser(UserEntity user) {
		
		return 0;
	}

	@Override
	public UserEntity findByPk(UserEntity user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserEntity> search(UserEntity user, long pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity authenicate(UserEntity user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
