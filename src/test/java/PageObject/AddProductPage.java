package PageObject;

import net.masterthought.cucumber.json.Hook;
import org.joda.time.field.MillisDurationField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static StepDefinition.AddProductSteps.driver;

public class AddProductPage
{
    public AddProductPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\'block_top_menu\']/ul/li[2]/a")
    private WebElement dresses;
    public void ClickDresses()
    {
        dresses.click();
    }

    @FindBy(how = How.CSS, using = "#subcategories > ul > li:nth-child(3)")
    private WebElement summerdresses;
    public void ClickSummerDresses()
    {
        summerdresses.click();
    }

  @FindBy(how = How.XPATH, using = "//*[@id=\'center_column\']/ul/li[1]/div/div[2]/h5/a")
    private WebElement anydress;
    public void ClickAnyDress()
    {
       anydress.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\'group_1\']")
    private WebElement anysize;
    public void ClickAnySize()
    {
        Select select = new Select(anysize);
        select.selectByVisibleText("L");
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\'color_16\']" )
    private WebElement anycolour;
    public void ClickAnyColour()
    {
        anycolour.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\'add_to_cart\']/button")
    private WebElement addtocart;
    public void ClickAddToCart()
    {
        addtocart.click();
    }

    @FindBy(how = How.XPATH, using = "//h2" )
    private WebElement  successmessage;
    public boolean actualMessage() throws InterruptedException {
        Thread.sleep(5000);
        return successmessage.isDisplayed();

        //WebElement successmessage wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("message-success")));

    }

    @FindBy(how = How.XPATH, using = "//*[@id=\'layer_cart\']//a")
    private WebElement checkoutbtn;
    public void ClickCheckoutBtn()
    {

       checkoutbtn.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\'center_column\']/p[2]/a[1]")
    private WebElement proceedcheckoutbtn;
    public void ClickProceedCheckoutBtn()
    {
      proceedcheckoutbtn.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/h1")
    private WebElement authentication;
    public boolean AuthenticationDisplayed()

    {
        return authentication.isDisplayed();
    }
















}
