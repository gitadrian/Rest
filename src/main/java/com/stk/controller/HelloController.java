package com.stk.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.stk.model.Person;


@Controller
public class HelloController {
	
	List<Person> persons = new ArrayList<Person>();
	
	
	
	@RequestMapping(value="/")
	public String home(Model model){
		model.addAttribute("person", new Person());
		return "index";
	}
	
	@RequestMapping(value="/json", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Person> getJSON(){
	
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
	
	@RequestMapping(value="/personAdd", method=RequestMethod.POST)
	public String personAdd(Model model, @Valid @ModelAttribute Person person, BindingResult result){
		System.out.println(person);
		if (result.hasErrors()) {
			System.out.println(result.getFieldError());
		}else{
			persons.add(person);
		}
		return "index";
	}

}
