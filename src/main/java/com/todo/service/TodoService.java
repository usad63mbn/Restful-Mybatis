package com.todo.service;

import java.util.List;
import java.util.Map;

import com.todo.vo.Todo;

public interface TodoService {
	List<Todo> allList(); 				// 모든 할일 목록
	List<Todo> allListById(String userId); 	// 사용자 별 모든 할일 목록
	
	Todo find(String num);				// 번호기준으로 할일 검색
	
	boolean add(Todo todo); 			// 할일 등록
	
	boolean modify(Todo todo); 			// 할일 수정(번호 기준 시작일, 종료일, 내용 수정 가능)	
	
	boolean delete(String num);			// 번호 기준으로 할일 삭제
	
	boolean complete(Todo todo); 		// 번호기준 완료 여부 변경 (N->Y, Y->N)

	void deleteAll();                   //모든 할일 삭제
}