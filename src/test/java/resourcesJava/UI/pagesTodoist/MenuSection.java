package resourcesJava.UI.pagesTodoist;

import org.openqa.selenium.By;
import resourcesJava.UI.controls.Button;

public class MenuSection {
    public Button profileInfoButton = new Button(By.xpath("//button[@class=\"reactist_menubutton top_bar_btn settings_btn\"]"));
    public Button logoutButton = new Button(By.xpath("//button[position() = 2]//span[@class=\"user_menu_label\"]"));
}
