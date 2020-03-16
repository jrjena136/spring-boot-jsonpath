package org.jyoti.jsonpath.dev.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jyoti.jsonpath.dev.dto.Country;
import org.jyoti.jsonpath.dev.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class CountryController {

	@Autowired
	private CountryService service;
	
	@GetMapping(path = "/sample", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String,String> getResponse(){
		Map<String,String> map = new HashMap<>();
		map.put("status","success");
		map.put("message","successfully deployed into tomcat through jenkin");
		return map;
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/getCountryNames")
	public List<String> getCountryNames() throws JsonProcessingException{
		String expression = "$.Countries[*].Country";

		return (List<String>)service.getFormattedResponse(expression, List.class);
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/getCountries")
	public List<Country> getCountryDetails() throws JsonProcessingException{
		String expression = "$.Countries[*]";

		return (List<Country>) service.getFormattedResponse(expression, List.class);
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/getCountryData")
	public List<Country> getCountryData() throws JsonProcessingException{
		String expression = "$.Countries[*].Data";

		return (List<Country>) service.getFormattedResponse(expression, List.class);
	}

}
