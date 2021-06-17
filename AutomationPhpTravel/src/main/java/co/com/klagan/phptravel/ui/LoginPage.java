package co.com.klagan.phptravel.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final  Target USER_NAME  = Target.the("User name input").locatedBy("//*[@name='username']");
    public static final  Target USER_PASS = Target.the("password input").locatedBy("//*[@name='password']");
    public static final  Target BTN_LOGIN = Target.the("btn login").locatedBy("//*[contains(@class, 'loginbtn')]");
    public static final  Target BTN_HOME = Target.the("btn home").locatedBy("//*[@title='home']");

    private LoginPage() {
        throw new IllegalStateException("Utility class");
    }
}
