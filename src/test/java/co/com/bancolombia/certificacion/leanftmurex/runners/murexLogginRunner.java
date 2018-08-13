package co.com.bancolombia.certificacion.leanftmurex.runners;

import com.hp.lft.unittesting.UnitTestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/murexLoggin.feature",
        glue = "co.com.bancolombia.certificacion.leanftmurex.stepsdefinitions",
        snippets = SnippetType.UNDERSCORE)
public class murexLogginRunner extends UnitTestBase {


    @Override
    protected String getClassName() {
        return null;
    }

    @Override
    protected String getTestName() {
        return null;
    }
}
