package etech.web.funcs;

import etech.web.common.BaseTest;
import etech.web.pages.HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeFunc extends BaseTest {

    HomePage homePage = new HomePage(driver);

    public String getTitleNome() {
        return homePage.getTitleNome().getText();
    }

    public void clicarCampoSair() {
        wait.until(ExpectedConditions.invisibilityOf(homePage.getLoading()));
        wait.until(ExpectedConditions.elementToBeClickable(homePage.getCampoSair()));
        homePage.getCampoSair().click();
    }

    public String getCampoProcura() {
        return homePage.getCampoProcura().getText();
    }


}
