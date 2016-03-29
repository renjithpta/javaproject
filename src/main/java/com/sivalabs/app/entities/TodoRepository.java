package com.sivalabs.app.entities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  TodoRepository extends JpaRepository<Todo, Integer> {

}
