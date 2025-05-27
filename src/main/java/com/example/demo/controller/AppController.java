package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.model.Tutorial;
import com.example.demo.jpa.model.TutorialRepository;
import com.example.demo.service.AppService;

//https://springazureapp-b0ahdwa0h6drh3d7.canadacentral-01.azurewebsites.net/
//@CrossOrigin(origins = "http://localhost:9091")
@CrossOrigin(origins = "https://azurewebapp1-b6f4dbd2fmencmcw.centralus-01.azurewebsites.net")
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
