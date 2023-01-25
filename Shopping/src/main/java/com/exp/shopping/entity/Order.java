package com.exp.shopping.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="order")
@AllArgsConstructor
@NoArgsConstructor
public class Order {

	@Id
	private Integer id;
	
	
	
	@OneToOne
	@JoinColumn(name="oid")
	private User user;
	
	
	@OneToMany
	@JoinColumn(name="oid")
	private List<Product> prod;
	
	
	private Integer oderPrice;
	
}
