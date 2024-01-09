package com.ManyToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ManyToMany.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
