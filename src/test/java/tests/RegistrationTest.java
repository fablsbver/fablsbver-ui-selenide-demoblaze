package tests;

import org.junit.jupiter.api.Test;
import main.pages.DemoblazeCartPage;
import main.pages.DemoblazeHomePage;
import main.pages.DemoblazeProductPage;

public class RegistrationTest extends BaseTest {

    @Test
    public void makePurchase() {
        DemoblazeHomePage demoblazeHomePage = new DemoblazeHomePage();
        demoblazeHomePage
                .clickOnSignInButton()
                .typeSignInUsername("ertyppplllllew")
                .typeSignInPassword("567")
                .clickOnSignUpButton()
                .clickOnLogInButton()
                .typeLogInUsername("ertyppplllllew")
                .typeLogInPassword("567")
                .clickOnLogInConfirmButton();
        DemoblazeProductPage demoblazeProductPage = new DemoblazeHomePage().chooseProduct();
        demoblazeProductPage.addProductToCart();
        demoblazeProductPage.goToCart();
        DemoblazeCartPage demoblazeCartPage = new DemoblazeCartPage();
        demoblazeCartPage.clickPlaceOrder()
                .typeName("yyyy")
                .typeCountry("eee")
                .typeCity("ttt")
                .typeCardNumber("123")
                .typeMonth("kkk")
                .typeYear("567")
                .clickPurchaseButton()
                .checkSuccessPurchase();

    }
}
