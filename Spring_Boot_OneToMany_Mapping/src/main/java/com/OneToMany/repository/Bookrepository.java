package com.OneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OneToMany.entity.Book;

public interface Bookrepository extends JpaRepository<Book, Integer> {

}
