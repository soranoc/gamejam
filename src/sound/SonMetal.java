package sound;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class SonMetal extends Thread {
	private URL url;
	private AudioClip sound;
	
	public SonMetal(){
		url = this.getClass().getClassLoader().getResource("./res/sons/son_metal.wav"); 
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
