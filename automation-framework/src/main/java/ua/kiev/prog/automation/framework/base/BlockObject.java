package ua.kiev.prog.automation.framework.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlockObject {

    final private By _locator;

    public BlockObject(By locator) {
        this._locator = locator;
    }

    public WebDriver driver() {
        return Session.get().driver();

    }

    public void confirmBlock() {
        try {
            WebDriverWait wait = new WebDriverWait(this.driver(), Timeouts.DEF_TIMEOUT_BLOCK_OBJECT_WAIT);
            wait.until(d -> d.findElements(this._locator).size() != 0);
        } catch (Throwable e) {
            throw new RuntimeException("I Can't confirm that block is loaded. My name is" + this.getClass().getSimpleName());
        }
    }

}
