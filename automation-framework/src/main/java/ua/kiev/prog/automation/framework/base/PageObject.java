package ua.kiev.prog.automation.framework.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract public class PageObject {

    final protected WebDriver _driver;

    public PageObject() {
        this._driver = Session.get().driver();
    }

    public void confirmPage() {
        try {
            WebDriverWait wait = new WebDriverWait(this._driver, Timeouts.DEF_TIMEOUT_PAGE_OBJECT_WAIT);
            wait.until(d -> d.findElements(this.readyLocator()).size() != 0);
        } catch (Throwable e) {
            throw new RuntimeException("I Can't confirm that page is loaded. My name is " + this.getClass().getSimpleName());
        }
    }

    abstract protected By readyLocator();
}
