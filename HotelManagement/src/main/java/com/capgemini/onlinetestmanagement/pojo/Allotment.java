package com.capgemini.onlinetestmanagement.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="allotment_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Allotment {

	@Id
	@Column(name="allotmentid")
	private long allotmentId;
	@Column(name="hostelid")
	private long hostelid;
	@Column(name="hostelname")
	private String hostelName;
	@Column(name="userid")
	private long userId;
	@Column(name="username")
	private String userName;
	@Column(name="roomid")
	private long roomId;
	@Column(name="roomno")
	private String roomNo;
	
	
	@ManyToMany(mappedBy="allotments")
	private List<Room> rooms;

	

	public long getAllotmentId() {
		return allotmentId;
	}



	public void setAllotmentId(long allotmentId) {
		this.allotmentId = allotmentId;
	}



	public long getHostelid() {
		return hostelid;
	}



	public void setHostelid(long hostelid) {
		this.hostelid = hostelid;
	}



	public String getHostelName() {
		return hostelName;
	}



	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}



	public long getUserId() {
		return userId;
	}



	public void setUserId(long userId) {
		this.userId = userId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



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



	public List<Room> getRooms() {
		return rooms;
	}



	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}



	/**
	 * 
	 */
	public Allotment() {
		super();
	}



	/**
	 * @param allotmentId
	 * @param hostelid
	 * @param hostelName
	 * @param userId
	 * @param userName
	 * @param roomId
	 * @param roomNo
	 * @param rooms
	 */
	public Allotment(long allotmentId, long hostelid, String hostelName, long userId, String userName, long roomId,
			String roomNo, List<Room> rooms) {
		super();
		this.allotmentId = allotmentId;
		this.hostelid = hostelid;
		this.hostelName = hostelName;
		this.userId = userId;
		this.userName = userName;
		this.roomId = roomId;
		this.roomNo = roomNo;
		this.rooms = rooms;
	}



	@Override
	public String toString() {
		return "Allotment [allotmentId=" + allotmentId + ", hostelid=" + hostelid + ", hostelName=" + hostelName
				+ ", userId=" + userId + ", userName=" + userName + ", roomId=" + roomId + ", roomNo=" + roomNo
				+ ", rooms=" + rooms + "]";
	}
	
	
}
