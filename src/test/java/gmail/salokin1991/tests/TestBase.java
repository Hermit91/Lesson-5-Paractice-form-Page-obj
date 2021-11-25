package gmail.salokin1991.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import gmail.salokin1991.pages.RegistrationPage;
import gmail.salokin1991.utils.FakeDataUtil2;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    FakeDataUtil2 fakeData = new FakeDataUtil2();

    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.startMaximized = true;
    }
}
