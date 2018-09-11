package model;

import java.io.Serializable;

public class Man implements Serializable{
	private static final long serializableId = 1L;
	private String name;
	private String password;
	
	public Man(String name,String password){
		this.name =name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
