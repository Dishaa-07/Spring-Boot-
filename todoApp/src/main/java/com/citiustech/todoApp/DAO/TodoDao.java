package com.citiustech.todoApp.DAO;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.citiustech.todoApp.model.Todo;

@Repository
public class TodoDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveTodo(Todo todo){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(todo);
		
		tx.commit();
		session.close();
	}
	
	
	public void updateTodo(Todo todo){
		Session session = sessionFactory.openSession();
		Transaction tx  = session.beginTransaction();
		
		session.update(todo);
		
		tx.commit();
		session.close();
	}
}
