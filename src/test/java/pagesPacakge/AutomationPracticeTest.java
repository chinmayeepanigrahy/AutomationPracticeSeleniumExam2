package pagesPacakge;

import org.junit.*;
 import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPracticeTest {
    static WebDriver driver = new ChromeDriver();


    @BeforeClass
    public static void setUp() {
        System.out.println("Beforeclass ..... setUp");
        driver.get("http://automationpractice.com/index.php");

    }

    @Before
    public void goHome() {
        System.out.println("Before ---- goHome");
        //click homebutton


    }

    // 1.AS a user i want to login in the account
    @Test
    public void userStory1() {
        System.out.println(" Test userstory1");
        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.navigate().back();
        driver.navigate().refresh();
    }


    @Test
// 2.As a user i want to seach a  1 women top (blouse) and added in a add to cart
    public void userStory2() {
        System.out.println("Test userStory 2:");
        driver.navigate().refresh();
        driver.findElement(By.linkText("Women")).click();
        //driver.findElement(By.xpath("//div[@class='block_content']//ul[@class='tree dynamized']//a[contains(text(),'Tops')]")).sendKeys("Tops");
        driver.findElement(By.xpath("//div[@class='block_content']//ul[@class='tree dynamized']//a[contains(text(),'Tops')]")).click();
        driver.findElement(By.xpath("//div[@class='block_content']//ul[@class='tree dynamized']//a[contains(text(),'Blouses')]")).click();
        driver.findElement(By.xpath("//p[contains(text(),'Catalog')]")).click();
        driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_1']")).getSize();
        driver.findElement(By.xpath("//a[contains(text(),'Black')]")).getAttribute("Black");
        driver.findElement(By.xpath("//a[contains(text(),'Cotton')]")).getAttribute("Cotton");
        driver.findElement(By.xpath("//ul[@id='ul_layered_id_feature_6']//li[@class='nomargin hiddable col-lg-6']")).getAttribute("Casual");
        driver.findElement(By.xpath("//input[@id='layered_quantity_1']")).isDisplayed();
        driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().refresh();

    }

    // 3.As a user i want to search for a printed summer dresses in yellow colour and quantity 1 and i added in a cart
    @Test
    public void userStory3() {
        System.out.println("Searching summer dresses:");

        driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Dresses");
        driver.findElement(By.name("submit_search")).click();
        driver.findElement(By.xpath("//i[@class='icon-th-list']")).click();
        driver.findElement(By.xpath("//a[@id='color_19']")).click();
        driver.findElement(By.xpath("//select[@id='group_1']")).click();
        driver.findElement(By.xpath("//input[@id='quantity_wanted']")).click();
        driver.findElement(By.cssSelector(".selector")).click();
        driver.findElement(By.xpath("//a[@id='color_16']")).click();
        driver.findElement(By.xpath("//span[@id='our_price_display']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().refresh();
    }

    @Test
    //4. As a user searching  a casual printed dresses.
    public void uesrStory4() {
        System.out.println("searching a casual dresses");
        driver.navigate().refresh();
        driver.findElement(By.name("search_query")).sendKeys(" Casual Dresses");
        driver.findElement(By.xpath("//button[@name='submit_search']")).click();
        driver.findElement(By.xpath("//div[@id='left_column']")).click();
        driver.findElement(By.xpath("//a[@id='color_13']")).click();
        driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
        driver.findElement(By.xpath("//select[@id='group_1']")).click();
        driver.findElement(By.xpath("//h1[contains(text(),'Printed Dress')]")).click();
        driver.findElement(By.xpath("//img[@id='bigpic']")).click();
        driver.navigate().back();
        driver.navigate().back();

    }

    // 5.As a user i want to subscribe for newsletter.
    @Test
    public void userStory5() {
        System.out.println(" Test userstory5");
        driver.navigate().refresh();
        driver.findElement(By.xpath("//input[@id='newsletter-input']")).sendKeys("chinu.pani@gmail.com");
        driver.navigate().back();
        driver.navigate().refresh();
    }

    //6.As a user i am taking contact us as a user story

    @Test
    public void userStory6() {
        System.out.println("userstory6");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='contact-link']")).click();
        driver.findElement(By.xpath("//select[@id='id_contact']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chinu.pani@gmail.com");
        driver.findElement(By.xpath("//span[contains(text(),'Send')]")).click();
        driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Hi i want exchange my dress");
        driver.findElement(By.xpath("//span[contains(text(),'Send')]")).click();
    }
    @AfterClass
    public static void close() {
        System.out.println("After class ------ closed browser:");
        driver.quit();
    }
}

