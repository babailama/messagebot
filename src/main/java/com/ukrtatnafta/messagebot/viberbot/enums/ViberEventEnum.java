package com.ukrtatnafta.messagebot.viberbot.enums;

/**
 * Created by ivanov-av on 23.11.2017.
 */
public enum ViberEventEnum {
    DELIVERED("delivered"),
    SEEN("seen"),
    FAILED("failed"),
    SUBSCRIBED("subscribed"),
    UNSUBSCRIBED("unsubscribed"),
    CONVERSATION_STARTED("conversation_started");

    String name;


    ViberEventEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name();
    }


}
