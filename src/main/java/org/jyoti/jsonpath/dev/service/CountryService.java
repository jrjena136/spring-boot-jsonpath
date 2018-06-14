package org.jyoti.jsonpath.dev.service;

import org.jyoti.jsonpath.dev.dto.CountryResponse;
import org.jyoti.jsonpath.dev.invoker.CountryInvoker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

@Service
public class CountryService {
	@Autowired
	private CountryInvoker invoker;
	
	ObjectMapper objectMapper = new ObjectMapper();
	public Object getFormattedResponse(String jsonExpression, Class<?> classtype) throws JsonProcessingException {
		System.out.println("****************Inside Service class****************");
		System.out.println("jsonExpression : " + jsonExpression + " | classType : " + classtype);
		System.out.println("Calling invoker");
		CountryResponse response = invoker.getCountryRespone();
		System.out.println("response from service : " + response.toString());
		String jsonResponse = objectMapper.writeValueAsString(response);
		Object countryResponse = JsonPath.parse(jsonResponse).read(jsonExpression, classtype);
		return countryResponse;
		
	}

}
