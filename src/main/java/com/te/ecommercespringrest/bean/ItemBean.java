package com.te.ecommercespringrest.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "item")
@Entity
public class ItemBean implements Serializable{
	@Id
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private Integer qantity;
	@Column
	private Double price;

}
