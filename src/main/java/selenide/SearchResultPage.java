package selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {
    public SelenideElement searchfield =  $(By.id("lst-ib"));

    public void isvisible(){
        searchfield.should(Condition.visible);
    }

    public String text() {
        return searchfield.getValue();
    }
}
