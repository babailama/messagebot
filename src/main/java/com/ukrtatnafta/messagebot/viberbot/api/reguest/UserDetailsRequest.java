package com.ukrtatnafta.messagebot.viberbot.api.reguest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ukrtatnafta.messagebot.viberbot.api.data.MessageBotDataObjectInterface;

/**
 * Created by Администратор on 24.11.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDetailsRequest implements MessageBotDataObjectInterface {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
