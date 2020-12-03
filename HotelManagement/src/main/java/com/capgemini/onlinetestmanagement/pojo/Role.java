package com.capgemini.onlinetestmanagement.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {

	@Id
	@Column(name="roleid")
	private long roleid;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	
	
	
}
