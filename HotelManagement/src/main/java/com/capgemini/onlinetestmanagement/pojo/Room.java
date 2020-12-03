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
}
