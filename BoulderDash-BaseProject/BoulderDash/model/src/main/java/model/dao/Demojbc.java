package model.dao;



import java.awt.Image;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import model.Map;
import model.Objets;



public class Demojbc {


	
	 public static int j;
	
	private  ImageIcon icopierre ;
	
	private   Image imgPierre;

	

	/*
	 * public static void sauverEnBase(String personne) {
	 * 
	 * String url = "jdbc:mysql://localhost/formation"; String login = "root";
	 * String passwd = ""; Connection cn = null; Statement st = null;
	 * 
	 * try {
	 * 
	 * Class.forName("com.mysql.jdbc.Driver");
	 * 
	 * cn = DriverManager.getConnection(url, login, passwd);
	 * 
	 * st = cn.createStatement();
	 * 
	 * //String sql = " INSERT INTO `javajbc` (`Personne`) VALUES ('" + personne
	 * + "')"; String sql =
	 * "CREATE TABLE utilisateur (nom VARCHAR(100),prenom VARCHAR(100))";
	 * st.executeUpdate(sql);
	 * 
	 * } catch (SQLException e) { e.printStackTrace();
	 * 
	 * } catch (ClassNotFoundException e) { e.printStackTrace();
	 * 
	 * } finally {
	 * 
	 * try { cn.close(); st.close(); } catch (SQLException e) {
	 * e.printStackTrace(); } }
	 * 
	 * }
	 * 
	 *
	 *
	 */
	 
	

	
	
	
	
	public static void LireEnBase() {

		String url = "jdbc:mysql://localhost/boulderdash";
		String login = "root";
		String passwd = "";
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");

			cn = DriverManager.getConnection(url, login, passwd);

			st = cn.createStatement();

			String sql = "SELECT * FROM  map3";

			rs = st.executeQuery(sql);
			ResultSetMetaData resultMeta = rs.getMetaData();

			/*
			 * for(int i = 1; i <= resultMeta.getColumnCount(); i++)
			 * 
			 * System.out.print( resultMeta.getColumnName(i).toUpperCase() );
			 * 
			 * System.out.println("\n");
			 */
			    j = 1;
			while (rs.next()) {
                    
				for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
					
					
			
					
				
					
					
					
				Map.obj(i,j,rs.getInt(i));
					
					
					
				}
				j++;
				System.out.println("\n");

			}
			
	
			
		
			
			

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} finally {

			try {
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}




	}




	
		
		/*if else ( lo == 0)
		{
			Sole sol = new Sole();
		}*/
		
	
	
	







