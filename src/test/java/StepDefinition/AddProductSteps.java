package StepDefinition;

import PageObject.AddProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.sql.Time;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class AddProductSteps
{
   public AddProductPage addProductPage;

   public static WebDriver driver;

   public AddProductSteps()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Java\\src\\test\\resources\\Drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        addProductPage = new AddProductPage(driver);

    }

    @Given("a user navigate to Automation practice site")
    public void aUserNavigateToAutomationPracticeSite()
    {

     driver.get("http://automationpractice.com/index.php");

     driver.manage().window().maximize();

    }

    @When("a user click on Dresses")
    public void aUserClickOnDresses()
    {
     addProductPage.ClickDresses();
    }

    @And("a user click on Summer dresses")
    public void aUserClickOnSummerDresses()
    {
     //driver.findElement(By.xpath("//*[@id=\'subcategories\']/ul/li[3]/div[1]/a/img")).click();

     addProductPage.ClickSummerDresses();
    }

    @And("a user click on any dresses")
    public void aUserClickOnAnyDresses()
    {
     addProductPage.ClickAnyDress();
    }

    @And("a user select any Size for the dress")
    public void aUserSelectAnySizeForTheDress()
    {
     addProductPage.ClickAnySize();
    }

    @And("a user click on any colour")
    public void aUserClickOnAnyColour()
    {
     addProductPage.ClickAnyColour();
    }

    @And("a user click on Add to cart button")
    public void aUserClickOnAddToCartButton()
    {
      addProductPage.ClickAddToCart();
    }

    @Then("Item is added to cart and a successful message is displayed")
    public void itemIsAddedToCartAndASuccessfulMessageIsDisplayed() throws InterruptedException {

     Assert.assertTrue(addProductPage.actualMessage());
    }


    @And("a user click on proceed to checkout button")
    public void aUserClickOnProceedToCheckoutButton()
    {
     addProductPage.ClickCheckoutBtn();
    }

    @And("a user also click on proceed to checkout button on the shopping cart page")
    public void aUserAlsoClickOnProceedToCheckoutButtonOnTheShoppingCartPage()
    {
     addProductPage.ClickProceedCheckoutBtn();
    }

    @Then("the user is redirect to Authentication create Account and sign in Page")
    public void theUserIsRedirectToAuthenticationCreateAccountAndSignInPage()
    {
     Assert.assertTrue(addProductPage.AuthenticationDisplayed());
    }
}
