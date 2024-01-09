package com.OneToOne.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Book_tab")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {
	
	
	@Id
	private Integer bid;
	
	private String bName ;

}
