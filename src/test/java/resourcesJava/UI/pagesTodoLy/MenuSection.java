package resourcesJava.UI.pagesTodoLy;

import org.openqa.selenium.By;
import resourcesJava.UI.controls.Button;

public class MenuSection {
    public Button logoutButton = new Button(By.xpath("//a[contains(.,'Logout')]"));
    public MenuSection(){}

}
