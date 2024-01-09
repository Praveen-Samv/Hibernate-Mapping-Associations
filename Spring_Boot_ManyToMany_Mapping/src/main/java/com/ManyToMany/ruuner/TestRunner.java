package com.ManyToMany.ruuner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ManyToMany.entity.Book;
import com.ManyToMany.entity.Student;
import com.ManyToMany.repository.BookRepository;
import com.ManyToMany.repository.StudentRepository;

@Component
public class TestRunner implements CommandLineRunner{
	
	
	@Autowired
	private StudentRepository studentRepository ;
	
	@Autowired
	private BookRepository bookRepository ;
	
	

	@Override
	public void run(String... args) throws Exception {

		// create a book.
		Book b1 = new Book(50,"TR");
		Book b2 = new Book(60,"OP");
		Book b3 = new Book(70,"KP");
		
		// save Books.
		bookRepository.save(b1);
		bookRepository.save(b2);
		bookRepository.save(b3);
		
		Set<Book> s1 = Set.of(b1,b3);
		Set<Book> s2 = Set.of(b2,b3);

		// stud obj.
		Student st1 = new Student(101,"Sam",s1);
		Student st2 = new Student(102,"Jhon",s2);
		
		// save book.
		studentRepository.save(st1);
		studentRepository.save(st2);
		
		
		
	}

}
