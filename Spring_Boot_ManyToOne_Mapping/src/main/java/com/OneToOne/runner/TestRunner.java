package com.OneToOne.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.OneToOne.entity.Book;
import com.OneToOne.entity.Student;
import com.OneToOne.repository.BookRepository;
import com.OneToOne.repository.StudentRepository;

@Component
public class TestRunner implements CommandLineRunner{
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		// crate a books obj.
		Book b1 = new Book(101,"DS");
		Book b2 = new Book(102,"SB");
		
		
		// save this.
		bookRepository.save(b1);
		bookRepository.save(b2);
		
		// crate student.
		Student s1 = new Student(50,"SAM",b1);
		Student s2 = new Student(60,"JHON",b1);
		Student s3 = new Student(70,"ANGLEA",b2);
		Student s4 = new Student(80,"BROCK",b2);
		
		studentRepository.save(s1);
		studentRepository.save(s2);
		studentRepository.save(s3);
		studentRepository.save(s4);
		

		
		

		
	}

}
