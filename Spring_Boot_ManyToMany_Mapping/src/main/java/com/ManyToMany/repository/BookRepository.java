package com.ManyToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ManyToMany.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
