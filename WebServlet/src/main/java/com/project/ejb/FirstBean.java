package com.project.ejb;

import jakarta.ejb.Stateless;

@Stateless
public class FirstBean {
	public FirstBean () {};
	
	public String helloWorld() {
		return "Hello World";
	}
}
