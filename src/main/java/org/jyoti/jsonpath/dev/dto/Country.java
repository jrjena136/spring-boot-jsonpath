
package org.jyoti.jsonpath.dev.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Country", "Data" })
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Country {

	@JsonProperty("Country")
	private String countryName;
	@JsonProperty("Data")
	private Data data;
}
