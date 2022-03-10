package testClean;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import resourcesJava.UI.singletonSession.Session;



public class BaseTodoIs {
    String projName="Luciano";

    @BeforeEach
    public void openBrowser(){
        Session.getSession().getDriver().get("https://todoist.com/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getSession().closeSession();
    }
}