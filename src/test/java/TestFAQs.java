import org.example.FAQ;
import org.junit.Assert;
import org.junit.Test;

public class TestFAQs extends WebDriverProvider {

    @Test
    public void checkQuestionsExpectTextsDisplayed() {
        FAQ objFAQs = new FAQ(driver);

        objFAQs.clickFAQ0();

        Assert.assertTrue("Всё пропало!", objFAQs.check0Answer());
    }

}
