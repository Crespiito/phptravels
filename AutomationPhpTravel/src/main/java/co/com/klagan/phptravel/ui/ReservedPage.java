package co.com.klagan.phptravel.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ReservedPage {
    public static final Target TXT_SUCCESS_RESERVED = Target.the("pay on arrybal button").locatedBy("//*[contains(@class, 'success-box')]/div/h4");

    private ReservedPage() {
        throw new IllegalStateException("Utility class");
    }
}
