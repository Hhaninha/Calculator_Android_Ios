package steps_definition;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.AppiumDriverHelper;
import screen.ContasScreen;

public class ContasSteps {
	
	ContasScreen screen;

	@Given("^que insiro os dois numeros$")
	public void que_insiro_os_dois_numeros() throws MalformedURLException {
		screen = new ContasScreen(AppiumDriverHelper.getAppiumDriver(System.getProperty("environment")));
		screen.inserirNumero("9");
		screen.inserirNumero2("1");
		screen.closeKeyboard();
	}

	@When("^tocar no sum$")
	public void tocar_no_sum() {
		screen.button_sum.click();
	}

	@Then("^devo ver o resultado da soma$")
	public void devo_ver_o_resultado_da_soma() {
		assertTrue(screen.Resultado().equals("10"));
	}

	@When("^tocar no subtract$")
	public void tocar_no_subtract()  {
		screen.button_sub.click();
	}

	@Then("^devo ver o resultado da subtração$")
	public void devo_ver_o_resultado_da_subtração()  {
		assertTrue(screen.Resultado().equals("8"));
	}

	@When("^tocar no divide$")
	public void tocar_no_divide() {
		screen.button_div.click();
	}

	@Then("^devo ver o resultado da divisão$")
	public void devo_ver_o_resultado_da_divisão()  {
		assertTrue(screen.Resultado().equals("9"));
	}

	@When("^tocar no multiply$")
	public void tocar_no_multiply() {
		screen.button_mult.click();
	}

	@Then("^devo ver o resultado da multiplicação$")
	public void devo_ver_o_resultado_da_multiplicação() {
		assertTrue(screen.Resultado().equals("9"));
	}

}
