package co.com.bancolombia.certificacion.leanftmurex.stepsdefinitions;

import co.com.bancolombia.certificacion.leanftmurex.Actor;
import co.com.bancolombia.certificacion.leanftmurex.MurexAppModel;
import co.com.bancolombia.certificacion.leanftmurex.MurexClient;
import co.com.bancolombia.certificacion.leanftmurex.Use;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.ModifiableSDKConfiguration;
import com.hp.lft.sdk.SDK;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static co.com.bancolombia.certificacion.leanftmurex.Use.setCredentials;


public class murexLogginStepDefinitions {

    MurexAppModel murexLoggin;
    MurexClient murexClient;
    MurexAppModel.inQA3 Murex;
    Actor Juan;

    @Before
    public void murex_client_setup() throws Exception {
        SDK.init(new ModifiableSDKConfiguration());
        murexLoggin = new MurexAppModel();
        Juan=Actor.named("Juan");
        Juan.start(murexClient);
        while (murexLoggin.InitialWindow().exists(1)) { }
        Murex = murexLoggin.inQA3();

    }

    @Given("^The Murex java cliente is already open$")
    public void the_Murex_java_cliente_is_already_open() throws GeneralLeanFtException {
        Juan.isAbleTo(Use.app(Murex));
    }


    @When("^I set my \"([^\"]*)\" and my \"([^\"]*)\"$")
    public void i_set_my_and_my(String User, String Password) throws Throwable {

        Juan.attemptsTo(setCredentials(User,Password));
        Murex.SignInButton().click();

        //Murex.UsernameEditor().sendKeys(User);
        //Murex.PasswordEditor().sendKeys(Password);
        //Murex.SignInButton().click();

    }

    @Then("^I should get logged and see the Murex group list$")
    public void i_should_get_logged_and_see_the_Murex_group_list() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
