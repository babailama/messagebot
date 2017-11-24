package com.ukrtatnafta.messagebot.viberbot.enums;

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
}
