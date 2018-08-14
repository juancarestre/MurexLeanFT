package co.com.bancolombia.certificacion.leanftmurex;

import java.util.ArrayList;

public class Use {

    private MurexAppModel.inQA3 app;

    public Use(MurexAppModel.inQA3 murex) {
        this.app=murex;
    }

    public MurexAppModel.inQA3 getApp() {
        return app;
    }

    public static Use app(MurexAppModel.inQA3 murex) {
        return new Use(murex);
    }

    public static ArrayList<String> setCredentials(String user, String password) {
        ArrayList<String> credentials = new ArrayList<>();
        credentials.add(user);
        credentials.add(password);
        return credentials;


    }

}
