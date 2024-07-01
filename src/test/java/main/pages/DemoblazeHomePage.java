package main.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static main.constants.Constants.Url.DEMOBLAZE_HOME_PAGE;

public class DemoblazeHomePage {

    private final SelenideElement signInBtn = $(byId("signin2"));
    private final SelenideElement usernameSignInField = $x("//input[@id='sign-username']");
    private final SelenideElement passwordSignInField = $x("//input[@id='sign-password']");
    private final SelenideElement signUpBtn = $x("//button[@onclick = 'register()']");


    private final SelenideElement logInBtn = $(byId("login2"));
    private final SelenideElement usernameLogInField = $x("//input[@id='loginusername']");
    private final SelenideElement passwordLogInField = $x("//input[@id='loginpassword']");
    private final SelenideElement logInConfirmBtn = $x("//button[@onclick = 'logIn()']");


    private final SelenideElement laptopsBtn = $(byText("Laptops"));
    private final SelenideElement laptopDellBtn = $(byText("2017 Dell 15.6 Inch"));


    public DemoblazeHomePage() {
        Selenide.open(DEMOBLAZE_HOME_PAGE);
    }

    public DemoblazeHomePage clickOnSignInButton() {
        signInBtn.click();
        return this;
    }

    public DemoblazeHomePage typeSignInUsername(String username) {
        usernameSignInField.shouldBe(visible).sendKeys(username);
        return this;
    }

    public DemoblazeHomePage typeSignInPassword(String password) {
        passwordSignInField.sendKeys(password);
        return this;
    }

    public DemoblazeHomePage clickOnSignUpButton() {
        signUpBtn.click();
        Selenide.switchTo().alert().accept();
        return this;
    }

    public DemoblazeHomePage clickOnLogInButton() {
        logInBtn.shouldBe(visible).click();
        return this;
    }

    public DemoblazeHomePage typeLogInUsername(String username) {
        usernameLogInField.shouldBe(visible).sendKeys(username);
        return this;
    }

    public DemoblazeHomePage typeLogInPassword(String password) {
        passwordLogInField.sendKeys(password);
        return this;
    }

    public DemoblazeHomePage clickOnLogInConfirmButton() {
        logInConfirmBtn.click();
        return this;
    }

    public DemoblazeProductPage chooseProduct() {
        laptopsBtn.click();
        laptopDellBtn.click();
        return new DemoblazeProductPage();
    }


}
