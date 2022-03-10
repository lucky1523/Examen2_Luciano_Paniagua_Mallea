package resourcesJava.UI.pagesTodoist;

import org.openqa.selenium.By;
import resourcesJava.UI.controls.Button;
import resourcesJava.UI.controls.TextBox;

public class LoginPage {
    public TextBox email=new TextBox(By.id("email"));
    public TextBox password=new TextBox(By.id("password"));
    public Button loginSubmit=new Button(By.xpath("//button[text()=\"Log in\"]"));
}
