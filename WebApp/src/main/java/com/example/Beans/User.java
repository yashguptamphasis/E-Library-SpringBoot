package com.example.Beans;


public class User {

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
String email;
@Override
public String toString() {
	return "Emp [email=" + email + ", phone=" + phone + ", password=" + password + ", name=" + name + "]";
}
String phone;
String password;
String name;
}
