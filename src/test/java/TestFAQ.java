import org.example.FAQ;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class TestFAQs extends Base {

    @Test
    public void check_0() {
        FAQ objFAQs = new FAQ(driver);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        objFAQs.clickFAQ0();
        Assert.assertTrue("С ответом 1 что-то нето :)", objFAQs.check0Answer());
    }

    @Test
    public void check_1() {
        FAQ objFAQs = new FAQ(driver);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        objFAQs.clickFAQ1();
        Assert.assertTrue("С ответом 2 что-то нето :)", objFAQs.check1Answer());
    }

    @Test
    public void check_2() {
        FAQ objFAQs = new FAQ(driver);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        objFAQs.clickFAQ2();
        Assert.assertTrue("С ответом 3 что-то нето :)", objFAQs.check2Answer());
    }

    @Test
    public void check_3() {
        FAQ objFAQs = new FAQ(driver);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        objFAQs.clickFAQ3();
        Assert.assertTrue("С ответом 4 что-то нето :)", objFAQs.check3Answer());
    }

    @Test
    public void check_4() {
        FAQ objFAQs = new FAQ(driver);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        objFAQs.clickFAQ4();
        Assert.assertTrue("С ответом 5 что-то нето :)", objFAQs.check4Answer());
    }

    @Test
    public void check_5() {
        FAQ objFAQs = new FAQ(driver);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        objFAQs.clickFAQ5();
        Assert.assertTrue("С ответом 6 что-то нето :)", objFAQs.check5Answer());
    }

    @Test
    public void check_6() {
        FAQ objFAQs = new FAQ(driver);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        objFAQs.clickFAQ6();
        Assert.assertTrue("С ответом 7 что-то нето :)", objFAQs.check6Answer());
    }

    @Test
    public void check_7() {
        FAQ objFAQs = new FAQ(driver);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        objFAQs.clickFAQ7();
        Assert.assertTrue("С ответом 8 что-то нето :)", objFAQs.check7Answer());
    }
}
