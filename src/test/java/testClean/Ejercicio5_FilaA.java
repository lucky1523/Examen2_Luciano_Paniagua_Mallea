package testClean;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import resourcesJava.UI.pagesTodoLy.CenterSection;
import resourcesJava.UI.pagesTodoLy.LoginModal;
import resourcesJava.UI.pagesTodoLy.MainPage;
import resourcesJava.UI.pagesTodoLy.MenuSection;

public class Ejercicio5_FilaA extends BaseTodoLy {
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    MenuSection menuSection = new MenuSection();
    CenterSection centerSection = new CenterSection();
    int fiveDigits =(int) (10000 + Math.random() * 90000);
    String user = "s"+fiveDigits+"@gmail.com";
    String password = "12345";
    String name = "Luciano Paniagua";



    @Test
    public void verify_signUp_todoly() throws InterruptedException {
        mainPage.signUp.click();
        mainPage.name.set(name);
        mainPage.email.set(user);
        mainPage.password.set(password);
        mainPage.checkBox.click();
        mainPage.signInButton.click();
        Thread.sleep(3000);

        Assertions.assertTrue(menuSection.logoutButton.controlIsDisplayed(),"Error");


    }
}
