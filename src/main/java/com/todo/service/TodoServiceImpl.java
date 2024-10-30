package com.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.mapper.TodoMapper;
import com.todo.vo.Todo;

@Service
public class TodoServiceImpl implements TodoService {
	@Autowired
	TodoMapper mapper;
	
	@Override
	public List<Todo> allList() {
		return mapper.allList();
	}

	@Override
	public List<Todo> allListById(String userId) {
		return mapper.allListById(userId);
	}

	@Override
	public Todo find(String num) {
		return mapper.find(num);
	}

	@Override
	public boolean add(Todo todo) {
		int result = mapper.add(todo);
		
		Boolean isSuccess = false;
		if(result > 0) {
			isSuccess = true;
		}
		
		return isSuccess;
	}

	@Override
	public boolean modify(Todo todo) {
		int result = mapper.modify(todo);
		
		Boolean isSuccess = false;
		if(result > 0) {
			isSuccess = true;
		}
		
		return isSuccess;
	}

	@Override
	public boolean delete(String num) {
		int result = mapper.delete(num);
		
		Boolean isSuccess = false;
		if(result > 0) {
			isSuccess = true;
		}
		
		return isSuccess;
	}

	@Override
	public boolean complete(Todo todo) {
		int result = mapper.complete(todo);
		
		Boolean isSuccess = false;
		if(result > 0) {
			isSuccess = true;
		}
		
		return isSuccess;
	}

	@Override
	public void deleteAll() {
		mapper.deleteAll();
	}

}
