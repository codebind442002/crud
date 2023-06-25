package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class emplcontroller {
	@Autowired
	emplservice es;
	
	
	@PostMapping("/sky")
	public String getempl(@ModelAttribute("el")empl el)
	{
	
		es.getdata(el);
		System.out.println("done");
		return "index";
	}
}

