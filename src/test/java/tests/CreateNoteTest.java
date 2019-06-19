package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import steps.ANotePageSteps;


public class CreateNoteTest {

    ANotePageSteps aNotePageSteps = new ANotePageSteps();


    @Test
    public void testConcatenate() {
        aNotePageSteps.timeOut();
        aNotePageSteps.navigateToPage();
        aNotePageSteps.fillInField();
        aNotePageSteps.saveButtonClick();
        aNotePageSteps.warning();
        aNotePageSteps.deleteButton();
        aNotePageSteps.noAnyNote();
        aNotePageSteps.driverQuit();


    }

}
