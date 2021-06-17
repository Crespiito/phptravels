package co.com.klagan.phptravel.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    private HomePage() {
        throw new IllegalStateException("Utility class");
    }

    public static final Target BOOKING_OPTION = Target.the("a booking option").locatedBy("//*[contains(@href,'{0}')]");
}
