package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class empldao implements emplservice {
	@Autowired
	emplrepo er;

	@Override
	public void getdata(empl el) {
		er.save(el);
		
	}
	

}
