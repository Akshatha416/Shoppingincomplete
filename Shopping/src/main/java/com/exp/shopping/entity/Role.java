package com.exp.shopping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table(name="roletab")
public class Role {
	
	@Id
	@GeneratedValue
	@Column(name="rid")
	private Integer id;
	
	@Column(name="rname")
	private String rolename;

}
