package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AmericanasPageObject;


public class AmericanasSteps {
	public WebDriver driver;
	
	AmericanasPageObject pageAmericanas = new AmericanasPageObject();
	
	@Dado("que estou no {string} de comercio online")
	public void queEstouNoDeComercioOnline(String site) throws InterruptedException {
		pageAmericanas.openBrowser(site);
	}

	@Quando("pesquiso por {string}")
	public void pesquisoPor(String produto) {
		pageAmericanas.buscaProduto(produto);
	}

	@Entao("consisto o retorno da busca de modo a idenficiar o meu {string}")
	public void consistoORetornoDaBuscaDeModoAIdenficiarOMeu(String produto) {
		pageAmericanas.validaBusca(produto);
	}

	@Quando("escolho um item da lista")
	public void escolhoUmItemDaLista() throws InterruptedException {
		pageAmericanas.escolheItem();
	}
	
	@E("adiciono o produto no carrinho")
	public void adicionoOProdutoNoCarrinho() throws InterruptedException {
		pageAmericanas.selectItem();
		
	}

	@Entao("o carrinho devera conter o {string} selecionado")
	public void oCarrinhoDeveraConterOSelecionado(String produto) {
		pageAmericanas.validaCarrinho(produto);
		
	}
}