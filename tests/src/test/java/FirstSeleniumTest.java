import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
 
 
public class FirstSeleniumTest {
    private WebDriver driver;
    private WebDriverWait wait;
 
    @Before
    public void setup() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://selenium:4444/wd/hub"), options);
        driver.manage().window().maximize();
 
        wait = new WebDriverWait(driver, 10);
    }
 
  @Test
    public void Hover_test() {
        driver.get("https://www.quora.com/");

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        emailField.sendKeys("taghizada0054@gmail.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Mehemmed.696");

       
      WebElement loginButton = driver.findElement(By.xpath("//div[contains(@class, 'qu-display--inline-flex')]//div[contains(@class, 'qu-ellipsis') and text()='Login']"));
        loginButton.click();
       
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
       WebElement switchLanguageButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'q-click-wrapper') and @aria-label='Switch language']")));   
             Actions actions = new Actions(driver);       
                      try {
            Thread.sleep(5500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	
               actions.moveToElement(switchLanguageButton).perform();
                   
                   try {
            Thread.sleep(5500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	
        

    }   
 
 
    @Test
    public void test_login_and_send_questionForm() {
        driver.get("https://www.quora.com/");

       
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        emailField.sendKeys("taghizada0054@gmail.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Mehemmed.696");

       
      WebElement loginButton = driver.findElement(By.xpath("//div[contains(@class, 'qu-display--inline-flex')]//div[contains(@class, 'qu-ellipsis') and text()='Login']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginButton);
       
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	
	
	 WebElement postButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'q-click-wrapper') and contains(@class, 'qu-active--bg--darken') and contains(@class, 'qu-borderRadius--pill') and contains(@class, 'qu-alignItems--center') and contains(@class, 'qu-justifyContent--center') and contains(@class, 'qu-whiteSpace--nowrap') and contains(@class, 'qu-userSelect--none') and contains(@class, 'qu-display--flex') and contains(@class, 'qu-tapHighlight--white') and contains(@class, 'qu-textAlign--center') and contains(@class, 'qu-cursor--pointer') and contains(@class, 'qu-hover--bg--darken')]")));             
          postButton1.click();
         try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement textarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Start your question with \"What\", \"How\", \"Why\", etc.']")));         textarea.sendKeys("Why people are so lazy ?");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement addQuestionButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class, 'puppeteer_test_modal_submit')]//*[text()='Add question']")));              addQuestionButton.click();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
 
        

    }   
    
    
    @Test
    public void title() {
        driver.get("https://www.quora.com/");
        String pageTitle = driver.getTitle();     
            System.out.println("Page Title: " + pageTitle);     
            assert pageTitle.contains("Quora") : "Page title does not contain 'Quora'";
 
    }   
    
    @Test
    public void StaticTest() {
        driver.get("https://www.quora.com/");
 
    }   
    
    
    
    
    @Test
    public void test_logout() {
        driver.get("https://www.quora.com/");	

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        emailField.sendKeys("taghizada0054@gmail.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Mehemmed.696");

       
      WebElement loginButton = driver.findElement(By.xpath("//div[contains(@class, 'qu-display--inline-flex')]//div[contains(@class, 'qu-ellipsis') and text()='Login']"));
        loginButton.click();
       
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	WebElement accountMenuIcon = driver.findElement(By.xpath("//div[@aria-label='Account menu']"));
        accountMenuIcon.click();

      
       WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'q-click-wrapper') and contains(., 'Logout')]")));
        logoutButton.click();
 
        

    }   
    
    
    @Test
    public void send_form() {
       
        driver.get("https://help.quora.com/hc/en-us/requests/new?ticket_form_id=360001060251");
        
	WebElement emailField = driver.findElement(By.id("request_anonymous_requester_email"));
        emailField.sendKeys("your_email@example.com");

	WebElement subjectField = driver.findElement(By.id("request_subject"));
        subjectField.sendKeys("Subscriptions Refund Policy");

	WebElement descriptionField = driver.findElement(By.id("request_description"));
        descriptionField.sendKeys("This is a test description for the form submission.");

 	WebElement spaceLinkField = driver.findElement(By.id("request_custom_fields_360031505951"));
        spaceLinkField.sendKeys("https://example.com/my-space");
 
       
        
                    
 	WebElement submitButton = driver.findElement(By.cssSelector("footer input[type='submit'][name='commit']"));
        submitButton.click();

    }   
    
   

 	
    

    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}

