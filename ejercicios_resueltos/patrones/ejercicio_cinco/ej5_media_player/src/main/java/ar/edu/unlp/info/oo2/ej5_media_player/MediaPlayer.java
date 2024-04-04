package ar.edu.unlp.info.oo2.ej5_media_player;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	
	private List<MediaPlayer> media;
	
	public MediaPlayer() {
		this.media = new ArrayList<MediaPlayer>();
	}
	
	public void play() {
		this.media.stream()
		.forEach(media -> media.play());
	}
	
}
