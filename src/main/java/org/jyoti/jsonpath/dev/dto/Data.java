
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
@JsonPropertyOrder({ "Capital", "mintemp", "maxtemp", "Currency" })
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Data {

	@JsonProperty("Capital")
	private String capital;
	@JsonProperty("mintemp")
	private Integer mintemp;
	@JsonProperty("maxtemp")
	private Integer maxtemp;
	@JsonProperty("Currency")
	private String currency;

}
