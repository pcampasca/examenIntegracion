package TestJunit;

import junit.framework.TestCase;

public class TestConexionBD extends TestCase {
	
	private TestJunit.ConexionBD conn;
	
	public void IniciarTest() {		
      conn = new TestJunit.ConexionBD();
	}

	public void testConectarMySql1() {
		System.out.println("Conexion a MySql 4 - URL: '' USER: '' PASS: ''");
    	IniciarTest();
    	assertTrue(conn.ConectarBD("","","")== null);
    	System.out.println("\n");
    }
	
	public void testConectarMySql2() {
    	IniciarTest();
    	System.out.println("Conexion a MySql 3 - URL: 'jdbc:mysql://localhost:3306' USER: '' PASS: ''");
    	assertTrue(conn.ConectarBD("","","jdbc:mysql://localhost:3306")== null);
    	System.out.println("\n");
    }	

	public void testConectarMySql3() {
    	IniciarTest();
    	System.out.println("Conexion a MySql 2 - URL: 'jdbc:mysql://localhost:3306' USER: 'user' PASS: 'pass'");
    	assertTrue(conn.ConectarBD("user","pass","jdbc:mysql://localhost:3306")== null);
    	System.out.println("\n");
    }		
		
	public void testConectarMySql4() {
    	IniciarTest();
    	System.out.println("Conexion a MySql 1 - URL: 'jdbc:mysql://localhost:3306' USER: 'root' PASS: 'root'");
    	assertTrue(conn.ConectarBD("root","root","jdbc:mysql://localhost:3306")!= null);
    	System.out.println("\n");
    }	
	
}
