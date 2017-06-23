package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.Personage;

public class KeyEven implements KeyListener{	

	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_RIGHT && Personage.getPersox() < Fenetre.fenWidth - 16) {
			Personage.setPersox (Personage.getPersox() +16);
			Personage.setDirection("RIGHT") ;
			
		}

		if (e.getKeyCode() == KeyEvent.VK_DOWN && Personage.getPersoy() < Fenetre.fenHeight - 16) {
			Personage.setPersoy(Personage.getPersoy() +16);
			Personage.setDirection("DOWN") ;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_LEFT && Personage.getPersox() > 0) {
			Personage.setPersox(Personage.getPersox()-16); 
			Personage.setDirection("LEFT") ;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_UP && Personage.getPersoy() > 0) {
			Personage.setPersoy(Personage.getPersoy() -16);
			Personage.setDirection("UP") ;
			
			//nughuoijphbugouohouh
			
			
			
			
		}
		
		

	}


	public void keyReleased(KeyEvent e) {
		Personage.setDirection("NULL") ;
	}
	
	//Personage.setDirection("NULL");

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
		
}
