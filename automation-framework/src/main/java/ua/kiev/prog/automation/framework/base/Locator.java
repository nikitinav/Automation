package ua.kiev.prog.automation.framework.base;

import org.openqa.selenium.By;

public class Locator {
    private By _wdLocator;
    private Locator _parent;

    public Locator(String strLocator) {
        this._wdLocator = By.xpath(strLocator);
    }

    public Locator(String strLocator, Locator parent) {
        this(strLocator);
        this._parent = parent;
    }

    public Locator createChild(String strLocator) {
        return new Locator(strLocator, this);
    }

    public By wdLocator() {
        return this._wdLocator;
    }

    public Locator parent() {
        return this._parent;
    }
}