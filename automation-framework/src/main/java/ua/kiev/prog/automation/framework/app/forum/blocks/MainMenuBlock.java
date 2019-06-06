package ua.kiev.prog.automation.framework.app.forum.blocks;

import org.openqa.selenium.By;
import ua.kiev.prog.automation.framework.app.forum.HelpPage;
import ua.kiev.prog.automation.framework.app.forum.MainPage;
import ua.kiev.prog.automation.framework.base.BlockObject;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

public class MainMenuBlock extends BlockObject {

    final private GUILink _homeLink   = new GUILink(By.xpath("//li[@id='button_home']//a"));
    final private GUILink _helpLink   = new GUILink(By.xpath("//li[@id='button_help']//a"));
    final private GUILink _searchLink = new GUILink(By.xpath("//li[@id='button_search']//a"));
    final private GUILink _enterLink  = new GUILink(By.xpath("//li[@id='button_login']//a"));
    final private GUILink _regLink    = new GUILink(By.xpath("//li[@id='button_register']//a"));

    public MainMenuBlock (){

        super (By.xpath("//div[@id='main menu']"));
    }

    public MainPage getMainPage (){

        this._homeLink.click();
        MainPage page = new MainPage();
        page.confirmPage();
        return page;
    }

    public HelpPage getHelpPage (){

        this._helpLink.click();
        HelpPage page = new HelpPage();
        page.confirmPage();
        return page;
    }
}
