package com.automatizacion;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PortafolioTest {

	
	private WebDriver driver;
	By serviciosLinkLocator =By.linkText("Servicios");
	By registerPAgeLocator =By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/presentacion.png' ]");
	By ServiciosPageLocator =By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/investigacion.png']");
	By portafolioLinkLocator =By.xpath("//img[@href='https://www.choucairtesting.com/servicio/#portafolio']");
	
	By PortafolioNameLocator = By.className("elementor-animation-grow");
	
	@Before 
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","./src/test/resources/ChromeDriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com");
		
	
	}
	
	@Test
	public void Portafolio ()throws InterruptedException {
		driver.findElement(serviciosLinkLocator).click();
		System.out.println("Direcciona a la pagina servicios");
		if (driver.findElement(registerPAgeLocator).isDisplayed()) {
			
			System.out.println("Verifica que este en servicios al revisar la url del banner");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("scroll(0,125);");
			Thread.sleep(2000);
			driver.findElement(registerPAgeLocator).click();
			Thread.sleep(1000);
			System.out.println("Hace click en 'Portafolio de Soluciones'");
			
		}
		else { System.out.println("NO te encuentras en la pagina servicios");}
	}
	
	
	/*@After
	public void tearDown() {
		driver.quit();
		}*/
}

