package com.capgemini.onlinetestmanagement.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="awarden")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Warder {

	@Id
	@Column(name="wardenid")
	private long wardenId;
	@Column(name="wardenname")
	private String name;
	@Column(name="login")
	private String login;
	@Column(name="hostelid")
	private long hostelId;
	
	@ManyToOne
	@JoinColumn(name="userid")
	private UserEntity user;

	@ManyToMany
	@JoinTable(name="warders_hostels", joinColumns =@JoinColumn(name="wardenid"), inverseJoinColumns = @JoinColumn(name="hostelid"))
	private List<Hostel> hostels;
	
	@Override
	public String toString() {
		return "Warder [id=" + wardenId + ", userId=" + name + ", login=" + login + ", hostelId="
				+ hostelId +"]";
	}
	
}
