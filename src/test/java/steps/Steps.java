package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PrincipalPage;

public class Steps {
	@Given("eu acesso a pagina principal") 
	   public void goToMainPage() { 
		PrincipalPage.homePage();
	   } 
		
	@When("preencho o campo de \"([^\"]*)\"$") 
	public void preencheCampoBusca (String produtoBusca){
		PrincipalPage.buscaProduto(produtoBusca);
	} 
	@And("clico no icone de busca") 
	public void clicarIconeBusca() {
		PrincipalPage.clicarIconeBusca();
	} 
	
	@Then("^valido se o \"([^\"]*)\" esta correto$")
	public void validaBuscaProduto() {
	   
	}
	   
   
}
