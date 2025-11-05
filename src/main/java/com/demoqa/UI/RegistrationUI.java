package com.demoqa.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationUI {

    public static final Target TXT_FNAME = Target.the("Text first name")
            .located(By.id("firstName"));
    public static final Target TXT_LNAME = Target.the("Text last name")
            .located(By.id("lastName"));
    public static final Target TXT_EMAIL = Target.the("Text email")
            .located(By.id("userEmail"));
    public static final Target RBTN_GENDER = Target.the("Radio button gender 3=Other")
            .located(By.xpath  ("//label[contains(text(), 'Other')]"));
    public static final Target NUM_MOBILE = Target.the("Mobile Number")
            .located(By.id("userNumber"));
    public static final Target DATE_BIRTH = Target.the("Date of Birth")
            .located(By.id("dateOfBirthInput"));
    public static final Target DATE_BIRTH1 = Target.the("Date of Birth")
            .located(By.xpath("//*[contains(@aria-label, 'Choose Saturday, January 17th, 2025')]"));  //.id("dateOfBirthInput"));

    public static final Target TXT_SUBJECTS_FORM = Target.the("Text Subjects")
            .located(By.id("subjectsContainer"));
    public static final Target CHK_HOBBIES = Target.the("Check box Hobbies")
            .located(By.id("hobbies-checkbox-3"));
    public static final Target UPL_PIC = Target.the("Select picture")
            .located(By.id("uploadPicture"));
    public static final Target TXT_ADDRESSS = Target.the("Current Address")
            .located(By.id("currentAddress"));
//*[@id="state"]/div
public static final Target BTN_SUBMIT = Target.the("Button submit")
        .located(By.id("submit"));


}
// https://gemini.google.com/app/ee1796c3faa88fdf?hl=es