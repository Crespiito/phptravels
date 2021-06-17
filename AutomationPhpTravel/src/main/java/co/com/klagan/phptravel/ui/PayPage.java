package co.com.klagan.phptravel.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PayPage {
    public static final  Target BTN_PAY_ON_ARRIVAL  = Target.the("pay on arrybal button").locatedBy("//*[contains(@class, 'arrivalpay')]");

    private PayPage() {
        throw new IllegalStateException("Utility class");
    }
}
