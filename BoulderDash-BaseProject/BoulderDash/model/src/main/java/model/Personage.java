package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Personage extends Object {
	private int largeur, hauteur; 
	private static int persox = 224; 
	private static int persoy = 224; 
	
	private static boolean marche;
	private boolean versDroite;
	private boolean versGauche; 
	public int compteur; 
	private int valentinelade;
	
	public static String direction = "UP";
	private ImageIcon perso; 
	
	public Image  imgperso;
	
	public Personage() 
	{
		this.compteur = 0 ; 
		this.marche = false;
		this.versDroite = false;
		this.versGauche = false ; 
		
		
		
		
		
		
		
		
			/*perso = new ImageIcon(getClass().getResource("/name/dd1.png"));
	this.imgperso = this.perso.getImage();*/
	
		
	
		
		
	}
	

	 // public void
	
	
	
	
	
	
	@SuppressWarnings({ "unused", "unused" })
	public   Image marche() {
		
	
	
	
	 if  ( direction =="RIGHT")
	{
		perso = new ImageIcon(getClass().getResource("/name/dd1.png"));
		this.imgperso = this.perso.getImage();
	}
	
	else if  ( direction =="LEFT")
	{
		perso = new ImageIcon(getClass().getResource("/name/dg1.png"));
		this.imgperso = this.perso.getImage();
	}
	 
	else if ( direction =="UP")
	{
		perso = new ImageIcon(getClass().getResource("/name/dhd.png"));
		this.imgperso = this.perso.getImage();
	}
	else if ( direction =="DOWN")
	{
		perso = new ImageIcon(getClass().getResource("/name/dbg.png"));
		this.imgperso = this.perso.getImage();
	}
	 
	 
	else if ( direction == "NULL")
	{

		perso = new ImageIcon(getClass().getResource("/name/pi.png"));
this.imgperso = this.perso.getImage();

	}
	return imgperso;
	
	}
	
	
	
		
	
	


	private int getLargeur() {
		return largeur;
	}


	private void setLargeur(int largeur) {
		this.largeur = largeur;
	}


	private int getHauteur() {
		return hauteur;
	}


	private void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}




	private boolean isMarche() {
		return marche;
	}


	public  void setMarche(boolean marche) {
		marche = marche;
	}


	private boolean isVersDroite() {
		return versDroite;
	}


	public  void setVersDroite(boolean versDroite) {
		versDroite = versDroite;
	}


	private boolean isVersGauche() {
		return versGauche;
	}


	public  void setVersGauche(boolean versGauche) {
		this.versGauche = versGauche;
	}


	private int getCompteur() {
		return compteur;
	}


	private void setCompteur(int compteur) {
		this.compteur = compteur;
	}
	
	public static int getPersox() {
		return persox;
	}


	public static void setPersox(int persox) {
		Personage.persox = persox;
	}


	public static int getPersoy() {
		return persoy;
	}


	public static void setPersoy(int persoy) {
		Personage.persoy = persoy;
	}









	private String getDirection() {
		return direction;
	}









	public static void setDirection(String direction) {
		Personage.direction = direction;
	}


}
