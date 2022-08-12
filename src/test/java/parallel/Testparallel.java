package parallel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

public class Testparallel {

  private WebDriver driver;

  @Before
  public void init() throws MalformedURLException {


    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
    capabilities.setCapability(CapabilityType.BROWSER_VERSION, "104.0");
    capabilities.setCapability("enableVNC", true);
    driver = new RemoteWebDriver(
        URI.create("http://localhost:4445/wd/hub").toURL(),
        capabilities
    );
  }

  @After
  public void tearDown() {
    if(driver != null) {
      driver.close();
      driver.quit();
    }
  }

 @Test
  public void test1() throws InterruptedException {
    driver.get("https://otus.ru");

    Thread.sleep(33000);
  }

  @Test
  public void test2() throws InterruptedException {
    driver.get("https://otus.ru");

    Thread.sleep(33000);
  }

  @Test
  public void test3() throws InterruptedException {
    driver.get("https://otus.ru");

    Thread.sleep(33000);
  }

  @Test
  public void test4() throws InterruptedException {
    driver.get("https://otus.ru");

    Thread.sleep(33000);
  }

  @Test
  public void test5() throws InterruptedException {
    driver.get("https://otus.ru");

    Thread.sleep(33000);
  }

  @Test
  public void test6() throws InterruptedException {
    driver.get("https://otus.ru");

    Thread.sleep(33000);
  }
}
