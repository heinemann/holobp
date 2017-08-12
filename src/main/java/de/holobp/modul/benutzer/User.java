/**
 * Atomare Kalsse für Benutzer 
 * 
 * @author Adrian Heinemann <post@heinemann.de>
 * @author Allan Grunert <contact@allangrunert.de>
 */
package de.holobp.modul.benutzer;

import java.sql.Timestamp;

public class User {

	private String username;
	private String password;
	private String email;
	private String uid;
	private Timestamp dateCreation;
	private Timestamp dateModified;

	public Timestamp getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Timestamp dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Timestamp getDateModified() {
		return dateModified;
	}

	public void setDate_modified(Timestamp dateModified) {
		this.dateModified = dateModified;
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
		return "User [username=" + username + ", password=" + password + ", email=" + email + ",dateCreation="
				+ dateCreation + ",dateModified=" + dateModified + ", id=" + id + ", uid=" + uid + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
