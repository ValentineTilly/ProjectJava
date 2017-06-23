package model;

import java.awt.Image;



public abstract class Objets {

	
public int lx;
public int ly ;
public int lo ;


protected boolean  pull;

protected boolean fall;



	
	
	
public Objets(int lx, int ly, int lo)

{
	this.lx =lx; 
	this.ly=ly;
	this.lo=lo; 
	
	
	
	
}







/* (non-Javadoc)
 * @see model.IObjet#getXo()
 */









/* (non-Javadoc)
 * @see model.IObjet#getYo()
 */






/* (non-Javadoc)
 * @see model.IObjet#isPull()
 */

public boolean isPull() {
	return pull;
}






/* (non-Javadoc)
 * @see model.IObjet#setPull(boolean)
 */

public void setPull(boolean pull) {
	this.pull = pull;
}


/* (non-Javadoc)
 * @see model.IObjet#getImgPierre()
 */




/* (non-Javadoc)
 * @see model.IObjet#isFall()
 */

public boolean isFall() {
	return fall;
}






/* (non-Javadoc)
 * @see model.IObjet#setFall(boolean)
 */

public void setFall(boolean fall) {
	this.fall = fall;
}
	
	
}
