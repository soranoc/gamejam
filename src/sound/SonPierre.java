package sound;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class SonPierre extends Thread {
	private URL url;
	private AudioClip sound;
	
	public SonPierre(){
		url = this.getClass().getClassLoader().getResource("./res/sons/son_pierre.wav");
		sound = Applet.newAudioClip(url);
	}
	
	public void jouer(){
		sound.play();
	}
	
	public void jouerEnBoucle(){
		sound.loop();
	}
	
	public void arreter(){
		sound.stop();
	}
}
