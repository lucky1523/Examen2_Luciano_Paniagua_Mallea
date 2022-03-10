package testClean;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import resourcesJava.UI.singletonSession.Session;



public class BaseTodoLy {
    String projName="Luciano";

    @BeforeEach
    public void openBrowser(){
        Session.getSession().getDriver().get("https://todo.ly/");
    }


    @AfterEach
    public void closeBrowser(){
        Session.getSession().closeSession();
    }
}
