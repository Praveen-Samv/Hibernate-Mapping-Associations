package com.OneToMany.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.OneToMany.entity.Book;
import com.OneToMany.entity.Student;
import com.OneToMany.repository.Bookrepository;
import com.OneToMany.repository.StudentRepository;

@Component
public class testRunner implements CommandLineRunner{
	
	
	@Autowired
	private Bookrepository bookrepository;
	
	@Autowired
	private StudentRepository studentRepository ;
	
	
	
	

	@Override
	public void run(String... args) throws Exception {

		// book obj.
		Book b1 = new Book(50,"TS");
		Book b2 = new Book(60,"BS");
		
		// save books.
		bookrepository.save(b1);
		bookrepository.save(b2);
		
		
		// set 
		Set<Book>  s1 = Set.of(b1,b2);
		
		// stu obj.
		Student st1 = new  Student(101,"Sam",s1) ;
		
		// save stu obj.
		studentRepository.save(st1);
		
		
		
		
	}

	
	
	
}
