package model;

import java.util.ArrayList;

import model.dao.Demojbc;

public class Map {
	
	
	
	 Map () 
	{
		rechercherBdd(); 
	}
	
	
	 private static ArrayList<Objets> ellement = new ArrayList<Objets>();
	 
	 /* (non-Javadoc)
	 * @see model.IMap#obj(int, int, int)
	 */
	public static void obj(int lx, int ly, int lo)
		{   
			
			
			System.out.print(lo);
			System.out.print(lx);
			System.out.println(ly );
			
			if ( lo == 1 )
			{
				
				
				ellement.add(new Cailloux(lx, ly));
				 System.out.println("plop");
			}
			
			 else if ( lo == 2)
			{
				ellement.add(new Diamants (lx, ly));
				System.out.println("hey");
			}
	
		}
	
	
	
	/* (non-Javadoc)
	 * @see model.IMap#rechercherBdd()
	 */
	public void rechercherBdd ()
	{
		 Demojbc.LireEnBase();
	}



	/* (non-Javadoc)
	 * @see model.IMap#getEllement()
	 */





	
}
