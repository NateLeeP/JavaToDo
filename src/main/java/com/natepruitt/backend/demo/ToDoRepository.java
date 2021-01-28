package com.natepruitt.backend.demo.repository;

import com.natepruitt.backend.demo.data.ToDo; // import ToDo class
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {} // Tell MongoRepository 'entity' and type of Id attribute.
