package testClean;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import resourcesJava.UI.pagesTodoLy.CenterSection;
import resourcesJava.UI.pagesTodoLy.LoginModal;
import resourcesJava.UI.pagesTodoLy.MainPage;
import resourcesJava.UI.pagesTodoLy.MenuSection;

public class Ejercicio6_FilaA extends BaseTodoLy {
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    MenuSection menuSection = new MenuSection();
    CenterSection centerSection = new CenterSection();
    String user = "erickmallea1234@gmail.com";
    String password = "12345";


    @Test
    public void verifyLogoutTodoly() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.emailTextBox.set(user);
        loginModal.pwdTextBox.set(password);
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.controlIsDisplayed(),"Error");

        Thread.sleep(2000);

        mainPage.logout.click();
        Thread.sleep(2000);
        Assertions.assertTrue(mainPage.signUp.controlIsDisplayed(),"Error");
    }
}
