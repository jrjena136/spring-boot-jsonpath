package org.jyoti.jsonpath.dev.controller;

import java.util.List;

import org.jyoti.jsonpath.dev.dto.Country;
import org.jyoti.jsonpath.dev.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/spring-boot-jsonpath")
public class CountryController {
	@Autowired
	private CountryService service;
	
	@SuppressWarnings("unchecked")
	@GetMapping("/getCountryNames")
	public List<String> getCountryNames() throws JsonProcessingException{
		System.out.println("************Inside Controller**************");
		String expression = "$.Countries[*].Country";
		List<String> response = (List<String>) service.getFormattedResponse(expression, List.class);
		System.out.println("response : " + response);
		System.out.println("************Controller End****************");
		return response;
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/getCountries")
	public List<Country> getCountryDetails() throws JsonProcessingException{
		System.out.println("************Inside Controller**************");
		String expression = "$.Countries[*]";
		List<Country> response = (List<Country>) service.getFormattedResponse(expression, List.class);
		System.out.println("response : " + response);
		System.out.println("************Controller End****************");
		return response;
	}
	@SuppressWarnings("unchecked")
	@GetMapping("/getCountryData")
	public List<Country> getCountryData() throws JsonProcessingException{
		System.out.println("************Inside Controller**************");
		String expression = "$.Countries[*].Data";
		List<Country> response = (List<Country>) service.getFormattedResponse(expression, List.class);
		System.out.println("response : " + response);
		System.out.println("************Controller End****************");
		return response;
	}

}
