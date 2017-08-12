package de.holobp.modul.benutzer;

import java.sql.Timestamp;

public class User {
	private String username;
	private String password;
	private String email;
	
	private Timestamp date_creation;
	
	private Timestamp date_modified;
	
	public Timestamp getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Timestamp date_creation) {
		this.date_creation = date_creation;
	}
	public Timestamp getDate_modified() {
		return date_modified;
	}
	public void setDate_modified(Timestamp date_modified) {
		this.date_modified = date_modified;
	}
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ",date_creation=" + date_creation + ",date_modified=" + date_modified + ", id=" + id + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
