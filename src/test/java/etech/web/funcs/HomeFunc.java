package etech.web.funcs;

import etech.web.common.BaseTest;
import etech.web.pages.HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeFunc extends BaseTest {

    HomePage homePage = new HomePage();

    public String getTitleNome(){
        return driver.findElement(homePage.getTitleNome()).getText();
    }

    public void clicarCampoSair(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(homePage.getLoading()));
        driver.findElement(homePage.getCampoSair()).click();
    }

    public String getCampoProcura(){
        return driver.findElement(homePage.getCampoProcura()).getText();
    }


}
