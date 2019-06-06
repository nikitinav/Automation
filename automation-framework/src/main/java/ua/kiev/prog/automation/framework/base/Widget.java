package ua.kiev.prog.automation.framework.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Widget {

    final private By _locator;

    public Widget(By locator) {
        this._locator = locator;
    }

    final public By locator () {return this._locator;}

    final public WebElement element() {

        WebDriverWait wait = new WebDriverWait(Session.get().driver(), Timeouts.DEF_TIMEOUT_WIDGET_WAIT);
        wait.until(d -> {
            List<WebElement> list = d.findElements(this._locator);
            return list.size() != 0;
        });
        return Session.get().driver().findElement(this._locator);
    }

    final protected void waitAction () {
        try { Thread.sleep (Timeouts.DEF_TIMEOUT_WIDGET_ACTION_WAIT); } catch (Throwable e) {/*Ignore*/}
    }
}
