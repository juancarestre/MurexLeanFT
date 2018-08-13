package co.com.bancolombia.certificacion.leanftmurex;

import java.io.IOException;

public class MurexClient {

    private String ClientPath;

    public MurexClient(String ClientPath) {
        this.ClientPath=ClientPath;
    }


    public void startClient() throws InterruptedException, IOException {
        Process murexclient=null;
        Runtime rt=Runtime.getRuntime();
        murexclient=rt.exec(this.ClientPath);
        murexclient.waitFor();
    }
}
