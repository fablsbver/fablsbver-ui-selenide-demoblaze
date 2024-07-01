package main.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DemoblazeProductPage {

    private final SelenideElement addToCard = $(byText("Add to cart"));
    private final SelenideElement cartBtn = $(byId("cartur"));

    public DemoblazeProductPage addProductToCart(){
        addToCard.click();
        return this;
    }

    public DemoblazeCartPage goToCart(){
        cartBtn.click();
        return new DemoblazeCartPage();
    }
}
