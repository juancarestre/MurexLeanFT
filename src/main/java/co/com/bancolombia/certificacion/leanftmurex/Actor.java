package co.com.bancolombia.certificacion.leanftmurex;

import com.hp.lft.sdk.GeneralLeanFtException;

import java.io.IOException;
import java.util.ArrayList;

public class Actor {
    String Name;
    MurexAppModel.inQA3 app;

    public static Actor named(String name) {
        return new Actor(name);
    }

    public Actor(String name) {
    }

    public void start(MurexClient murexClient) throws IOException, InterruptedException {
        murexClient=new MurexClient("C:\\Users\\juan.restrepo\\javaworkspace\\projectleanftjunit\\src\\openmurex.cmd");
        murexClient.startClient();
    }

    public void isAbleTo(Use app) throws GeneralLeanFtException {
        this.app=app.getApp();
    }

    public void attemptsTo(ArrayList<String> credentials) throws GeneralLeanFtException {
        this.app.UsernameEditor().sendKeys(credentials.get(0));
        this.app.PasswordEditor().sendKeys(credentials.get(1));
    }
}
