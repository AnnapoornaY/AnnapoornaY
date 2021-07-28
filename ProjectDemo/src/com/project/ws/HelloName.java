package com.project.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloName {
	
		@WebMethod()
		public String sayHello(String name) {
			System.out.println("Hello"+name);
			return "Hello" +name;
		}
}
