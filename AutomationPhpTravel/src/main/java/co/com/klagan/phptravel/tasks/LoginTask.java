package co.com.klagan.phptravel.tasks;

import co.com.klagan.phptravel.interaction.CredentialsInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(Open.url("https://www.phptravels.net/login"));
     actor.attemptsTo(CredentialsInteraction.login());
    }


    public static LoginTask login() {
        return instrumented(LoginTask.class);
    }
}
