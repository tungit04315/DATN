package com.poly.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "maps")
public class Maps {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maps_id;
	private String maps_address;
	
	@ManyToOne
	@JoinColumn(name = "post_id")
	private Post post_id;
}
