package StepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RegisterStepDefinitions {

    WebDriver driver;
    @Given("^User should able to open browser$")
    public void user_should_able_to_open_browser()  {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Given("^Enter URL$")
    public void enter_URL()  {
        driver.get("https://demo.nopcommerce.com/");

    }

    @When("^User click on the register link$")
    public void user_click_on_the_register_link()  {
        driver.findElement(By.className("ico-register")).click();


    }

    @Then("^User should be on register page$")
    public void user_should_be_on_register_page()  {


    }

    @Then("^Verify register page title$")
    public void verify_register_page_title() {
        String title =driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Register",title);

    }

    @Then("^User should be able to select gender male or female$")
    public void user_should_be_able_to_select_gender_male_or_female()  {
        driver.findElement(By.id("gender-male")).click();




    }

    @Then("^User should able enter firstname and lastname$")
    public void user_should_able_enter_firstname_and_lastname()  {
        driver.findElement(By.id("FirstName")).sendKeys("Milan");
        driver.findElement(By.id("LastName")).sendKeys("Kantilal");

    }

    @Then("^User should abele to select date of Date of BirthDay,BirthMonth and BirthYear$")
    public void user_should_abele_to_select_date_of_Date_of_BirthDay_BirthMonth_and_BirthYear()  {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("12");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")).sendKeys("October");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")).sendKeys("2022");



    }

    @Then("^User enter valid email address$")
    public void user_enter_valid_email_address()  {
        driver.findElement(By.id("Email")).sendKeys("milan1234@gmail.com");

    }

    @Then("^User enter company name$")
    public void user_enter_company_name() {
        driver.findElement(By.id("Company")).sendKeys("Software Testing");

    }

    @Then("^User able to tick the Newsletter tick-box$")
    public void user_able_to_tick_the_Newsletter_tick_box()  {
        driver.findElement(By.xpath("//*[@id=\"Newsletter\"]")).click();

    }

    @Then("^User enter the password$")
    public void user_enter_the_password()  {
        driver.findElement(By.id("Password")).sendKeys("Milan4567");

    }

    @Then("^User enter the password to confirm$")
    public void user_enter_the_password_to_confirm() {
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Milan4567");

    }

    @Then("^User finally able to click on register button$")
    public void user_finally_able_to_click_on_register_button() {
        driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();

    }

    @Then("^User should be on register successfully$")
    public void user_should_be_on_register_successfully()  {

    }

    @Then("^User can close the browser$")
    public void user_can_close_the_browser()  {

        driver.quit();

    }





}
