package pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://tienda.plazavea.com.pe/")
public class PlazaHome extends PageObject {
	
	
	public static final Target PRODUCTO() {
		return Target.the("producto")
	             .located(By.xpath("//*[@id=\"homepage\"]/section[1]/div[1]/a/h6"));
			}	
	
	public static final Target Tv() {
		return Target.the("tv")
	             .located(By.xpath("//*[@id=\"section-televisores\"]/div[2]/div[1]/a/div/img"));
			}
	
	public static final Target CARRITO() {
		return Target.the("carrito")
	             .located(By.xpath("//*[@id=\"ProductCard__add-to-cart\"]"));
	
	}
		
	public static final Target AGREGARCARRITO() {
		return Target.the("agregar_carrito")
	             .located(By.xpath("/html/body/div[3]/header/div[1]/section[3]/div/div[1]/div[1]"));	
	}
	public static final Target BOTONCONTINUARPAGO() {
		return Target.the("boton_continuar_pago")
	             .located(By.xpath("/html/body/div[3]/header/div[1]/section[3]/div/div[1]/div[2]/div/div[2]/div[3]/div[4]/button"));
		
	}
	
	public static final Target BOTONCONFIRMARPAGO() {
		return Target.the("boton_confirmar_pago")
	             .located(By.xpath("//*[@id=\"cart-to-orderform\"]"));
		
	}
	
	public static final Target INGRESARCORREO () {
		return Target.the("ingresar_correo")
	             .located(By.xpath("//*[@id=\"client-pre-email\"]"));
		 
	}
	
	public static final Target CONTINUAREGISTRO() {
		return Target.the("continuar_registro")
	             .located(By.xpath("//*[@id=\"btn-client-pre-email\"]/span"));
		 
	}
	
	public static final Target ACEPTOPOLITICA() {
		return Target.the("acepto_politica")
	             .located(By.xpath("//*[@id=\"term\"]"));
		 
	}
	
	
}
