package ua.kiev.prog.automation.framework.base.widget;

import org.openqa.selenium.By;
import ua.kiev.prog.automation.framework.base.Widget;

public class GUIButton extends Widget {

    public GUIButton (By locator) {
        super (locator);
    }

    public void click () {

        this.element().click();
        this.waitAction();
    }
}
