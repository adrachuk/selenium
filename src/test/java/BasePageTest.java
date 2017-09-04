import com.base.TestBaseSetup;
import com.pageobjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by adrachuk on 24/05/2017.
 */
public class BasePageTest extends TestBaseSetup{
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver=getDriver();
    }

    @Test
    public void verifySomething() {
        System.out.println("Home page test...");
        BasePage basePage = new BasePage(driver);
        Assert.assertTrue(basePage.verifyChapter1click());
    }


}
