package co.com.klagan.phptravel.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.klagan.phptravel.ui.ReservedPage.TXT_SUCCESS_RESERVED;

public class ReservedQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TXT_SUCCESS_RESERVED.resolveFor(actor).getText();
    }

    public static Question<String> status(){
        return new ReservedQuestion();
    }
}
