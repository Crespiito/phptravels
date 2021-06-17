package co.com.klagan.phptravel.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.klagan.phptravel.ui.BookingOptionsPage.BTN_BOOKING_NOW;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BookingTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BTN_BOOKING_NOW),
                Click.on(BTN_BOOKING_NOW));
    }

    public static BookingTask bookingNow(){
        return instrumented(BookingTask.class);
    }
}
