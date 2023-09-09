package com.Pruebas.SetpDefinition;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class Steps {
	private WebDriver driver;
	
	@Given("Abrir Chrome")
	public void abrirChrome() {
		System.out.println("Abre el navegador");
		System.setProperty("webdriver.chrome.driver", "D:\\Programas\\Workspace\\Test\\src\\main\\java\\com\\Pruebas\\Test\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8082/BancoPlatinum/");
	}
	@When("Ingresa Username {string} y Password {string}")
	public void IngresaUserPassword(String string, String string2) {
		System.out.println("Se ingresan las credenciales de usuario");
		
		WebElement txtUsername = driver.findElement(By.id("username"));
		WebElement txtPassword = driver.findElement(By.id("password"));
	  
		
		
		txtUsername.sendKeys(string);
		txtPassword.sendKeys(string2);
		
	}
	
	@Then("Inicia Sesion")
	public void IniciarSesion() {
		System.out.println("Se Ingresa al sitio con los datos ingresados en MyTest.feature");
		WebElement boton = driver.findElement(By.className("iniciarsesion"));
		boton.click();
		
		assertEquals("Listado de Usuarios", driver.getTitle());
	}
}



