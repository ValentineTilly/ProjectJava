package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Scene  extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4866890461340317485L;
	private ImageIcon perso; 
	// on récupère l'image du perso 
	private Image  imgperso;
	// imgperso récupérera perso 
	
	private static int  persox = 200; 
	private static int persoy = 200; 
	

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
		repaint();
	}
	
	
	
	/*
	bool Collision (AABB box1, AABB box2) {
		
	}*/
	
	
	
	

	public static int getPersox() {
		return persox;
	}


	public static void setPersox(int persox) {
		Scene.persox = persox;
	}
	

	public static int getPersoy() {
		return persoy;
	}


	public static void setPersoy(int persoy) {
		Scene.persoy = persoy;
	}

	
}
	


