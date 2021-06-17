package co.com.klagan.phptravel.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.klagan.phptravel.ui.HomePage.BOOKING_OPTION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectHomeTask implements Task {

    private String travel;

    public SelectHomeTask(String option) {
        this.travel = option;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BOOKING_OPTION.of(travel)),
                Click.on(BOOKING_OPTION.of(travel))
                );


    }

    public static SelectHomeTask option(String travel){
        return instrumented(SelectHomeTask.class , travel);
    }
}
