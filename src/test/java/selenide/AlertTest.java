package selenide;

import com.google.core.SelenideTestBase;

//import static com.codeborne.selenide.Condition.text;

public class AlertTest extends SelenideTestBase{
    private String alertExample = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
    private String cancelled ="You pressed Cancel";

//    @Test
//    public void alertTest(){
//        open(alertExample);
//        switchTo().frame("iframeResult");
//                $(By.xpath("/html/body/button"));
//                switchTo().alert().dismiss();
//                $(By.xpath("demo")).shouldHave(text(cancelled));
//
//    }
}
