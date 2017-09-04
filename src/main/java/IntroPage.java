/**
 * Created by adrachuk on 24/05/2017.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IntroPage {


    private final WebDriver driver;

    public IntroPage(WebDriver driver) {
        this.driver = driver;

        if (!"Selenium: Beginners Guide".equals(driver.getTitle())) {
            throw new IllegalStateException("This is not the Intro page");
        }
    }
}
