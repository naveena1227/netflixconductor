package com.ex2.controller;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class hiii {
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	@Autowired
	private RestTemplate restTemplate;
	@RequestMapping(value="hi")
	public String heloo() throws JSONException 
	{   
		JSONObject json=new JSONObject();
		json.put("message","world");
		return json.toString();
//		int num1=5;
//		int num2=6;
//		int num3= num1+num2;
//		return num3;
		
	}

}
