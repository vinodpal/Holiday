/**
 * 
 */
package com.holiday.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Holiday {
	private java.lang.String id;
	private java.lang.String name;
	private java.lang.String discription;

	
	/*@JsonCreator
	public Holiday(@JsonProperty("id") String Id, @JsonProperty("name") String name,
			@JsonProperty("discription") String discription) {
		this.id = id;
		this.name = name;
		this.discription = discription;

	}*/

	@Override
	public String toString() {
		return "Holiday [id=" + id + ", name=" + name + ", discription=" + discription + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}
}
