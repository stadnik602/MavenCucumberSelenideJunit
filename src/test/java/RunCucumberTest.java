import org.junit.runner.RunWith;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME;

//@RunWith(Cucumber.class)
//@CucumberOptions(plugin = "pretty, junit:target/cucumber-reports/Cucumber.xml, io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm", features = "src/test/resources/features")
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "steps")
public class RunCucumberTest {

}
