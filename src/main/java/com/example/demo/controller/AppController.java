package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.model.Tutorial;
import com.example.demo.jpa.model.TutorialRepository;
import com.example.demo.service.AppService;

@CrossOrigin(origins = "http://localhost:9091")
@RestController
public class AppController {
	
	@Autowired
	AppService appService;

	//test test api
	@GetMapping("/msg")
	public List<Tutorial> getMsg() {

		return appService.getMsgData();
			
	}

	@GetMapping("/tempmsg")
	public String getTempMsgData() {

		return appService.getTempMsgData();
			
	}

}
