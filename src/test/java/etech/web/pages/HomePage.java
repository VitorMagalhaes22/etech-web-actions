package etech.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//p[@class='logged-user']")
    private WebElement titleNome;

    @FindBy(xpath = "//a[@href='/logout' and @class='link']")
    private WebElement campoSair;

    @FindBy(xpath = "//label[@class='label']")
    private WebElement campoProcura;

    @FindBy(xpath = "//*[@fill-rule='evenodd']")
    private WebElement loading;

    public WebElement getCampoProcura() {
        return campoProcura;
    }

    public WebElement getCampoSair() {
        return campoSair;
    }

    public WebElement getLoading() {
        return loading;
    }

    public WebElement getTitleNome() {
        return titleNome;
    }

}
