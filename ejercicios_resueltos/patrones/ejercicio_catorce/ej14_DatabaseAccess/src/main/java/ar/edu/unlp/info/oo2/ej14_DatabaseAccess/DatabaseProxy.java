package ar.edu.unlp.info.oo2.ej14_DatabaseAccess;

import java.util.Collection;
import java.util.List;

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
			return this.getRealAccess().getSearchResults(queryString);
		} else {
			throw new RuntimeException("Please log in first.");
		}
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(this.isLogged) {
			return this.getRealAccess().insertNewRow(rowData);
		} else {
			throw new RuntimeException("Please log in first.");
		}
	}
	
	public void login(String password) {
		if(!this.isLogged()) {
			if(this.getPassword().equals(password)) {
				this.isLogged = true;
			} else {
				throw new RuntimeException("Wrong password. Try again.");
			}
		} else {
			throw new RuntimeException("You're already logged in.");
		}
	}

	public void logOut() {
		if(this.isLogged()) {
			this.isLogged = false;
		} else {
			throw new RuntimeException("Not logged in. Please log in first.");
		}
	}

}
