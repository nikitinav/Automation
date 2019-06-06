package ua.kiev.prog.automation.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ua.kiev.prog.automation.framework.app.forum.MainPage;
import ua.kiev.prog.automation.framework.base.Session;

public class App {
    static public void main(String[] args) {
        try {
            Session.get().driver().get("https://prog.kiev.ua/forum/index.php");
            MainPage mainPage = new MainPage();
            mainPage.confirmPage();
            mainPage.mainMenu.getHelpPage().mainMenu.getMainPage();
        } finally {
            Session.get().close();
        }
    }
}