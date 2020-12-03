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


	@Override
	public String toString() {
		return "Allotment [allotmentId=" + allotmentId + ", hostelid=" + hostelid + ", hostelName=" + hostelName
				+ ", userId=" + userId + ", userName=" + userName + ", roomId=" + roomId + ", roomNo=" + roomNo
				+ ", rooms=" + rooms + "]";
	}
	
	
}
