package com.ukrtatnafta.messagebot.viberbot.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ivanov-av on 23.11.2017.
 */
public enum  MessageTypeEnum {
    TEXT("text"),
    PICTURE("picture"),
    VIDEO("video"),
    FILE("file"),
    LOCATION("location"),
    CONTACT("contact"),
    STICKER("sticker"),
    CAROUSELCONTENT("rich_media"),
    URL("url");

    String name;

    MessageTypeEnum(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    private static final Map<String, MessageTypeEnum> lookup = new HashMap<>();

    static {
        for (MessageTypeEnum v : MessageTypeEnum.values()) {
            lookup.put(v.getName(), v);
        }
    }

    public static MessageTypeEnum get(String name) {
        return lookup.get(name);
    }

}
