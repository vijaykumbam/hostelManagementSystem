package com.capgemini.onlinetestmanagement.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="usertable")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="userid")
	private long id;
	@Column(name="fname")
	private String fname;
	@Column(name="lname")
	private String lname;
	@Column(name="login")
	private String login ;
	@Column(name="password")
	private String password;
	@Column(name="confirmpassword")
	private String confirmPassword;
	@Column(name="dob")
	private Date dob;
	@Column(name="mobilenumber")
	private long mobileNumber;
	@Column(name="gender")
	private String gender;
	@Column(name="image")
	private String image;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="rolefk", referencedColumnName ="roleid")
	private Role role;

	@OneToMany(mappedBy="user")
	private List<Warder> wardens;

	@OneToMany(mappedBy="user")
	private List<Application> applications;
	
}
