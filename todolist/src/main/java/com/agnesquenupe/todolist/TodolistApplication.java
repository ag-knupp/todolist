package com.agnesquenupe.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* 
 * SpringApplication and SpringBootApplication are classes
*/ 

@SpringBootApplication
public class TodolistApplication {

/* 
 * SpringBootApplication - annotation - there is a function - initial class
*/
	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

}
