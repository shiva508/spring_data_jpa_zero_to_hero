package com.comrade.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	@Id
	private Integer userid;
	private String name;
	private List<String> rolesList;
	public User() {
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getRolesList() {
		return rolesList;
	}
	public void setRolesList(List<String> rolesList) {
		this.rolesList = rolesList;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", rolesList=" + rolesList + "]";
	}
	
	
}
