package com.OneToOne.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OneToOne.entity.Book;

public interface Bookrepository extends JpaRepository<Book, Integer>{

}
