package com.DemoSujo.Demo1.demoSujo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class MessageDemo {
	
	//dependency Injection 
	private int id;
	private String Name ;
	
	private String Message;
	
	@Autowired 
	@Qualifier("Flight")
	private PriceSort Sort1;
	
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
		
		
	}

	public void Show()
	{
		System.out.printf("In the Beam: Hello world");
		
		//Sort1.sortPrice();
	}
	
	
	public PriceSort getSort1() {
		return Sort1;
	}

	/*public void setSort1(PriceSort sort1) {
		Sort1 = sort1;
		
	}*/
	

}
