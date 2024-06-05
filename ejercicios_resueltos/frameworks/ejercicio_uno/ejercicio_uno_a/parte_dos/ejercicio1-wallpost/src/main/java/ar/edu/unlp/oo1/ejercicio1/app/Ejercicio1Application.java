package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {

	
	
	public static void main(String[] args) throws SecurityException, IOException {
		
		Logger.getLogger("app.model").setLevel(Level.WARNING);
		Logger.getLogger("app.model").addHandler(new FileHandler("model.txt"));
		
		Logger.getLogger("app.ui").setLevel(Level.INFO);
		Logger.getLogger("app.ui").addHandler(new FileHandler("ui.txt"));
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Logger.getLogger("app.ui").log(Level.INFO, "APP iniciada.");
				new WallPostUI();
			}
		});
	}

}
