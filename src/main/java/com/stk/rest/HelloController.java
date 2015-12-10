package com.stk.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stk.model.Person;

@Controller
public class HelloController {
	
	@RequestMapping(value="/")
	public String home(){
		return "index";
	}
	
	@RequestMapping(value="/json", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Person> getJSON(){
		
		List<Person> persons = new ArrayList<Person>();
		
		Person person = new Person();
		person.setName("Adrian");
		person.setLastName("Castro");
		person.setAge(23);
		
		Person person2 = new Person();
		person2.setName("Juan");
		person2.setLastName("Perez");
		person2.setAge(21);
		
		persons.add(person);
		persons.add(person2);
		
		return persons;
		
	}
	
	@RequestMapping(value="/xml", method=RequestMethod.GET)
	public @ResponseBody Person getXML(){
		Person person = new Person();
		person.setName("Adrian");
		person.setLastName("Castro");
		person.setAge(23);
		return person;
		
	}

}
