package com.todo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.todo.vo.Todo;

@Mapper
public interface TodoMapper {
	List<Todo> allList(); 				// 모든 할일 목록
	
	List<Todo> allListById(String userId); 	// 사용자 별 모든 할일 목록
	
	Todo find(String num);			// 번호기준으로 할일 검색
	
	
	int add(Todo todo); 			// 할일 등록
	
	int modify(Todo todo); 			
	
	int delete(String num);			// 번호 기준으로 할일 삭제
	
	
	int complete(Todo todo); 		// 번호기준 완료 여부 변경 (N->Y, Y->N)

	void deleteAll();               //모든 할일 삭제
	
}
