package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Scene  extends JPanel implements KeyListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4866890461340317485L;
	private ImageIcon perso; 
	// on récupère l'image du perso 
	private Image  imgperso;
	// imgperso récupérera perso 
	
	
	private int persox = 200; 
	private int persoy = 200; 
	
	private int mapx;
	private int mapy; 
	

	public Scene() {
		super();
		perso = new ImageIcon(getClass().getResource("/name/go.PNG"));
		this.imgperso = this.perso.getImage();
	}
	
		
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawImage(imgperso, persox, persoy, null);
	}

	
	
	
	
	
	
	
	
	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			persox = persox+3;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			persoy = persoy+3; 
		}
		
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			persox = persox-3; 
		} 
		
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			persoy = persoy-3;
		}
		 
		repaint(); 
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub==
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
	


