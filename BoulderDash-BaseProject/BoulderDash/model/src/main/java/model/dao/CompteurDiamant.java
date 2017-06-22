package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CompteurDiamant extends AbstractDAO {

	
	private static int nombreDiamant = 0;
	
	public static int getNbrDiamants () throws SQLException {
    	String sql = "{call count_diamants()}"; 
    	CallableStatement callStatement = prepareCall(sql);
    	int nombreDiamant = 0;
    	
    	if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                for ( boolean isResultLeft = result.first() ; isResultLeft ; isResultLeft = result.next()) {
                	for (int i = 0; i < 5; i++) {
						if (result.getInt(i+1) == 2) {
							nombreDiamant++;
						}
					}
                }
            }
               result.close();
        }
     	return nombreDiamant;
    }
}
