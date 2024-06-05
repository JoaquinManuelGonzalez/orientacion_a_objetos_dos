package ar.edu.unlp.info.oo2.ej1_DatabaseAccessWithLog;

import java.util.Collection;
import java.util.List;
import java.util.logging.ConsoleHandler;
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
		ConsoleHandler handler = new ConsoleHandler();
		ConsoleHandler handler2 = new ConsoleHandler();
		handler.setFormatter(new JSONFormatter());
		handler2.setFormatter(new ShoutingFormatter());
		Logger.getLogger("access").setLevel(Level.SEVERE);
		Logger.getLogger("access").addHandler(handler);
		Logger.getLogger("insertions").setLevel(Level.WARNING);
		Logger.getLogger("insertions").addHandler(handler2);
		Logger.getLogger("searches").setLevel(Level.INFO);
		Logger.getLogger("searches").addHandler(handler);
		Logger.getLogger("searches").addHandler(handler2);
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
			Logger.getLogger("searches").log(Level.INFO, "Allowed searches in the data base.");
			return this.getRealAccess().getSearchResults(queryString);
		} else {
			Logger.getLogger("searches").log(Level.INFO, "Denied searches in the data base.");
			throw new RuntimeException("Please log in first.");
		}
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(this.isLogged) {
			Logger.getLogger("insertions").log(Level.WARNING, "Allowed insertions in the data base.");
			return this.getRealAccess().insertNewRow(rowData);
		} else {
			Logger.getLogger("insertions").log(Level.WARNING, "Denied insertions in the data base.");
			throw new RuntimeException("Please log in first.");
		}
	}
	
	public void login(String password) {
		if(!this.isLogged()) {
			if(this.getPassword().equals(password)) {
				this.isLogged = true;
				Logger.getLogger("access").log(Level.SEVERE, "Valid access to data base.");
			} else {
				Logger.getLogger("access").log(Level.SEVERE, "Invalid access to data base.");
				throw new RuntimeException("Wrong password. Try again.");
			}
		} else {
			Logger.getLogger("access").log(Level.SEVERE, "You're already logged in.");
			throw new RuntimeException("You're already logged in.");
		}
	}

	public void logOut() {
		if(this.isLogged()) {
			Logger.getLogger("access").log(Level.SEVERE, "Session logged out.");
			this.isLogged = false;
		} else {
			Logger.getLogger("access").log(Level.SEVERE, "Not logged in.");
			throw new RuntimeException("Not logged in. Please log in first.");
		}
	}

}
