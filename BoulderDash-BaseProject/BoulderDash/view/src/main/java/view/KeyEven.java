package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEven implements KeyListener{	

	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_RIGHT && Scene.getPersox() < Fenetre.fenWidth - 16) {
			Scene.setPersox (Scene.getPersox() +16);
			Scene.direction = "RIGHT";
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN && Scene.getPersoy() < Fenetre.fenHeight - 16) {
			Scene.setPersoy(Scene.getPersoy() +16); 
			Scene.direction = "DOWN";
		}
		
		if (e.getKeyCode() == KeyEvent.VK_LEFT && Scene.getPersox() > 0) {
			Scene.setPersox(Scene.getPersox()-16); 
			Scene.direction = "LEFT";
		} 
		
		if (e.getKeyCode() == KeyEvent.VK_UP && Scene.getPersoy() > 0) {
			Scene.setPersoy(Scene.getPersoy() -16);
			Scene.direction = "UP";
		}
		
		
		

	}


	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub==
		
	}


	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
		
}
