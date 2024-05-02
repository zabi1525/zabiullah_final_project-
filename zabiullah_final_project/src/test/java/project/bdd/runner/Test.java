package project.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "project.bdd.steps",
        dryRun = false,
        plugin = {
        "pretty",
        "html:target/test_report/passed_login_test/report.html",
        "json:target/jsonReports/report.json"
}

)
public class Test {
}
