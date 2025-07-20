package com.teste.ejb;

import jakarta.ejb.Stateless;

@Stateless
public class FirstBean {

	public FirstBean() {
	}
	
	public String helloWorld() {
		return "Hello World";
	}

}
