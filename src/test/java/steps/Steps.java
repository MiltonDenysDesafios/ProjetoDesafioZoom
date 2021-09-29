package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	@Given("eu acesso a pagina principal") 
	   public void goToFacebook() { 
	 
	   } 
		
	@When("^preencho o campo de \"([^\"]*)\"$") 
	public void preencheCampoBusca(String produtoBusca){
		System.out.println(produtoBusca.getClass());
	} 
	@And("clico no icone de busca") 
	public void clicarIconeBusca() {
    
	} 
	
	@Then("^valido se o \"([^\"]*)\" esta correto$")
	public void validaBuscaProduto() {
	   
	}
	   
   
}
