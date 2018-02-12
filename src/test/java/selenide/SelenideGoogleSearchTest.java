package selenide;

import com.google.core.SelenideTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SelenideGoogleSearchTest extends SelenideTestBase {
    private String searchText = "selenide";

    @Test(enabled = false)
    public void searchTest() {
        SearchPage searchPage = new SearchPage();
        SearchResultPage searchResultPage = new SearchResultPage();
        searchPage.searchFor(searchText);
        searchResultPage.isvisible();
        Assert.assertEquals(searchResultPage.text(), searchText);
    }
}


