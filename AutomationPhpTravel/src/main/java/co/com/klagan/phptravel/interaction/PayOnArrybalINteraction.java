package co.com.klagan.phptravel.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import org.openqa.selenium.support.ui.ExpectedConditions;

import static co.com.klagan.phptravel.ui.PayPage.BTN_PAY_ON_ARRIVAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class PayOnArrybalINteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        BTN_PAY_ON_ARRIVAL.resolveFor(actor).click();
        BrowseTheWeb.as(actor).waitFor(ExpectedConditions.alertIsPresent());
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
    }

    public static PayOnArrybalINteraction pay(){
        return instrumented(PayOnArrybalINteraction.class);
    }
}
