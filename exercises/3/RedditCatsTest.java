// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class RedditCatsTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void titleisCats() {
    driver.get("https://www.reddit.com/r/cats/");
    driver.manage().window().setSize(new Dimension(2559, 1320));
    assertThat(driver.getTitle(), is("Cats"));
  }
  @Test
  public void signupbuttonlinkstoregisterpage() {
    driver.get("https://www.reddit.com/r/cats/");
    driver.manage().window().setSize(new Dimension(2559, 1320));
    {
      WebElement element = driver.findElement(By.xpath("//a[contains(text(),\'sign up\')]"));
      String attribute = element.getAttribute("href");
      vars.put("signup_href", attribute);
    }
    assertEquals(vars.get("signup_href").toString(), "https://www.reddit.com/register/?dest=https%3A%2F%2Fwww.reddit.com%2Fr%2Fcats%2F");
  }
  @Test
  public void bluebuttonatbannersaysJOIN() {
    driver.get("https://www.reddit.com/r/cats/");
    driver.manage().window().setSize(new Dimension(2559, 1320));
    assertThat(driver.findElement(By.xpath("//div[2]/div/div/div/div/div[2]/button")).getText(), is("JOIN"));
  }
  @Test
  public void rCatsRulenumber6text() {
    driver.get("https://www.reddit.com/r/cats/");
    assertThat(driver.findElement(By.xpath("//div[6]/div/div[2]/div")).getText(), is("Don\'t be Insulting, harassing, or creepy"));
  }
  @Test
  public void rCatsRuleshave11items() {
    driver.get("https://www.reddit.com/r/cats/");
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[2]/div[11]/div/div/div"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[2]/div[12]/div/div/div"));
      assert(elements.size() == 0);
    }
  }
}
