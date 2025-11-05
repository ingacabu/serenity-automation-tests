package com.demoqa.stepDefinitions;

import com.demoqa.tasks.PracticeFormTask;
import com.demoqa.tasks.RegistrationTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;
//import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class PreacticeFormStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Given("that the user open the demoQA play and select forms")
    public void thatTheUserOpenTheDemoQAPlayAndSelectForms() {
        theActorCalled("Natalia").wasAbleTo(
                Open.url("https://demoqa.com/")
        );

    }
    @When("the user fill the form and send")
    public void theUserFillTheFormAndSend() {
        theActorInTheSpotlight().attemptsTo(
                PracticeFormTask.practiceForm(),
                RegistrationTask.RegistrationForm()
        );
    }
    @Then("the user could view the information")
    public void theUserCouldViewTheInformation() {

    }

}
