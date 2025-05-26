package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.jpa.model.Tutorial;
import com.example.demo.jpa.model.TutorialRepository;

@Service
public class AppService {

	@Autowired
	TutorialRepository tutorialRepository;

	public List<Tutorial> getMsgData() {
		// TODO Auto-generated method stub
		List<Tutorial> tutorials = new ArrayList<Tutorial>();

		try {
			
			tutorialRepository.findAll().forEach(tutorials::add);
			return tutorials;

		} catch (Exception e) {
			System.out.println(e);
		}
		return tutorials;

		
	}

}
