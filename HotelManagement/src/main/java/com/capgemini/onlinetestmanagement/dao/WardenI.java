package com.capgemini.onlinetestmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinetestmanagement.pojo.Warder;

@Repository
public interface WardenI extends JpaRepository<Warder, Long> {

}
