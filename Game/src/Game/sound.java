package Game;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;


public class sound {
	 
	AudioClip clip;
	public static final sound beat=new sound("beat.wav");	
	public static final sound level=new sound("bubble4.wav");
	public static final sound clear=new sound("clear-button.wav");	
	public static final sound help=new sound("help-button.wav");
	public static final sound counter=new sound("counter-click.wav");	
	public static final sound end1=new sound("Faded.wav");
	public static final sound end2=new sound("applause7.wav");
	public static final sound end3=new sound("Home_Run.wav");	




	public sound(String filename) {
		try{
		clip=Applet.newAudioClip(sound.class.getResource(filename));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void loop(){

		try{
		new Thread(){
			
			public void run(){
				clip.loop();}
			
		}.start();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

	public void play(){

		try{
		new Thread(){
			
			public void run(){
				clip.play();}
			
		}.start();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	public void stop() {
			clip.stop();
		
	}

	
	
	}

