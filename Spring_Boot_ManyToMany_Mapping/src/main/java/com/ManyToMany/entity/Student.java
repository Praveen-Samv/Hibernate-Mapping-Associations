package com.ManyToMany.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="std_tab")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
	
	@Id
	private Integer stid;
	
	private String sname ;
	
	@ManyToMany
	@JoinTable(name = "st_bk_tab",
			joinColumns = @JoinColumn(name="sid_FK"),
			inverseJoinColumns =  @JoinColumn(name="bid_FK")
			)
	private  Set<Book> books ;

}
