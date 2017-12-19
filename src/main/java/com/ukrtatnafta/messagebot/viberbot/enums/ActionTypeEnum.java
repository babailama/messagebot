package com.ukrtatnafta.messagebot.viberbot.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ivanov-av on 14.12.2017.
 */
public enum ActionTypeEnum {
    REPLY("reply"),
    OPEN_URL("open-url"),
    LOCATION_PICKER("location-picker"),
    SHARE_PHONE("share-phone"),
    NONE("none");

    private static final Map<String, ActionTypeEnum> lookup = new HashMap<>();

    static {
        for (ActionTypeEnum v : ActionTypeEnum.values()) {
            lookup.put(v.getName(), v);
        }
    }

    String name;

    ActionTypeEnum(String name) {
        this.name = name;
    }

    public static ActionTypeEnum get(String name) {
        return lookup.get(name);
    }

    public String getName() {
        return name;
    }

}
