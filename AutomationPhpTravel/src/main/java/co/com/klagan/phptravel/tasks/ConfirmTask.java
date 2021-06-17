package co.com.klagan.phptravel.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.klagan.phptravel.ui.ConfirmPage.BTN_CONFIRM;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfirmTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BTN_CONFIRM),
                Click.on(BTN_CONFIRM));
    }

    public static ConfirmTask confirm(){
        return instrumented(ConfirmTask.class);
    }
}
