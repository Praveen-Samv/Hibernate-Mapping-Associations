package com.OneToOne.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OneToOne.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
