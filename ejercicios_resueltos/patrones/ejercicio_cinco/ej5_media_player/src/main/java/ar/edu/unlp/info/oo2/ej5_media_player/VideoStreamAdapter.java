package ar.edu.unlp.info.oo2.ej5_media_player;

public class VideoStreamAdapter extends Media {

	@Override
	public void play() {
		VideoStream stream = new VideoStream();
		stream.reproduce();
	}
	
}
