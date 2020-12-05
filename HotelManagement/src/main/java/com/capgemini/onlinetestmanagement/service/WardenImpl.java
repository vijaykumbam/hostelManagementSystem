package com.capgemini.onlinetestmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagement.dao.WardenI;
import com.capgemini.onlinetestmanagement.pojo.Warder;

import lombok.Data;
import lombok.NoArgsConstructor;


@Service
@Data
@NoArgsConstructor
public class WardenImpl implements WardenServiceI{

	@Autowired
	private WardenI wardenDao;

	
	@Override
	public long addWarder(Warder warder) {
		long wardenId = warder.getHostelId();
		wardenDao.save(warder);
		return wardenId;
	}

	@Override
	public void updateWarder(Warder warder) {
		Optional<Warder> obj = wardenDao.findById(warder.getWardenId());
		if(obj.isPresent())
		{
			Warder warden =obj.get();
			warden.setName(warder.getName());
			wardenDao.saveAndFlush(warder);
		}
		
	}

	@Override
	public void deleteWarder(Warder warder) {
		Optional<Warder> obj =wardenDao.findById(warder.getWardenId());
		if(obj.isPresent())
		{
			wardenDao.delete(warder);	
		}		
	}

	@Override
	public Warder findByName(String name) {
		Optional<Warder>obj = wardenDao.findByName(name);
		if(obj.isPresent())
		{
			Warder warder=obj.get();
			return warder;
		}
		else
		return null;
	}

	
	@Override
	public Warder findByPk(long id) {
		Optional<Warder> obj = wardenDao.findById(id);
		if(obj.isPresent())
		{
			Warder warden =obj.get();
			return warden;
		}
		else
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
