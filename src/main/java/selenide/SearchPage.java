package selenide;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    private SelenideElement search = $(By.name("q"));

    @Step("Searches for {0} text")
    public SearchPage searchFor(String searchText) {
        Selenide.open("https://www.google.com");
        search.val(searchText).submit();
        return this;
    }
}
