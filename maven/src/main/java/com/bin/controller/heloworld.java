package com.bin.controller;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;



@RestController
public class heloworld {
	
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	@Autowired
	private RestTemplate restTemplate;
	@RequestMapping(value="hi")
	public String heloo() throws RestClientException, JSONException 
	{   

		JSONObject json=new JSONObject();
		json.put("message","heloo");
		json.put("message-2",new JSONObject(restTemplate.exchange("http://localhost:8005/hi", HttpMethod.GET,null,String.class).getBody()));
		
		return json.toString();
	}

}
