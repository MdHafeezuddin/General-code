package com.cg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("u")
public class User {
	//this is model class or pojo class

	public int getCarnumber() {
		return Carnumber;
	}
	public void setCarnumber(int carnumber) {
		Carnumber = carnumber;
	}
	@Value("${Carnumber}")
	private int Carnumber;
	@Value("${Company}")
	private String Company;
	
	@Value("${UserName}")
	private String UserName;
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}

}
