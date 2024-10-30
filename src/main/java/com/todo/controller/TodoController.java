package com.todo.controller;

import java.net.http.HttpHeaders;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todo.service.TodoService;
import com.todo.vo.Todo;
import com.todo.vo.User;


@RestController
public class TodoController {
	@Autowired
	TodoService service;
	

	@GetMapping("todo")
	public List<Todo> allList() throws Exception {
		List<Todo> list = service.allList();
		return list;
	}
	
	@GetMapping("todo/{userId}")
	public List<Todo> allListById(@PathVariable("userId") String userId) throws Exception {
		List<Todo> list = service.allListById(userId);
		return list;
	}
	
	@GetMapping("todo/one/{num}")
	public Todo find(@PathVariable("num") String num) throws Exception {
		Todo todo = service.find(num);
		return todo;
	}
	
	
	@PostMapping("todo")
	public ResponseEntity<String> add(@RequestBody Todo todo) throws Exception {
		service.add(todo);
		return new ResponseEntity<String>("insert success!!!", HttpStatus.OK);
	}
	
	@PutMapping("todo")
	public Map<String, String> modify(@RequestBody Todo todo) throws Exception {
		service.modify(todo);
		
		Map<String, String> map = new HashMap<>();
		map.put("msg", "수정성공");
		return map;
	}

	@DeleteMapping("todo/{num}")
	public Map<String, String> delete(@PathVariable("num") String num) throws Exception {
		boolean isSuccess = service.delete(num);

		Map<String, String> map = new HashMap<>();
		if (isSuccess)
			map.put("msg", "삭제성공");
		else
			map.put("msg", "삭제실패");
		
		return map;
	}

	@PutMapping("todo/complete")
	public Map<String, String> complete(@RequestBody Todo todo){
		service.complete(todo);
		
		Map<String, String> map = new HashMap<>();
		map.put("msg", "complete 변경");
		
		return map;
	}
	
	@DeleteMapping("todo/all")
	public Map<String, String> deleteAll() throws Exception {
		service.deleteAll();

		Map<String, String> map = new HashMap<>();
		map.put("msg", "전체 삭제");
		
		return map;
	}
	
	@GetMapping("makeResponseEntity")
	public ResponseEntity<User> makeResponseEntity(){
		//json으로 변환할 body 데이터
		User user = new User("lhj",29) ;
		
		// 응답 헤더
		org.springframework.http.HttpHeaders headers =new org.springframework.http.HttpHeaders();
        headers.add("X-Custom-Header", "CustomHeaderValue");
        headers.add("Content-Type", "application/json");
		
        // T는 json으로 변환할 객체.
        // HttpStatus.* : 상태 코드를 의미. OK(200), NOT_FOUND(404)
        ResponseEntity<User> responseEntity = new ResponseEntity<>(user, headers, HttpStatus.NOT_FOUND);
		return responseEntity;
		
	}
	
}








