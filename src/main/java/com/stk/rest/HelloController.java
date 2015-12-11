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
		
		Person person3 = new Person();
		person3.setName("Pedro");
		person3.setLastName("Lopez");
		person3.setAge(25);
		
		persons.add(person);
		persons.add(person2);
		persons.add(person3);
		
		return persons;
		
	}
	
	@RequestMapping(value="/xml", method=RequestMethod.GET,produces="application/xml")
	public @ResponseBody Person getXML(){
		Person person = new Person();
		person.setName("Adrian");
		person.setLastName("Castro");
		person.setAge(23);
		
		return person;
		
		
		
	}
	
	@RequestMapping(value="/file.csv", method=RequestMethod.GET, produces="text/csv")
	public @ResponseBody String getCSV(){
		Person person = new Person();
		person.setName("Adrian");
		person.setLastName("Castro");
		person.setAge(23);

		StringBuffer sb = new StringBuffer();
		sb.append("Name");
		sb.append(",");
		sb.append("Last Name");
		sb.append(",");
		sb.append("Age");
		sb.append("\n");
		sb.append(person.getName());
		sb.append(",");
		sb.append(person.getLastName());
		sb.append(",");
		sb.append(person.getAge());
		return sb.toString();
	}

}
