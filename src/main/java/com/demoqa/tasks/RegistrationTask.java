package com.demoqa.tasks;

import com.demoqa.UI.RegistrationUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromBy;
import org.openqa.selenium.Keys;

import static com.demoqa.UI.RegistrationUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistrationTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TXT_FNAME),
                Enter.theValue("Jonny").into(TXT_FNAME),
                Click.on(RBTN_GENDER),
                Enter.theValue("354354354685545").into(NUM_MOBILE)
                //DoubleClick.on(DATE_BIRTH),
                //Click.on(DATE_BIRTH1),
                //Clear.field(DATE_BIRTH),
                //Hit.the(Keys.CONTROL).into(DATE_BIRTH),
                //Hit.the(Keys.DELETE).into(DATE_BIRTH),
                //Enter.theValue("20 Feb 1991").into(DATE_BIRTH)


        );

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static Performable RegistrationForm(){
        return instrumented(RegistrationTask.class);
    }

}