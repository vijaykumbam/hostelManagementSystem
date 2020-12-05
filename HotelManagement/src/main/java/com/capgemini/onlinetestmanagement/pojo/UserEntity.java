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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="usertable")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Warder> getWardens() {
		return wardens;
	}

	public void setWardens(List<Warder> wardens) {
		this.wardens = wardens;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @param id
	 * @param fname
	 * @param lname
	 * @param login
	 * @param password
	 * @param confirmPassword
	 * @param dob
	 * @param mobileNumber
	 * @param gender
	 * @param image
	 * @param role
	 * @param wardens
	 * @param applications
	 */
	public UserEntity(long id, String fname, String lname, String login, String password, String confirmPassword,
			Date dob, long mobileNumber, String gender, String image, Role role, List<Warder> wardens,
			List<Application> applications) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.login = login;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.dob = dob;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.image = image;
		this.role = role;
		this.wardens = wardens;
		this.applications = applications;
	}

	/**
	 * 
	 */
	public UserEntity() {
		super();
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", fname=" + fname + ", lname=" + lname + ", login=" + login + ", password="
				+ password + ", confirmPassword=" + confirmPassword + ", dob=" + dob + ", mobileNumber=" + mobileNumber
				+ ", gender=" + gender + ", image=" + image + ", role=" + role + ", wardens=" + wardens
				+ ", applications=" + applications + "]";
	}
	
}
