package model;

import java.util.ArrayList;

import model.dao.Demojbc;

public class Map {
	
	
	
	 Map () 
	{
		rechercherBdd(); 
	}
	
	
	public static ArrayList<Objets> ellement = new ArrayList<Objets>();
	 public  static int map2[] [] = new int[35][35];
	 
	 /* (non-Javadoc)
	 * @see model.IMap#obj(int, int, int)
	 */
	public static ArrayList obj(int lx, int ly, int lo)
		{   
			
			
			System.out.print(lo+ " ");
			System.out.print(lx+ " ");
			System.out.println(ly+" " );
			
			map2 [lx] [ly] = lo;
			
			if ( lo == 0 )
			{
				
				
				ellement.add(new Mur(lx, ly, lo));
				
			}
			
			 else if ( lo == 1)
			{
				ellement.add(new Sol (lx, ly, lo ));
				
			
			}
			 else if ( lo == 2)
				{
					ellement.add(new Cailloux (lx, ly, lo ));
					
				
				}
			
			 else if ( lo == 3)
				{
					ellement.add(new Diamants (lx, ly, lo ));
					
				
				}
			 else if ( lo == 4)
				{
					ellement.add(new Tp (lx, ly, lo ));
					
				
				}
			
			 else if ( lo == 5)
				{
					ellement.add(new Monstre (lx, ly, lo ));
					
				
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













	public static int[][] getMap2() {
		return map2;
	}













	public static void setMap2(int[][] map2) {
		Map.map2 = map2;
	}













	













	


	/* (non-Javadoc)
	 * @see model.IMap#getEllement()
	 */





	
}
