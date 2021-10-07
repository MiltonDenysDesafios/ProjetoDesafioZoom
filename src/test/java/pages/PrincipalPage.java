package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;

public class PrincipalPage extends BasePage{
	private String retornoProduto;

	
	public static void homePage() {
		try {
			openHomePage("https://www.zoom.com.br");
		} catch (Exception e) {
			
		}
	}
	public static void buscaProduto(String buscaProdutoParam){
		try{
			write(By.xpath("//input[@type='search']"), buscaProdutoParam);
		}catch(Exception e){
			System.err.print("Elemento não encontrado");
		}
		}
	public static void clicarIconeBusca() {
		try {
			click(By.xpath("//button[@class='search-bar__submit-button']"));
		} catch (Exception e) {
			System.err.print("Elemento não encontrado");
		}
	}
	public static void validarProduto(String retornoProduto) {
		try {
			String produtoRetornado = obterTexto(By.xpath("//h1[@class='SearchHeader_title__2hI7I']"));
			Assert.assertEquals(retornoProduto, produtoRetornado);
		} catch (Exception e) {
			System.err.print("Elemento não encontrado");
		}
	}
	
}
