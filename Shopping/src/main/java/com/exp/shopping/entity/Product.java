package com.exp.shopping.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")
@ToString
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name="pid")
	private Integer id;
	
	@Column(name="pname")
	private String name;
	
	@Column(name="des")
	private String description;
	
	@ElementCollection
	@CollectionTable(name="prod_features",
	joinColumns= @JoinColumn(name="pidFk")
	)
	private List<String>features;
	
	@Column(name="pimg")
	private String imgUrl;
	
	@Column(name="active")
	private boolean active;
	
	@Column(name="pstock")
	private Integer unitstock;
	
	@Column(name="pcost")
	private Double productCost;

}
