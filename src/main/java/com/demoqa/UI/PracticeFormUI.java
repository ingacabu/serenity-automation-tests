package com.demoqa.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PracticeFormUI {
    public static final Target SELECT_FORMS = Target.the("Select form")
            .located(By.xpath("//h5[contains(text(), 'Forms')]"));

    public static final Target SELECT_PRACTICE_FORM = Target.the("Select form")
            .located(By.xpath("//span[contains(text(), 'Practice Form')]"));

}
//li[@id="item-0"]/span
//*[@id="subjectsContainer"]/div/div[1]