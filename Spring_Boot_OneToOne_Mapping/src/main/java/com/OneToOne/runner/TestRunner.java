package com.OneToOne.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.OneToOne.entity.Book;
import com.OneToOne.entity.Student;
import com.OneToOne.repo.Bookrepository;
import com.OneToOne.repo.StudentRepository;

@Component
public class TestRunner implements CommandLineRunner{
	
	@Autowired
	private Bookrepository bookrepository;
	
	@Autowired
	private StudentRepository studentRepository;
	

	@Override
	public void run(String... args) throws Exception {
		
		// create obj.
		Book b1 = new Book(11,"Ap");
		Book b2 = new Book(12,"TN");
		Book b3 = new Book(13,"TS");
		
		// save books.
		bookrepository.save(b1);
		bookrepository.save(b2);
		bookrepository.save(b3);
		
		
		
		
		// create student obj.
		Student st1 = new Student(1,"A",b1);
		Student st2 = new Student(2,"B",b1);
		Student st3 = new Student(3,"C",b3);
		Student st4 = new Student(4,"D",b2);
		
		
		// save student obj.
		studentRepository.save(st1);
		studentRepository.save(st2);
		studentRepository.save(st3);
		studentRepository.save(st4);
		
	}

}
