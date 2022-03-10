package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import resourcesJava.UI.pagesTodoist.*;

public class Ejercicio4_FilaA extends BaseTodoIs{

    String nombre="Luciano";
    String nombreNuevo="LucianoNuevo";
    MainPage mainPage= new MainPage();
    LoginPage loginPage = new LoginPage();
    LeftMenu leftMenu = new LeftMenu();
    EditProjectModal editProjectModal = new EditProjectModal();
    DeleteModal deleteModal = new DeleteModal();
    ToolBar toolBar = new ToolBar();
    @Test
    public void verifyCRUDTodo() throws InterruptedException {
        mainPage.settingsButton.click();
        loginPage.email.set("erickmallea1234@gmail.com");
        loginPage.password.set("lucianopaniagua");
        loginPage.loginSubmit.click();
        Assertions.assertTrue(toolBar.profileInfoButton.controlIsDisplayed(), "ERROR, no se pudo hacer el login");
        Thread.sleep(5000);

        //Create
        leftMenu.addNewProject.click();
        editProjectModal.editNameProjectInput.set(nombre);
        editProjectModal.submit.click();
        Assertions.assertTrue(leftMenu.projectVerifyNameControl.controlIsDisplayed(),"Error");
        Thread.sleep(3000);


        //Update
        leftMenu.lastProject.click();
        leftMenu.menuProjectOptions.click();
        leftMenu.editProject.click();
        editProjectModal.editNameProjectInput.clear();
        editProjectModal.editNameProjectInput.set(nombreNuevo);
        editProjectModal.submit.click();
        Thread.sleep(3000);
        Assertions.assertTrue(leftMenu.projectVerifyNewNameControl.controlIsDisplayed(),"Error");

        //Delete
        leftMenu.lastProjectUpdated.click();
        leftMenu.menuProjectOptions.click();
        leftMenu.deleteProjectButton.click();
        deleteModal.deleteSubmitButton.click();
        Assertions.assertFalse(leftMenu.projectNameShouldNotExist.controlIsDisplayed(),"********Error: ");

        //ESTA VERIFICACION TARDA UN MOMENTO PERO LOGRA EJECUTARSE


    }
}
