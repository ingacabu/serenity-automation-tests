package com.demoqa.tasks;

import com.demoqa.UI.PracticeFormUI;
import com.demoqa.UI.RegistrationUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PracticeFormTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PracticeFormUI.SELECT_FORMS),
                Click.on(PracticeFormUI.SELECT_FORMS),
                Click.on(PracticeFormUI.SELECT_PRACTICE_FORM)
        );
        /*
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         */
    }

    public static Performable practiceForm(){

        return instrumented(PracticeFormTask.class);
    }

}
