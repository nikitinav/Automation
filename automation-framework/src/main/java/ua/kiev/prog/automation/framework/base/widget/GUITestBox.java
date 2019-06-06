package ua.kiev.prog.automation.framework.base.widget;

import org.openqa.selenium.By;
import ua.kiev.prog.automation.framework.base.Widget;

public class GUITestBox extends Widget {

    public GUITestBox (By locator) {

        super (locator);
    }

    final public void setValue (String value) {

        this.element().clear();
        this.element().sendKeys();
        this.waitAction();
    }
}
