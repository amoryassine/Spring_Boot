package com.yassine.voiture.controllers;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yassine.voiture.service.VoitureService;


@RestController
public class VoitureController {
	@Autowired
	VoitureService voitureService;
	
	
	@RequestMapping("/showCreate")
	public String showCreate(){
		
		return "saveVoiture";
	}


}
