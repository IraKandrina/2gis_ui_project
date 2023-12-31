package ru.gis2.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.gis2.pages.MainPage;
import ru.gis2.pages.components.RightMenuComponent;

import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.NORMAL;

@Owner("IraKandrina")
@Epic(value = "2Gis UI tests")
@Feature(value = "St.Petersburg Website")
@Story("Правое меню")
public class RightMenuTests extends TestBase {
    MainPage mainPage = new MainPage();
    RightMenuComponent rightMenu = new RightMenuComponent();

    @Severity(NORMAL)
    @Test
    @DisplayName("Проверка отображения правого меню")
    public void verifyRightMenuVisibilityTest() {
        step("Открыть главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Нажать кнопку Меню в правом верхнем углу главной страницы", () -> {
            mainPage.openRightMenu();
        });
        step("Проверить отображение пункта меню", () -> {
            rightMenu.checkCartMenuItem();
        });
    }
}
