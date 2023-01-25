package com.exp.shopping.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="usertab")
public class User {
	
	
	@Id
	@GeneratedValue
	@Column(name="uid")
	private Integer id;
	
	@Column(name="fname")
	private String firstName;
	
	@Column(name="lname")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="pwd")
	private String password;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="pnumber")
	private Long phonenumber;
	
	
	@ManyToMany
	@JoinTable(name="userroletab",
	joinColumns=@JoinColumn(name="user_id"),
	inverseJoinColumns=@JoinColumn(name="role_id"))
	
	private Set<Role> roles;
	

}
