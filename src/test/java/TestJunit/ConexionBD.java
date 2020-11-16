package TestJunit;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {

	Connection conn;
	
	public ConexionBD() {
		
	}
	
	
    public Connection ConectarBD(String username,String password,String url) {

    	try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,username,password);
    		System.out.println("Conexion a BD exitosa DriverManager.getConnection = "+ conn);
    	}catch(Exception ex) {
    		System.out.println("Ocurrio una excepcion en el proceso, la Causa = " + ex.getCause() + 
    				"\nDriverManager.getConnection = "+ conn);
    	}
    	
     return conn;	
    }	
	
	
}
