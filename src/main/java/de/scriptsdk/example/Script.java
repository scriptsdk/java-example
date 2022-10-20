package de.scriptsdk.example;

import de.scriptsdk.api.model.network.ApiClient;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Script {
    private final ApiClient client;

    public Script(){
        this.client = new ApiClient("localhost",47602);
    }

    public void execute(){
        // TODO : Your written code here
    }
}
