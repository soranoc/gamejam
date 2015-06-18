package sound;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class SonBranche extends Thread {
	private URL url;
	private AudioClip sound;

	public SonBranche() {
		url = this.getClass().getClassLoader()
				.getResource("./res/sons/branche_craque.wav");
		sound = Applet.newAudioClip(url);
	}

	public void jouer() {
		sound.play();
	}

	public void jouerEnBoucle() {
		sound.loop();
	}

	public void arreter() {
		sound.stop();
	}
}
