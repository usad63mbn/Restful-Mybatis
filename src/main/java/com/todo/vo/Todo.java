package com.todo.vo;

import java.time.LocalDateTime;

import org.apache.ibatis.annotations.Mapper;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Todo {
	String num;
	String content;
	String userid;
	LocalDateTime sdate;
	LocalDateTime edate;
	String done;
	
	@Override
	public String toString() {
		return "Todo [num=" + num + ", content=" + content + ", userid=" + userid + ", sdate=" + sdate + ", edate="
				+ edate + ", done=" + done + "]";
	}	
}
