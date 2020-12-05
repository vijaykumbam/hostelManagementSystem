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

	public long getHostelId() {
		return hostelId;
	}

	public void setHostelId(long hostelId) {
		this.hostelId = hostelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	public List<Warder> getWardens() {
		return wardens;
	}

	public void setWardens(List<Warder> wardens) {
		this.wardens = wardens;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	/**
	 * @param hostelId
	 * @param name
	 * @param type
	 * @param contact
	 * @param address
	 * @param description
	 * @param fee
	 * @param applications
	 * @param wardens
	 * @param rooms
	 */
	public Hostel(long hostelId, String name, String type, String contact, String address, String description,
			String fee, List<Application> applications, List<Warder> wardens, List<Room> rooms) {
		super();
		this.hostelId = hostelId;
		this.name = name;
		this.type = type;
		this.contact = contact;
		this.address = address;
		this.description = description;
		this.fee = fee;
		this.applications = applications;
		this.wardens = wardens;
		this.rooms = rooms;
	}

	/**
	 * 
	 */
	public Hostel() {
		super();
	}

	@Override
	public String toString() {
		return "Hostel [hostelId=" + hostelId + ", name=" + name + ", type=" + type + ", contact=" + contact
				+ ", address=" + address + ", description=" + description + ", fee=" + fee + ", applications="
				+ applications + ", wardens=" + wardens + ", rooms=" + rooms + "]";
	}
	
}
