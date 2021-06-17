package co.com.klagan.phptravel.steps.hooks;

import co.com.klagan.phptravel.tasks.LoginTask;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class Hooks {

    @Before()
    public void loginInPage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Diego").attemptsTo(LoginTask.login());
    }
}
