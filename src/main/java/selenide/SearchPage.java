package selenide;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    public SelenideElement search = $(By.name("q"));

    public SearchPage searchFor(String searchText) {
        Selenide.open("https://www.google.com");
        search.val(searchText).submit();
        return this;
    }
}
