package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public
class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String username;
	String email;
	String password;
	String gender;
	String role;
	String Address;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String username, String email, String password, String gender, String role, String address) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.role = role;
		Address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "users [username=" + username + ", email=" + email + ", password=" + password + ", gender=" + gender
				+ ", role=" + role + ", Address=" + Address + "]";
	}
	
	
	
	
	
	

}


