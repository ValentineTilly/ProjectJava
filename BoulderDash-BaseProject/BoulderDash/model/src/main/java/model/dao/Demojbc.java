package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class Demojbc {



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
	 */
	public static void LireEnBase() {

		String url = "jdbc:mysql://localhost/formation";
		String login = "root";
		String passwd = "";
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");

			cn = DriverManager.getConnection(url, login, passwd);

			st = cn.createStatement();

			String sql = "SELECT * FROM test";

			rs = st.executeQuery(sql);
			ResultSetMetaData resultMeta = rs.getMetaData();

			/*
			 * for(int i = 1; i <= resultMeta.getColumnCount(); i++)
			 * 
			 * System.out.print( resultMeta.getColumnName(i).toUpperCase() );
			 * 
			 * System.out.println("\n");
			 */

			while (rs.next()) {

				for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
					//
					
					if (rs.getInt(i) == 1) {
						System.out.print("p");
					} else {
						System.out.print(rs.getInt(i));
					}
					
				}

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

