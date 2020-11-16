
package StepDefinition;

import java.sql.DriverManager;
import java.sql.Connection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//import TestRunner.abrir_navegador;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;


public class Steps {
	Connection connection;
	WebDriver driver;

	@Given("abrir navegador")
	public void abrir_navegador() {

		System.out.println("\nAbre el navegador URL: 'http://localhost:8081/registroMascotaWeb/login.jsp'");
		System.setProperty("web.driver.chrome", "C:\\Users\\pablo\\OneDrive\\Documentos\\Iplacex\\8vo bimestre\\Integracion Continua\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8081/registroMascotaWeb/login.jsp");
	}

	@When("ingresa Username {string} y Password {string}") 
	public void ingresa_Username_y_Password(String string, String string2) { 
	
		System.out.println("En este paso ingresa las credenciales de usuario"); 
		driver.findElement(By.id("username:userName")).sendKeys(string);
		driver.findElement(By.id("password:password")).sendKeys(string2);

	}

	@Then("inicia sesion")
	public void inicia_sesion() {
	    
		System.out.println("Intenta iniciar sesion mediante el boton Login");
		driver.findElement(By.id("ingresar:ingresar")).click();
		
	}
	
	@When("Agenda Hora rut={string} nombre={string} apellido={string} direccion={string} email={string} telefono={string} nombreMascota={string} tipoMascota={string} edad={string} hora={string} fecha={string}")
	public void Agenda_hora(String string1, String string2,String string3, String string4,
			                String string5, String string6,String string7, String string8,
			                String string9, String string10,String string11 ) {
		
		driver.findElement(By.id("rut:rut")).sendKeys(string1);
		driver.findElement(By.id("nombre:nombre")).sendKeys(string2);
		
		driver.findElement(By.id("apellido:apellido")).sendKeys(string3);
		driver.findElement(By.id("direccion:direccion")).sendKeys(string4);

		driver.findElement(By.id("email:email")).sendKeys(string5);
		driver.findElement(By.id("telefono:telefono")).sendKeys(string6);

		driver.findElement(By.id("nombreMascota:nombreMascota")).sendKeys(string7);
		driver.findElement(By.id("tipoMascota:tipoMascota")).sendKeys(string8);	
		
		driver.findElement(By.id("edad1:edad")).sendKeys(string9);
		driver.findElement(By.id("hora:hora")).sendKeys(string10);

		driver.findElement(By.id("fecha:fecha")).sendKeys(string11);
		
		
		
		
	}
	
	@Then("Reservar Hora")
	public void reservar_hora() {
	    
		driver.findElement(By.id("registrar:registrar")).click();
		
	}
	
	
	@And("Cerrar navegador")
	public void cerrar_navegador() {
		System.out.println("Cerrar el navegador");
		driver.quit();

	}
	
	@When("Probar conexion BD {string}")
	public void conexionBD(String url) {
		
		try {
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.getConnection(url,"root","root");		
        System.out.println("OK");
		}catch(Exception ex) {
			System.out.println("FALLO");
		}
		
	}

}