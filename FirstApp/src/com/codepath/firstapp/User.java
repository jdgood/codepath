package com.codepath.firstapp;

import java.util.ArrayList;

public class User {
	public long id;
	public String name;
	public String hometown;
	
	public User(long id, String name, String hometown) {
		super();
		this.id = id;
		this.name = name;
		this.hometown = hometown;
	}
	
	public static ArrayList<User> getsampledUsers() {
		ArrayList<User> users = new ArrayList<User>();
		
		users.add(new User(1, "abc", "Los Angeles"));
		users.add(new User(1, "def", "Los Angeles"));
		users.add(new User(1, "ghi", "Los Angeles"));
		users.add(new User(1, "jkl", "Los Angeles"));
		users.add(new User(1, "mno", "Los Angeles"));
		
		return users;
	}
}
