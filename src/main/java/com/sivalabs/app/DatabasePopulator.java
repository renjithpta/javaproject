package com.sivalabs.app;

import java.util.Arrays;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sivalabs.app.entities.Person;
import com.sivalabs.app.entities.PersonRepository;
import com.sivalabs.app.entities.Todo;
import com.sivalabs.app.entities.TodoRepository;

@Component
public class DatabasePopulator {
	
	@Autowired
	private TodoRepository todoRepository;
	
	@Autowired
	private PersonRepository personRepo;
	
	@PostConstruct
	void init()
	{
		try {
			
			Todo t1 = new Todo(null, "Task 1", new Date());
			Todo t2 = new Todo(null, "Task 2", new Date());
			Todo t3 = new Todo(null, "Task 3", new Date());
			this.todoRepository.save(Arrays.asList(t1,t2,t3));
			this.personRepo.save(new Person("test@re.com", "rert", "test", "tesrt", new Date()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
