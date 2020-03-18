package stepsDefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.not;

import java.util.List;

import org.hamcrest.Matcher;
import org.openqa.selenium.remote.server.handler.SendKeys;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pages.PlazaHome;
import questions.ComprarQuestion;
import task.CarritoCompras;
public class PlazaVeaStepDefinitions {
	PlazaHome plazaHome;

	@Before
	public void set_the_stage() {
		OnStage.setTheStage(new OnlineCast());
	}

	
	@Given("^Que estoy en plaza\\.com$")
	public void que_estoy_en_plaza_com() throws Throwable {
		theActorCalled("Cliente").attemptsTo(Open.browserOn().the(plazaHome));
		(plazaHome.getDriver()).manage().window().maximize();
		(plazaHome.getDriver()).manage().deleteAllCookies();
		
	}

	@When("^Realizo la compra de producto con los siguientes datos$")
	public void realizo_la_reserva_de_tiquetes_con_los_siguientes_dato(List<String> list) throws Throwable {
		theActorInTheSpotlight().attemptsTo(Click.on(plazaHome.PRODUCTO()),
											(Click.on(plazaHome.Tv())),
											(Click.on(plazaHome.CARRITO())),
		                                    (Click.on(plazaHome.AGREGARCARRITO())),
		                                    (Click.on(plazaHome.BOTONCONTINUARPAGO())),
		                                    (Click.on(plazaHome.BOTONCONFIRMARPAGO())));
		                                       
		                                                               	
	}

	@Then("^Estoy en la pagina para confirmar datos$")
	public void puedo_hacer_la_compra() throws Throwable {
		theActorInTheSpotlight().attemptsTo(Enter.theValue("retornomedieval@gmail.com").into(plazaHome.INGRESARCORREO()),
				(Click.on(plazaHome.ACEPTOPOLITICA())),
				(Click.on(plazaHome.CONTINUAREGISTRO())));
		        
		
		/*theActorInTheSpotlight().should(
                seeThat("COnfirmacion page", ComprarQuestion.continuar(), isPresent()));*/
	}

	private Matcher<String> isPresent() {
        return not(isEmptyString());
    }
	
}
