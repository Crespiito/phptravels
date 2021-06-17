package co.com.klagan.phptravel.ui;

import net.serenitybdd.screenplay.targets.Target;

public class  BookingOptionsPage {

    public static final Target BTN_BOOKING_NOW = Target.the("booking now button").locatedBy("//*[contains(@class, 'loader') and contains(@class, 'secondary')]");

    private BookingOptionsPage() {
        throw new IllegalStateException("Utility class");
    }
}
