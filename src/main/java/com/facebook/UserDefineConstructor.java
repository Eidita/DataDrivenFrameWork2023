package com.facebook;

public class UserDefineConstructor {
	
	/*
	 * data base can not take default value/can not be empty
	 * and name
	 */
	int id;
	String name;
	String sub;
	public UserDefineConstructor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println(id+" "+name);
	}

	

	public static void main(String[] args) {
		UserDefineConstructor uc=new UserDefineConstructor(1, "Sumon");

	}

}
