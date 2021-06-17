package co.com.klagan.phptravel.tasks;

import co.com.klagan.phptravel.interaction.PayOnArrybalINteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PayTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(PayOnArrybalINteraction.pay());
    }

    public static PayTask pay(){
        return instrumented(PayTask.class);
    }
}
