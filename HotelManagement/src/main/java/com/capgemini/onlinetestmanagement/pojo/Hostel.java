package com.capgemini.onlinetestmanagement.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="hosteltable")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hostel {

	@Id
	@Column(name="hostelid")
	private long hostelId;
	@Column(name="hostelname")
	private String name;
	@Column(name="hosteltype")
	private String type;
	@Column(name="contact")
	private String contact;
	@Column(name="address")
	private String address;
	@Column(name="description")
	private String description;
	@Column(name="fee")
	private String fee;
	
	@OneToMany(mappedBy="hostel")
	private List<Application> applications;
	
	@ManyToMany(mappedBy="hostels")
	private List<Warder> wardens;
	
	@ManyToMany(mappedBy="roomhostels")
	private List<Room> rooms;
}
