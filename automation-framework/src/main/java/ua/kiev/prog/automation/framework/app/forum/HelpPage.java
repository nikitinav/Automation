package ua.kiev.prog.automation.framework.app.forum;

import org.openqa.selenium.By;
import ua.kiev.prog.automation.framework.app.forum.blocks.MainMenuBlock;
import ua.kiev.prog.automation.framework.base.PageObject;

public class HelpPage extends PageObject {

    final public MainMenuBlock mainMenu = new MainMenuBlock();

    @Override
    protected By readyLocator() {
        return By.xpath("//li[@id='button_help']//a[contains(@class,'active')]");
    }
}
