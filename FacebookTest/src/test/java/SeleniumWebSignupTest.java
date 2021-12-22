import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SeleniumWebSignupTest {
    //import the Selenium WebDriver
    private WebDriver Driver;

    @Test
    public void start() throws InterruptedException{
        //Locate where the chrome driver is
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //1.Open your chrome browser
        Driver = new ChromeDriver();
        //2. Input your Selenium Demo page URL (https:selenium-blog.herokuapp.com)
        Driver.get("https:selenium-blog.herokuapp.com");
        Thread.sleep(5000);
        //3. Maximize the browser
        Driver.manage().window().maximize();
        //4. Click on the Signup button to open the signup page
        Driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(5000);
        //5. Input your Username in the Username field
        Driver.findElement(By.id("user_username")).sendKeys("Bassey");
        //6. Input your email address in the email address field
        Driver.findElement(By.id("user_email")).sendKeys("bassey@gmailite.com");
        Thread.sleep(5000);
        //7. Input your password in the user password field
        Driver.findElement(By.id("user_password")).sendKeys("123456789");
        //8. Click on the SignUp button
        Driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);
        //9.Click the User1 item on the list page
        Driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
        //10. Search for an item(Using Python with selenium) and confirm it is present
        Driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/a")).click();
        Thread.sleep(5000);
        //11.Click on logout
        Driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();


        //12. Quit the browser
        Driver.quit();



    }
}
