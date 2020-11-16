package TestRunner;

import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//                  tags = {"@conectarBD","@cerrar_navegador","@reservar_hora","@abrir_navegador","@inicia_sesion","@ingresa_Username_y_Password","@Agenda_hora"},
//@SuppressWarnings("deprecation") //, strict = false, dryRun = false,monochrome = true
@RunWith(Cucumber.class)
@CucumberOptions(features="features",
                 glue= {"TestDefinition"}, strict = false, dryRun = false)

public class Runner {

}
