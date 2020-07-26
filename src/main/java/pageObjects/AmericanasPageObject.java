package pageObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmericanasPageObject {

	public WebDriver driver;
	public WebElement element;
	
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public void buscaProduto(String produto) {
		WebElement searchInput = driver.findElement(By.id("h_search-input"));
		searchInput.sendKeys(produto);
		searchInput.submit();
	}
	
	public void validaBusca(String produto) {
		WebElement nameSearch = driver.findElement(By.xpath("//*[@id=\"content-middle\"]/div[1]/div/div/h1"));
		assertEquals(nameSearch.getText().toUpperCase(), produto.toUpperCase());	
	}
	
	public void escolheItem() throws InterruptedException{
		WebElement item = driver.findElement(By.xpath("//*[@id=\'content-middle\']/div[6]/div/div/div/div[1]/div[1]/div/div[2]/a/section/div[1]"));
		Thread.sleep(2000);
		item.click();
	}
	
	public void selectItem() throws InterruptedException {
		Thread.sleep(2000);
		WebElement btnadicona = driver.findElement(By.id("btn-buy"));
		btnadicona.click();
		
		Thread.sleep(2000);
		WebElement btncontinuar = driver.findElement(By.id("btn-continue"));
		btncontinuar.click();
		
		WebElement minhacesta = driver.findElement(By.xpath("//*[@id=\"app\"]/section/section/header/h2"));
				
		assertEquals(minhacesta.getText().toUpperCase(), "minha cesta".toUpperCase());	
	}
	
	public void validaCarrinho(String produto) {
		WebElement compra = driver.findElement(By.xpath("//*[@id=\'app\']/section/section/div[1]/section/ul/li/div[2]/div[1]"));
		assertTrue(compra.getText().toUpperCase().contains(produto.toUpperCase()));
		
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}
