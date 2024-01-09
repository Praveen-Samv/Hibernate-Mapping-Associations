package com.OneToOne.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "book_name")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Book {
	
	@Id
	private Integer bid;
	
	private String bName ;
	

}
