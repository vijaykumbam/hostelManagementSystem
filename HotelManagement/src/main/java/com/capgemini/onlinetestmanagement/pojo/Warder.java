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
import lombok.Setter;

@Entity
@Table(name="awarden")
@Data
@Setter
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

	public long getWardenId() {
		return wardenId;
	}

	public void setWardenId(long wardenId) {
		this.wardenId = wardenId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public long getHostelId() {
		return hostelId;
	}

	public void setHostelId(long hostelId) {
		this.hostelId = hostelId;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public List<Hostel> getHostels() {
		return hostels;
	}

	public void setHostels(List<Hostel> hostels) {
		this.hostels = hostels;
	}

	/**
	 * @param wardenId
	 * @param name
	 * @param login
	 * @param hostelId
	 * @param user
	 * @param hostels
	 */
	public Warder(long wardenId, String name, String login, long hostelId, UserEntity user, List<Hostel> hostels) {
		super();
		this.wardenId = wardenId;
		this.name = name;
		this.login = login;
		this.hostelId = hostelId;
		this.user = user;
		this.hostels = hostels;
	}

	/**
	 * 
	 */
	public Warder() {
		super();
	}
	
	
}
