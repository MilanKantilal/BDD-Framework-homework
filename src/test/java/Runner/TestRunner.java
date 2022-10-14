package Runner;

import com.fasterxml.jackson.annotation.JsonFormat;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        //features means path of the feature file, where the feature file is located.
        features = "C:\\Users\\Milan\\IdeaProjects\\SimpleBDDFrameWork\\src\\test\\resources\\Features\\Register.feature",

        // glue word meaning is path of the stop definition file or folder name
        glue = {"StepDefinitions"},

        format ={"pretty","html:Report","json:json/cucumber.json","junit:junit/cucumber.xml"},

        dryRun =false,

        //monochrome = true

        strict= true // strict will fail the execution if there is undefined and pending steps,
        // and it will check any step is not defined in definition file.


)


public class TestRunner {
}
