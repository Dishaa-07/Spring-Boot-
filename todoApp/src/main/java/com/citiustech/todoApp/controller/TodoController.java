 package com.citiustech.todoApp.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citiustech.todoApp.DAO.TodoDao;
import com.citiustech.todoApp.model.Todo;
import com.citiustech.todoApp.service.TodoService;

@RestController
@RequestMapping("/todo")
public class TodoController {
	
	private static Logger log = Logger.getLogger("Solution");
	
	@Autowired
	private TodoDao todoDao;
	
	public Todo updateTask(@PathVariable long id, @RequestBody Todo todo){
		Task t1 = null;
		
		try{
			t1 
		}
	}
	
	/*@Autowired
	private TodoService todoService;
	
	@GetMapping
	public String sayHello(){
		return "Hello";
	}
	
	@PostMapping(value="save", consumes = "application/json")
	public void saveTodo(@RequestBody Todo todo){
		todoService.saveTodo(todo);
	}
	
	@PutMapping(value="update/{id}", consumes = "application/json")
	public void updateTodo(@PathVariable int id, @RequestBody Todo todo){
		todoService.updateTodo(todo);
	}*/
	
	}
