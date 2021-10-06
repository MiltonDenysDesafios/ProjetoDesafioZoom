package core;

import org.openqa.selenium.By;

public class BasePage {
	
	/********* Utils ************/
	public static void openHomePage(String url) {
		DriverFactory.getDriver().get(url);
	}
	
	
	/********* Write ************/
	
	public static void write(By by, String texto) {
		DriverFactory.getDriver().findElement(by).clear();
		DriverFactory.getDriver().findElement(by).sendKeys(texto);
	}

	public void write(String id_campo, String texto) {
		write(By.id(id_campo), texto);
	}

	/********* Click ************/

	public static void click(By by) {
		DriverFactory.getDriver().findElement(by).click();
	}

	/********* Text ************/

	public static String obterTexto(By by) {
		return DriverFactory.getDriver().findElement(by).getText();
	}

	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}

	public static String replaceString(String nome, String de, String para) {
		String texto = nome;
		String correctedText = texto.replace(de, para);
		return correctedText;

	}
}
