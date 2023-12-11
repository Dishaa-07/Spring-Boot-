package com.citiustech.todoApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citiustech.todoApp.DAO.TodoDao;
import com.citiustech.todoApp.model.Todo;

@Service
public class TodoService {
	
	@Autowired
	private TodoDao todoDao;
	
	public void saveTodo(Todo todo){
		todoDao.saveTodo(todo);
	}

	public void updateTodo(Todo todo){
		todoDao.updateTodo(todo);
	}
}
