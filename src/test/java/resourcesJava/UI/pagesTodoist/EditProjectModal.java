package resourcesJava.UI.pagesTodoist;


import org.openqa.selenium.By;
import resourcesJava.UI.controls.TextBox;

public class EditProjectModal {
    public TextBox editNameProjectInput = new TextBox(By.xpath("//input[@id=\"edit_project_modal_field_name\"]"));
    //public TextBox submitNew = new TextBox(By.xpath("//button[@type=\"submit\"]"));


    public TextBox nameProjectInput = new TextBox(By.id("edit_project_modal_field_name"));
    public TextBox submit = new TextBox(By.xpath("//button[@type=\"submit\"]"));


}
