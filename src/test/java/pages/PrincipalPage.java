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
			String produtoRetornado = obterTexto(By.xpath("//*[@id=\"pageSearchResultsBody\"]/div/div/div/div[1]/h1"));
			String produtoRetornado1 = obterTexto(By.xpath("//div[@id='pageSearchResultsBody']"));
			System.out.println(produtoRetornado1);
			Assert.assertEquals(retornoProduto, produtoRetornado);
		} catch (Exception e) {
			System.err.print("Elemento não encontrado");
		}
	}
	
}
