package org.jyoti.jsonpath.dev.invoker;

import java.util.ArrayList;
import java.util.List;

import org.jyoti.jsonpath.dev.dto.Country;
import org.jyoti.jsonpath.dev.dto.CountryResponse;
import org.jyoti.jsonpath.dev.dto.Data;
import org.springframework.stereotype.Component;

@Component
public class CountryInvoker {
	public CountryResponse getCountryRespone() {
		System.out.println("*****************Inside Invoker******************");
		CountryResponse response = new CountryResponse();
		response.setDescription("Map Containing Country, Capital, Currency, and some States of that County");
		response.setRegion("Asia");
		List<Country> countries = new ArrayList<Country>();
		
		Country country = new Country();
		Data data = new Data("New Delhi", 11, 25, "INR");
		country.setCountry("India");
		country.setData(data);
		countries.add(country);
		
		country = new Country();
		data = new Data("Kathmandu", 10, 20, "Nepalese Rupee");
		country.setCountry("Nepal");
		country.setData(data);
		countries.add(country);
		response.setCountries(countries);
		
		return response;
		
	}

}
