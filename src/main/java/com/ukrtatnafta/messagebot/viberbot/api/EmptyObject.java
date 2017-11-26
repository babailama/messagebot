package com.ukrtatnafta.messagebot.viberbot.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ukrtatnafta.messagebot.viberbot.api.data.MessageBotDataObjectInterface;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmptyObject implements MessageBotDataObjectInterface {
    public EmptyObject() {
    }
}
