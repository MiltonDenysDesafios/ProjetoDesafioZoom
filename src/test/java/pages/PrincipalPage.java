package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BasePage;

public class PrincipalPage extends BasePage{

	
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
	
}
