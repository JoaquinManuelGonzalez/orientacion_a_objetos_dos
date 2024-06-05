package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {

	
	
	public static void main(String[] args) throws SecurityException, IOException {
		FileHandler handler = new FileHandler("model.txt");
		handler.setFormatter(new ShoutingFormatter());
		Logger.getLogger("app.model").setLevel(Level.WARNING);
		Logger.getLogger("app.model").addHandler(handler);
		
		FileHandler handler2 = new FileHandler("ui.txt");
		handler2.setFormatter(new JSONFormatter());
		Logger.getLogger("app.ui").setLevel(Level.INFO);
		Logger.getLogger("app.ui").addHandler(handler2);
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Logger.getLogger("app.ui").log(Level.INFO, "APP iniciada.");
				new WallPostUI();
			}
		});
	}

}
