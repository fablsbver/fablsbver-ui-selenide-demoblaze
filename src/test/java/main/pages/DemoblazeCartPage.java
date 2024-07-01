package main.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class DemoblazeCartPage {

    private final SelenideElement placeOrderBtn = $x("//button[@class = 'btn btn-success']");

    private final SelenideElement nameField = $x("//input[@id = 'name']");
    private final SelenideElement countryField = $x("//input[@id = 'country']");
    private final SelenideElement cityField = $x("//input[@id = 'city']");
    private final SelenideElement cardField = $x("//input[@id = 'card']");
    private final SelenideElement monthField = $x("//input[@id = 'month']");
    private final SelenideElement yearField = $x("//input[@id = 'year']");
    private final SelenideElement purchaseBtn = $x("//button[@onclick = 'purchaseOrder()']");

    private final SelenideElement successPurchaseText = $(byText("Thank you for your purchase!"));
    private final SelenideElement successPurchaseOkBtn = $x("//button[@class = 'confirm btn btn-lg btn-primary']");

    private final SelenideElement logOut = $(byId("logout2"));


    public DemoblazeCartPage clickPlaceOrder() {
        placeOrderBtn.shouldBe(visible).click();
        return this;
    }

    public DemoblazeCartPage typeName(String name) {
        nameField.sendKeys(name);
        return this;
    }

    public DemoblazeCartPage typeCountry(String country) {
        countryField.sendKeys(country);
        return this;
    }

    public DemoblazeCartPage typeCity(String city) {
        cityField.sendKeys(city);
        return this;
    }

    public DemoblazeCartPage typeCardNumber(String cardNumber) {
        cardField.sendKeys(cardNumber);
        return this;
    }

    public DemoblazeCartPage typeMonth(String month) {
        monthField.sendKeys(month);
        return this;
    }

    public DemoblazeCartPage typeYear(String year) {
        yearField.sendKeys(year);
        return this;
    }

    public DemoblazeCartPage clickPurchaseButton() {
        purchaseBtn.click();
        return this;
    }

    public DemoblazeCartPage checkSuccessPurchase() {
        successPurchaseText.shouldBe(visible);
        return this;
    }


}
