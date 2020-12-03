package com.capgemini.onlinetestmanagement.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="application")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {

	@Id
	@Column(name="applicationid")
	private Long applicationId;
	@Column(name="name")
	private String name;
	@Column(name="hostelid")
	private Long hostelId;
	@Column(name="hostelName")
	private String hostelName;
	@Column(name="qualification")
	private String qualification;
	@Column(name="address")
	private String address;
	@Column(name="description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name="userid")
	private UserEntity user;
	
	@ManyToOne
	private Hostel hostel;
	
	
}
