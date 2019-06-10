import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.kiev.prog.automation.framework.app.forum.LoginPage;
import ua.kiev.prog.automation.framework.app.forum.MainLoggedInPage;
import ua.kiev.prog.automation.framework.app.forum.MainPage;
import ua.kiev.prog.automation.framework.app.forum.TopicListPage;
import ua.kiev.prog.automation.framework.base.Session;

public class SessionTestNGTest extends Assert
{
    private String _url = "https://www.google.com.ua/";

    @BeforeTest
    public void setup ()
    {

    }

    @Test(priority = 0)
    public void smokeTest() {
        Session.get().driver().get("https://prog.kiev.ua/forum/index.php");
        MainPage mainPage = new MainPage();
        mainPage.confirmPage();
        mainPage.mainMenu.getHelpPage().mainMenu.getMainPage();
        LoginPage loginPage = mainPage.getLoginPage();
        MainLoggedInPage mainPageLogged = loginPage.login("qaAutomationAccount","135798642");
        TopicListPage topics = mainPageLogged.categoryList.getCategory("Программирование").openBoard("Java SE");
        topics.openTopicByName("Java Start Online ДЗ romanvoznyy");

    }

    @Test(priority = 1)
    public void closeTest() {
        // Создаем новую сессию
        Session session = Session.get();
        // Загружаем URL
        session.driver().get(this._url);
        // Закрываем сессию
        session.close();
        // Проверяем что загруженный URL не соответствует ожидаемому
        // При вызове session.driver() драйвер откроется заново
        assertNotEquals(this._url, session.driver().getCurrentUrl());
        // Закрываем сессию
        session.close();
    }

    @AfterTest
    public void after ()
    {
        Session.get().close();
    }
}