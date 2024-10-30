package com.todo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.todo.vo.Todo;



@RestController
/*
 * Spring에서 기본적으로 CORS 요청을 허용하지 않음
 * 즉, 클라이언트에서 다른 출처로의(도메인, 프로토콜, 포트 번호 포함한 URL 조합)요청을 시도할 경우
 * CORS 정책에 따라 해당 요청을 거부하고 403 Forbidden 에러를 반환.
 * CORS 요청을 허용하려면, 모든 도메인에서 해당 서버에 접근하도록 설정을 변경하기 위해 @CrossOrigin()을 사용
 * */
@CrossOrigin("*")

public class TodoController2 {

	@GetMapping("todos")
	public Map<String, List<Todo>> findAll() throws Exception {
		Todo todo1 = new Todo();
		List<Todo> list = new ArrayList<>();
		list.add(todo1);

		Map<String, List<Todo>> response = new HashMap<>();
		response.put("todos", list);

		return response;
	}
	
	/* @RequestBody로 받을 때, 대응되는 객체를 사용하지 않고 Map<String, String>으로도 받을 수 있다.*/
	@PostMapping("todos")
	public ResponseEntity<String> insert(@RequestBody Map<String, String> payload){
		return new ResponseEntity<String>("insert success!",HttpStatus.OK);
	}
	
	/* UPDATE, DELETE, INSERT와 같이 클라이언트가 데이터를 필요로 하지 않으면, 
	 * ResponseEnitiy를 통해 간단하게 보내기*/
	@PatchMapping("todos/{todoId}")
	public ResponseEntity<String> update(@PathVariable("todoId") String id){
		return new ResponseEntity<String>("update success!",HttpStatus.OK);
	}
	
	@DeleteMapping("todos/{todos}")
	public ResponseEntity<String> delete(@PathVariable("todos") String todos){
		return new ResponseEntity<String>("delete success!",HttpStatus.OK);
	}
	
}
