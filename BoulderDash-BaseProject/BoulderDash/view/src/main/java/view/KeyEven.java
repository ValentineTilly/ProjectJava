package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEven implements KeyListener{	

	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_RIGHT && Scene.getPersox() < Fenetre.fenWidth - 55 
				&& CollisionRight()) {
			Scene.setPersox (Scene.getPersox() +16);
			}

		if (e.getKeyCode() == KeyEvent.VK_DOWN && Scene.getPersoy() < Fenetre.fenHeight - 55
				&& CollisionDown()) {
			Scene.setPersoy(Scene.getPersoy() +16); 
		}
		
		if (e.getKeyCode() == KeyEvent.VK_LEFT && Scene.getPersox() > 0
				&& CollisionLeft()) {
			Scene.setPersox(Scene.getPersox()-16); 
		} 
		
		if (e.getKeyCode() == KeyEvent.VK_UP && Scene.getPersoy() > 0
				&& CollisionUp()) {
			Scene.setPersoy(Scene.getPersoy() -16);
		}
		

	}
	
		

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub==
		
	}


	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	public boolean CollisionRight () {
		if ((Scene.getPersox() + 55 < Scene.ennemix 
				|| Scene.getPersox() > Scene.ennemix + 55) 
			&& (Scene.getPersoy() > Scene.ennemiy + 55 
				|| Scene.getPersoy() + 55 < Scene.ennemiy ))  {
			return true; 
		}
		else {
			return false; 
		}
	}
	
			
	
	public boolean CollisionDown () {
		if ((Scene.getPersoy() + 55 < Scene.ennemiy 
				|| Scene.getPersoy() > Scene.ennemiy + 55)
			&&(Scene.getPersox() + 55 < Scene.ennemix 
				|| Scene.getPersox() > Scene.ennemix + 55)) {
			return true; 
		}
		else {
			return false; 
		}
	}
	
	public boolean CollisionLeft () {
		if ((Scene.getPersox() > Scene.ennemix + 55
				|| Scene.getPersox() + 55 < Scene.ennemix) 
			&& (Scene.getPersoy() + 55 < Scene.ennemiy 
				|| Scene.getPersoy() > Scene.ennemiy + 55)) {
			return true; 
		}
		else {
			return false; 
		}
	} 
	

	public boolean CollisionUp () {
		if ((Scene.getPersoy() > Scene.ennemiy + 55 
				|| Scene.getPersoy() + 55 < Scene.ennemiy)
			&& (Scene.getPersox() > Scene.ennemix + 55
				|| Scene.getPersox() + 55 < Scene.ennemix)){
			return true; 
		}
		else {
			return false; 
		}
	} 
	
	
		
}
