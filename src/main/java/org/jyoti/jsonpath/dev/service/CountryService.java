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
		CountryResponse response = invoker.getCountryRespone();
		String jsonResponse = objectMapper.writeValueAsString(response);
		
		return JsonPath.parse(jsonResponse).read(jsonExpression, classtype);
	}
}
