package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Scene  extends JPanel{
	
	private ImageIcon perso; 
	
	private Image  imgperso;
	
	
	
	
	private int dx; 
	
	private int dy; 
	
	
	private int xpossition;
	
	private int ypossition; 
	
	
	
	public Scene() {
	
	super();
	
	perso = new ImageIcon(getClass().getResource("/name/go.PNG"));

	this.imgperso = this.perso.getImage();
	
	
	
	}
	
		
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics g2 = (Graphics2D) g;

		
	
		g2.drawImage(imgperso, 300, 245, null);

	
	}
	
	
	
}
	


