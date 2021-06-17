package co.com.klagan.phptravel.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.klagan.phptravel.ui.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CredentialsInteraction implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("user@phptravels.com").into(USER_NAME),
                Enter.theValue("demouser").into(USER_PASS),
                Click.on(BTN_LOGIN),
                Click.on(BTN_HOME)
        );
    }

    public static CredentialsInteraction login() {
        return instrumented(CredentialsInteraction.class);
    }
}
