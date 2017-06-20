package model;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Cailloux extends Objets
{
	
	private ImageIcon icoPierre;

	private Image imgPierre;
	
	
	
	
public Cailloux(int x, int y ) 
{
	

	icoPierre = new ImageIcon(getClass().getResource("/image/pierre.jpg"));
	this.imgPierre = this.icoPierre.getImage();
	
	
	
	
}




public Image getImgPierre() {
	return imgPierre;
}
	

	

}
