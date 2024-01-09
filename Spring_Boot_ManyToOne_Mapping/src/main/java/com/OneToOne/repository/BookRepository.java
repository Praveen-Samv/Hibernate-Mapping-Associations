package com.OneToOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OneToOne.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
