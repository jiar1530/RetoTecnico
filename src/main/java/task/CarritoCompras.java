package task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.not;

import java.util.List;

import org.hamcrest.Matcher;
import org.openqa.selenium.Keys;

import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.statematchers.IsVisibleMatcher;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import pages.PlazaHome;

public class CarritoCompras implements Task {
	private String producto;
	private String Nombre;
    private String Apellido;
    private String Documento_Identidad;
    private String Telefono_Movil;
    

   public CarritoCompras (String nombre, String Apellido, String Documento_Identidad, String Telefono_Movil) {
			this.Nombre = nombre;
			this.Apellido = Apellido;
			this.Documento_Identidad = Documento_Identidad; 
			this.Telefono_Movil = Telefono_Movil;

		}
	
	public CarritoCompras(String producto, String destino) {
		this.producto = producto;
	
		}

	@Override
	@Step("{0} seleccion producto")
	
	
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(PlazaHome.PRODUCTO()));
		
	}
		
		
	
	private <T extends WebElementState> Matcher<T> isVisible() {
        return new IsVisibleMatcher();
    }
	

	public static Performable with(List<String> list) {
		String producto, destino;
		producto = list.get(2).toString();
		destino = list.get(3).toString();
		return instrumented(CarritoCompras.class, producto, destino);
	}
}
