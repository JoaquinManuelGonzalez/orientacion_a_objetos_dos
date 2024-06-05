package ar.edu.unlp.info.oo2.ej1_DatabaseAccessWithLog;

import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseProxy implements DatabaseAccess {
	
	private DatabaseRealAccess realAccess;
	private String password;
	private boolean isLogged;
	
	public DatabaseProxy(DatabaseRealAccess realAccess, 
			String password) {
		this.realAccess = realAccess;
		this.password = password;
		this.isLogged = false;
	}
	
	public static void main(String[] args) {
		Logger.getLogger("access").setLevel(Level.SEVERE);
		Logger.getLogger("insertions").setLevel(Level.WARNING);
		Logger.getLogger("searches").setLevel(Level.INFO);
	}

	public DatabaseRealAccess getRealAccess() {
		return realAccess;
	}

	public String getPassword() {
		return password;
	}

	public boolean isLogged() {
		return isLogged;
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(this.isLogged) {
			Logger.getLogger("searches.allowed").log(Level.INFO, "Allowed searches in the data base.");
			return this.getRealAccess().getSearchResults(queryString);
		} else {
			Logger.getLogger("searches.denied").log(Level.INFO, "Denied searches in the data base.");
			throw new RuntimeException("Please log in first.");
		}
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(this.isLogged) {
			Logger.getLogger("insertions.allowed").log(Level.WARNING, "Allowed insertions in the data base.");
			return this.getRealAccess().insertNewRow(rowData);
		} else {
			Logger.getLogger("insertions.denied").log(Level.WARNING, "Denied insertions in the data base.");
			throw new RuntimeException("Please log in first.");
		}
	}
	
	public void login(String password) {
		if(!this.isLogged()) {
			if(this.getPassword().equals(password)) {
				this.isLogged = true;
				Logger.getLogger("access.valid").log(Level.SEVERE, "Valid access to data base.");
			} else {
				Logger.getLogger("access.invalid").log(Level.SEVERE, "Invalid access to data base.");
				throw new RuntimeException("Wrong password. Try again.");
			}
		} else {
			Logger.getLogger("access.active").log(Level.SEVERE, "You're already logged in.");
			throw new RuntimeException("You're already logged in.");
		}
	}

	public void logOut() {
		if(this.isLogged()) {
			Logger.getLogger("access.logOut").log(Level.SEVERE, "Session logged out.");
			this.isLogged = false;
		} else {
			Logger.getLogger("access.InvalidLogOut").log(Level.SEVERE, "Not logged in.");
			throw new RuntimeException("Not logged in. Please log in first.");
		}
	}

}
