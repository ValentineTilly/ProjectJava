package view;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import model.IModel;
import model.Map;

import model.Personage;


public class Scene  extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4866890461340317485L;
	private ImageIcon persi; 
	
	private Image  imgpersi;
	
	public static String  direction ="ARRET"; 


	
	IModel model;
	
	
	
	private static int  persox = 224; 
	private static int persoy = 224; 
	

	private int mapx;
	private int mapy; 
	

	public Scene(IModel model) {
		super();
		persi = new ImageIcon(getClass().getResource("/name/image.png"));
		this.imgpersi = this.persi.getImage();
	
		this.model = model;
		 
	
		
		
	}
	
		
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.clearRect(0, 0, getWidth(), getHeight());
		
		 
		
		/*ArrayList <Objets> obj = new ArrayList<Objets>();
		obj = Map.obj*/
		
		//sw and sh are the width and height of sprite 
		//px and py are the position of your sprite in screen
		//i and j are the coordinates of the sprite  in the sheet that you want to paint
		
		int i =0;
		int j = 0;
		
		for (int j2 = 0; j2 < 31; j2++) {
			for (int k = 0; k < 31; k++)
			{
				j= 0 ;
				if (Map.map2[j2][k] == 0) {
					 i =0;
					
					g.drawImage(imgpersi, j2*16,k*16, j2*16+16, k*16+16, i*16, j*16, (i+1)*16, (j+1)*16, null);
				}
				
				else if (Map.map2[j2][k] == 1)
				{ i= 1;
				j = 0 ;
					g.drawImage(imgpersi, j2*16,k*16, j2*16+16, k*16+16, i*16, j*16, (i+1)*16, (j+1)*16, null);
				}
				
				else if (Map.map2[j2][k] == 2)
				{ 
					
				 i=3 ;
					g.drawImage(imgpersi, j2*16,k*16, j2*16+16, k*16+16, i*16, j*16, (i+1)*16, (j+1)*16, null);
				}
				else if (Map.map2[j2][k] == 3)
				{ 
				 i=4 ;
					g.drawImage(imgpersi, j2*16,k*16, j2*16+16, k*16+16, i*16, j*16, (i+1)*16, (j+1)*16, null);
				}
				else if (Map.map2[j2][k] == 4)
				{ 
				 j=1 ;
					g.drawImage(imgpersi, j2*16,k*16, j2*16+16, k*16+16, i*16, j*16, (i+1)*16, (j+1)*16, null);
				}
				else if (Map.map2[j2][k] == 5)
				{ 
				 j=3 ;
					g.drawImage(imgpersi, j2*16,k*16, j2*16+16, k*16+16, i*16, j*16, (i+1)*16, (j+1)*16, null);
				}
				
				j = 5;
				
			}
				if ( direction == "ARRET")
				{
				j= 5;
				
			
				g.drawImage(imgpersi, persox,persoy, persox+16, persoy+16, i*16, j*16, (i+1)*16, (j+1)*16, null);
				}
				else if (direction =="UP")
				{
					j =6 ;
					i = 3;
					g.drawImage(imgpersi, persox,persoy, persox+16, persoy+16, i*16, j*16, (i+1)*16, (j+1)*16, null);
				}
				
				else if (direction =="DOWN")
				{
					j =6 ;
					i= 1;
					g.drawImage(imgpersi, persox,persoy, persox+16, persoy+16, i*16, j*16, (i+1)*16, (j+1)*16, null);
				}
				else if (direction =="LEFT")
				{
					j =5 ; 
					i =2;
					g.drawImage(imgpersi, persox,persoy, persox+16, persoy+16, i*16, j*16, (i+1)*16, (j+1)*16, null);
				}
				else if (direction =="RIGHT")
				{
					j =5; 
					i= 3;
					g.drawImage(imgpersi, persox,persoy, persox+16, persoy+16, i*16, j*16, (i+1)*16, (j+1)*16, null);
				}
			
		}
		
		
		
		
		repaint();
	}
		
		//Demojbc.ellement
		
		
		
	
	
	
	
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
	


