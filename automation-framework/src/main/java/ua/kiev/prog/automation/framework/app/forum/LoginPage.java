package ua.kiev.prog.automation.framework.app.forum;

import org.openqa.selenium.By;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.widget.GUIButton;
import ua.kiev.prog.automation.framework.base.widget.GUITestBox;

public class LoginPage extends PageObject {

    final public GUITestBox userName = new GUITestBox(By.xpath("//input[@name='user']"));
    final public GUITestBox password = new GUITestBox(By.xpath("//input[@name='passwrd']"));

    final public GUIButton loginButton = new GUIButton (By.xpath("//input[@type='submit']"));

    @Override
    final protected By readyLocator() {
        return null;
    }

}
