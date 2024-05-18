package ar.edu.unlp.info.oo2.ej20_FiltrosDeImagenes.imageFilters;

import java.awt.image.BufferedImage;

public class Monochrome extends Filter {

	@Override
	public BufferedImage filter(BufferedImage image) {
		int width = image.getWidth();
	    int height = image.getHeight();

	    for (int y = 0; y < height; y++) {
	      for (int x = 0; x < width; x++) {
	        int pixel = image.getRGB(x, y);
	        int alpha = (pixel >> 24) & 0xff;
	        int red = (pixel >> 16) & 0xff;
	        int green = (pixel >> 8) & 0xff;
	        int blue = pixel & 0xff;

	        int avg = (red + green + blue) / 3;
	        pixel = (alpha << 24) | (avg << 16) | (avg << 8) | avg;
	        image.setRGB(x, y, pixel);
	      }
	    }
	    
	    return image;
	}

}
