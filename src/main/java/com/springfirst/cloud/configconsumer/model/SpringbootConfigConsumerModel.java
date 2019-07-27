package com.springfirst.cloud.configconsumer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SpringbootConfigConsumerModel {
	
	@Autowired
	Environment env;
	
	public String getEnvDetails() {
		return env.getProperty("vehicle.default.model");
	}

}
