package Selenide;

import com.google.core.SelenideTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenide.SearchPage;
import selenide.SearchResultPage;


public class SelenideGoogleSearchTest extends SelenideTestBase {

    //ChromeDriverManager.getInstance().setup();

    private String searchText = "selenide";
    private SearchPage searchPage = new SearchPage();
    private SearchResultPage searchResultPage = new SearchResultPage();

    @Test(enabled = true)
    public void searchTest() {
        searchPage.searchFor(searchText);
        searchResultPage.isvisible();
        Assert.assertEquals(searchResultPage.text(), searchText);
    }
}


