package com.OneToOne.entity;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "std_tab")
public class Student {
	
	@Id
	private Integer sid;
	
	
	private String sname ;
	
	
	@ManyToOne
	@JoinColumn(name = "bidFk")
	private Book book;
	
	

}
