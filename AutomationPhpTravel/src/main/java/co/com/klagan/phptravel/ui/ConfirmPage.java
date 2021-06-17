package co.com.klagan.phptravel.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmPage {

    public static final  Target BTN_CONFIRM  = Target.the("Confirm button").locatedBy("//*[@name='logged']");

    private ConfirmPage() {
        throw new IllegalStateException("Utility class");
    }
}
