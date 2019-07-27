package com.springfirst.cloud.configconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springfirst.cloud.configconsumer.model.SpringbootConfigConsumerModel;

@RestController
@RefreshScope
public class SpringbootConfigConsumerController {
	
	@Autowired
	SpringbootConfigConsumerModel springbootConfigConsumerModel;
	
	@GetMapping("/getEnv")
	public String getProfileData(){
		
		return springbootConfigConsumerModel.getEnvDetails();
	}

}
