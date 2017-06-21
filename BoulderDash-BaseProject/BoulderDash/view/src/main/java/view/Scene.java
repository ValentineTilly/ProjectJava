package view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import model.dao;

public class Scene  extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4866890461340317485L;
	private ImageIcon perso; 
	// on récupère l'image du perso 
	private Image  imgperso;
	// imgperso récupérera perso 
	
	private Image imgennemi;
	
	private static int  persox = 200; 
	private static int persoy = 200; 
	
	public static int ennemix = 100; 
	public static int ennemiy = 100; 
	

	private int mapx;
	private int mapy; 
	

	public Scene() {
		super();
		perso = new ImageIcon(getClass().getResource("/name/go.PNG"));
		this.imgperso = this.perso.getImage();

		this.imgennemi = this.perso.getImage();
	}
	
		
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawImage(imgperso, persox, persoy, null);
		g.drawImage(imgennemi, ennemix, ennemiy, null); 
		
		g.drawString("Diamant" + CompteurDiamant.getNombreDiamant(), 600, 10);
		repaint();
	}
	
		
	

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
	


