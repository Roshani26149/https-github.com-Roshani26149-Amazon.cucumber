package RunTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features\\log.feature",glue= {"StepDefina"}
,monochrome=true,
plugin={"pretty" , "html:target/html/htmlreport.html","json:target/json/file.json"})
public class TEST {

}
