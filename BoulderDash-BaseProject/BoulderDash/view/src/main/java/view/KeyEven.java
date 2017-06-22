package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.Personage;

public class KeyEven implements KeyListener{	

	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_RIGHT && Personage.getPersox() < Fenetre.fenWidth - 16) {
			Personage.setPersox (Personage.getPersox() +16);
		}

		if (e.getKeyCode() == KeyEvent.VK_DOWN && Personage.getPersoy() < Fenetre.fenHeight - 16) {
			Personage.setPersoy(Personage.getPersoy() +16); 
		}
		
		if (e.getKeyCode() == KeyEvent.VK_LEFT && Personage.getPersox() > 0) {
			Personage.setPersox(Personage.getPersox()-16); 
		} 
		
		if (e.getKeyCode() == KeyEvent.VK_UP && Personage.getPersoy() > 0) {
			Personage.setPersoy(Personage.getPersoy() -16);
		}
		

	}


	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub==
		
	}


	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
		
}
