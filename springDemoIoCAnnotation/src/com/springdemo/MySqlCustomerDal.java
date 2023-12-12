package com.springdemo;

import org.springframework.beans.factory.annotation.Value;



public class MySqlCustomerDal implements ICustomerDal {

	@Value("${local.email}")
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		System.out.println("Connection String: "+this.connectionString);
		System.out.println("Mysql veritabanına eklendi");
	}

}
