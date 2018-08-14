package co.com.bancolombia.certificacion.leanftmurex.stepsdefinitions;

import co.com.bancolombia.certificacion.leanftmurex.Actor;
import co.com.bancolombia.certificacion.leanftmurex.MurexAppModel;
import co.com.bancolombia.certificacion.leanftmurex.MurexClient;
import co.com.bancolombia.certificacion.leanftmurex.Use;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.java.*;
import com.hp.lft.sdk.te.Keys;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static co.com.bancolombia.certificacion.leanftmurex.Use.setCredentials;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class murexLogginStepDefinitions {

    MurexAppModel murexLoggin;
    MurexClient murexClient;
    MurexAppModel.inQA3 Murex;
    Actor Juan;

    @Before("@First")
    public void murex_client_setup() throws Exception {
        SDK.init(new ModifiableSDKConfiguration());
        murexLoggin = new MurexAppModel();
        Juan=Actor.named("Juan");
        Juan.start(murexClient);
        while (murexLoggin.InitialWindow().exists(2)) { }
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
        assertTrue(Murex.GroupDetailsPanelUiObject().exists());
    }



    @Given("^The Murex java cliente is already logged$")
    public void the_Murex_java_cliente_is_already_logged() throws Throwable {
        murexLoggin = new MurexAppModel();
        Murex = murexLoggin.inQA3();
    }

    @When("^I enter to \"([^\"]*)\"$")
    public void i_enter_to(String group) throws Throwable {
        Murex.GroupDetailsPanelUiObject().describe(Label.class,new LabelDescription.Builder().label(group).build()).doubleClick();
    }

    @Then("^I should see the initial murex page logged as \"([^\"]*)\"$")
    public void i_should_see_the_initial_murex_page_on(String user) throws Throwable {
        assertEquals(Murex.UserLoggedAs().getAttachedText(),user);
        }


    @Given("^Im in the TradeQuery page$")
    public void im_in_the_TradeQuery_page() throws Throwable {
        murexLoggin = new MurexAppModel();
        Murex = murexLoggin.inQA3();
        Murex.MurexSearchBar().sendKeys("Trade query");
        Thread.sleep(1000);
        Keyboard.pressKey((byte) 28);

        while ( !Desktop.describe(Window.class, new WindowDescription.Builder()
                .title(new RegExpProperty(" .*USER1>")).build()).describe(InternalFrame.class, new InternalFrameDescription.Builder()
                .title("").nativeClass("murex.ui.applications.mdi.MModalInternalFrame").index(1).build()).describe(UiObject.class, new UiObjectDescription.Builder()
                .nativeClass("murex.ui.swing.label.ShadowedLabel").index(0).build()).isVisible() ) {
        }

    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String arg1) throws Throwable {

        Desktop.describe(Window.class, new WindowDescription.Builder()
                .title(new RegExpProperty(" .*USER1>")).build()).describe(InternalFrame.class, new InternalFrameDescription.Builder()
                .title("").nativeClass("murex.ui.applications.mdi.MModalInternalFrame").index(1).build()).describe(UiObject.class, new UiObjectDescription.Builder()
                .nativeClass("murex.ui.swing.label.ShadowedLabel").index(0).build()).doubleClick();
    }



    @Then("^I see the trade with \"([^\"]*)\" id$")
    public void i_see_the_trade_with_id(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
