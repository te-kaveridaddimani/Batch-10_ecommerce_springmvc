package com.te.ecommerce.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Items implements Serializable {
	@Id
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private int quntity;
	@Column
	private Double price;

}
