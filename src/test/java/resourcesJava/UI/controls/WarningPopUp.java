package resourcesJava.UI.controls;

import org.openqa.selenium.Alert;
import resourcesJava.UI.singletonSession.Session;


public class WarningPopUp {

    public void aceptarWarning(){
        Alert alert = Session.getSession().getDriver().switchTo().alert();
        alert.accept();
    }

}