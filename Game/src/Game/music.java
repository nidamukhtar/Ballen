package Game;

import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class music {

	Clip clip;
	public void playBeat() throws LineUnavailableException, IOException{
	File soundFile = new File( "beat.wav" );
	AudioInputStream audioInputStream = null;
	try {
		audioInputStream = AudioSystem.getAudioInputStream( soundFile );
	} catch (UnsupportedAudioFileException | IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		clip = AudioSystem.getClip();
	} catch (LineUnavailableException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	clip.open(audioInputStream);
	clip.start();
}
}