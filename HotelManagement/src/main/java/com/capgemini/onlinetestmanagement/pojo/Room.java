package com.capgemini.onlinetestmanagement.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="room_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {

	@Id
	@Column(name="roomid")
	private long roomId;
	@Column(name="roomNo")
	private String roomNo;
	@Column(name="hid")
	private long hostelId;
	@Column(name="description")
	private String description;
	
	
	@ManyToMany
	@JoinTable(name="hostels_rooms" , joinColumns = @JoinColumn(name="roomid"),inverseJoinColumns=@JoinColumn(name="hostelid"))
	private List<Hostel> roomhostels;
	
	@ManyToMany
	@JoinTable(name="allotments_rooms" , joinColumns = @JoinColumn(name="roomid"),inverseJoinColumns=@JoinColumn(name="allotmentid"))
	private List<Allotment> allotments;
	
	@ManyToMany
	@JoinTable(name="fees_rooms" , joinColumns = @JoinColumn(name="roomid"),inverseJoinColumns=@JoinColumn(name="feeid"))
	private List<Fee> fees;

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public long getHostelId() {
		return hostelId;
	}

	public void setHostelId(long hostelId) {
		this.hostelId = hostelId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Hostel> getRoomhostels() {
		return roomhostels;
	}

	public void setRoomhostels(List<Hostel> roomhostels) {
		this.roomhostels = roomhostels;
	}

	public List<Allotment> getAllotments() {
		return allotments;
	}

	public void setAllotments(List<Allotment> allotments) {
		this.allotments = allotments;
	}

	public List<Fee> getFees() {
		return fees;
	}

	public void setFees(List<Fee> fees) {
		this.fees = fees;
	}

	/**
	 * @param roomId
	 * @param roomNo
	 * @param hostelId
	 * @param description
	 * @param roomhostels
	 * @param allotments
	 * @param fees
	 */
	public Room(long roomId, String roomNo, long hostelId, String description, List<Hostel> roomhostels,
			List<Allotment> allotments, List<Fee> fees) {
		super();
		this.roomId = roomId;
		this.roomNo = roomNo;
		this.hostelId = hostelId;
		this.description = description;
		this.roomhostels = roomhostels;
		this.allotments = allotments;
		this.fees = fees;
	}

	/**
	 * 
	 */
	public Room() {
		super();
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomNo=" + roomNo + ", hostelId=" + hostelId + ", description="
				+ description + ", roomhostels=" + roomhostels + ", allotments=" + allotments + ", fees=" + fees + "]";
	}
	
	
}
