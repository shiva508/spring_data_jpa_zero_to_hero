package com.comrade.model.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Animal {
	@Column(name = "name")
	private String name;
	@Column(name = "location")
	private String location;
	public Animal() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
