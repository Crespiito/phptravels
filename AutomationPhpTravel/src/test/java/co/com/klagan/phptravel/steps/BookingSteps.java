package co.com.klagan.phptravel.steps;

import co.com.klagan.phptravel.question.ReservedQuestion;
import co.com.klagan.phptravel.tasks.BookingTask;
import co.com.klagan.phptravel.tasks.ConfirmTask;
import co.com.klagan.phptravel.tasks.PayTask;
import co.com.klagan.phptravel.tasks.SelectHomeTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class BookingSteps {

    @Given("that a user chose {} option from the home page")
    public void thatAUserChoseAOptionFromTheHomePage(String option) {
        theActorInTheSpotlight().attemptsTo(SelectHomeTask.option(option));
    }

    @Given("select the option booking now")
    public void selectTheOptionBookingNow() {
        theActorInTheSpotlight().attemptsTo(BookingTask.bookingNow());
    }

    @Given("confirm the booking")
    public void confirmTheBooking() {
        theActorInTheSpotlight().attemptsTo(ConfirmTask.confirm());

    }

    @When("select the option to pay in arrived")
    public void selectTheOptionToPayInArrived() {
        theActorInTheSpotlight().attemptsTo(PayTask.pay());
    }

    @Then("can see the corrrectly status is {}")
    public void canSeeTheCorrrectlyStatusIsReserved(String status) {
        theActorInTheSpotlight().should(seeThat(ReservedQuestion.status(),equalTo(status)));
    }
}
