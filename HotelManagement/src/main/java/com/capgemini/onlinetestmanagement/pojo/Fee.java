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
@Table(name="fee_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fee {

	@Id
	@Column(name="feeid")
	private long feeId;
	private long userId;
	private String userName;
	private long hostelId;
	private String hostelName;
	private long roomId;
	private String roomName;
	private String totalFee;
	private String pay;
	private String paidFee;
	private String remainingFee;
	private long allotmentId;
	
	@ManyToMany(mappedBy="fees")
	private List<Room> rooms;

	@Override
	public String toString() {
		return "Fee [feeId=" + feeId + ", userId=" + userId + ", userName=" + userName + ", hostelId=" + hostelId
				+ ", hostelName=" + hostelName + ", roomId=" + roomId + ", roomName=" + roomName + ", totalFee="
				+ totalFee + ", pay=" + pay + ", paidFee=" + paidFee + ", remainingFee=" + remainingFee
				+ ", allotmentId=" + allotmentId + ", rooms=" + rooms + "]";
	}
	
	
}
