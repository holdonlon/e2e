package selenide;

import com.google.core.SelenideTestBase;
import org.testng.annotations.Test;
import selenide.SearchPage;

import javax.naming.directory.SearchResult;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class SearchGoogleTestSelenideEdition extends SelenideTestBase {

    private SearchPage searchPage = new SearchPage();
    private SearchPage resultPage = new SearchResult();

    @Test
    public void searchGoogleSelenideFirstLinkTest() {
        open("https://www.google.com.ua/");
        searchPage.searchFor("selenide");
        resultPage.getResultLink().should(text("Selenide"));
    }
    @Test
    public void searchGoogleSelenideLinksTest() {
        open("https://www.google.com.ua/");
        searchPage.searchFor("selenide");
        resultPage.getResultLinks().shouldHaveSize(10).forEach(selenideElement -> selenideElement.should(text("Selenide")));

    }
}
