package model;

import java.util.ArrayList;

import model.dao.Demojbc;

public class Map {
	
	
	
	 Map () 
	{
		rechercherBdd(); 
	}
	
	
	 private static ArrayList<Objets> ellement = new ArrayList<Objets>();
	 public  static int map2[] [] = new int[16][16];
	 
	 /* (non-Javadoc)
	 * @see model.IMap#obj(int, int, int)
	 */
	public static ArrayList obj(int lx, int ly, int lo)
		{   
			
			
			System.out.print(lo);
			System.out.print(lx);
			System.out.println(ly );
			
			map2 [lx] [ly] = lo;
			
			if ( lo == 1 )
			{
				
				
				ellement.add(new Cailloux(lx, ly, lo));
				 System.out.println("plop");
			}
			
			 else if ( lo == 2)
			{
				ellement.add(new Diamants (lx, ly, lo ));
				System.out.println("hey");
			}
			
			
			
	return ellement;
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
